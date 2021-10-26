package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoUsuarios {

    public static void main(String[] args) {

          Connection conexion = null;
        try {
             conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            Usuario usuario=new Usuario(10,"Alfonso", "Putoamo");
            
            usuarioDao.actualizar(usuario);
            
           // Usuario usuario1=new Usuario("Pablo", "Pito");
            
           // usuarioDao.insertar(usuario1);
            
            conexion.commit();
           
            Usuario usuario4=new Usuario(16);
            Usuario usuario5=new Usuario(15);
            Usuario usuario6=new Usuario(14);
            
            usuarioDao.eliminar(usuario4);usuarioDao.eliminar(usuario5);usuarioDao.eliminar(usuario6);
             List <Usuario> usuarios=usuarioDao.seleccionar();
            
            
            usuarios.forEach(usuario7->{
                System.out.println("usuario = " + usuario7);
            });
                    
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
