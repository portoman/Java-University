package test;

import java.sql.*;

public class TestMySqlJDBC {

    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC";//El video pedia incluir un texto más al final. Arrancando el programa ejecutaba una excepción. Eliminé el comentario y ejecutó
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) {
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: "+resultado.getNString("nombre"));
                System.out.print(" Apellido: "+resultado.getNString("apellido"));
                System.out.print(" Email: "+resultado.getNString("email"));
                System.out.print(" Teléfono: "+resultado.getNString("telefono"));
                System.out.println(" ");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
