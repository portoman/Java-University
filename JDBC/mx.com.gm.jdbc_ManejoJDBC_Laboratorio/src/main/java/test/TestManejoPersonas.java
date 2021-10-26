package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        // Insertando un nuevo objeto de tipo usuario
        Usuario usuario1 = new Usuario("Alfonso", "12345");
        Usuario usuario2 = new Usuario("Porto", "54312");
        Usuario usuario3 = new Usuario("Bujia", "12987");

//        usuarioDao.insertar(usuario1);
//        usuarioDao.insertar(usuario2);
//        usuarioDao.insertar(usuario3);


//        Usuario usuario4 = new Usuario(1);
//        Usuario usuario5 = new Usuario(2);
//        Usuario usuario6 = new Usuario(3);
//
//        usuarioDao.eliminar(usuario4);
//        usuarioDao.eliminar(usuario5);
//        usuarioDao.eliminar(usuario6);
        
        
     

        //Modificar un objeto usuario
//     Usuario usuario4=new Usuario(10,"Alfonso", "PP88");
//     Persona persona4=new Persona(8,"Alfonso", "Porto", "crack", "guapo");
//     personaDao.actualizar(persona3);
//      personaDao.actualizar(persona4);
//    usuarioDao.actualizar(usuario4);
    List<Usuario> usuarios = usuarioDao.seleccionar();
    usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });
//      Persona persona8=new Persona(5);
//      Persona persona9=new Persona(6);
//      Persona persona10=new Persona(8);
//      Persona persona11=new Persona(9);
//      Persona persona12=new Persona(10);
//      Persona persona13=new Persona(11);
//      
//      personaDao.eliminar(persona8);
//      personaDao.eliminar(persona9);
//      personaDao.eliminar(persona10);
//      personaDao.eliminar(persona11);
//      personaDao.eliminar(persona12);
//      personaDao.eliminar(persona13);
//      
//      Persona persona14=new Persona("Alfonso", "Porto", "putoamo", "el mejor");
//      personaDao.insertar(persona14);
//      
//       List <Persona> personas=personaDao.seleccionar();
//       
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
    }

}
