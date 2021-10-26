package test;

import personas.jdbc.*;
import personas.dto.*;
import java.sql.*;
import java.util.List;


public class TestManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDao personaDao = new PersonaDaoJDBC(conexion);
            
            PersonaDTO persona1=new PersonaDTO(1, "Alfonso", "Porto");
            personaDao.insert(persona1);
            
            List<PersonaDTO> personas = personaDao.select();

            for (PersonaDTO persona : personas) {

                System.out.println("Persona DTO= " + persona);
            }

            conexion.commit();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al roll back");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}
