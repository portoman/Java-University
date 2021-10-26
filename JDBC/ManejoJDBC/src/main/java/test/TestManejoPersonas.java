package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao=new PersonaDAO();
        
       
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
    
    //Insertando un nuevo objeto de tipo persona
    
//    Persona persona3=new Persona("Alfonso", "Porto", "portbuj@yahoo.es", "620771628");
//    
//        System.out.println(personaDao.insertar(persona3));
//    
//     personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
     
     //Modificar un objeto persona existente
//     Persona persona3=new Persona(7,"Alfonso", "Porto", "putoAmo", "620771628");
//     Persona persona4=new Persona(8,"Alfonso", "Porto", "crack", "guapo");
//     personaDao.actualizar(persona3);
//      personaDao.actualizar(persona4);
      
      Persona persona8=new Persona(5);
      Persona persona9=new Persona(6);
      Persona persona10=new Persona(8);
      Persona persona11=new Persona(9);
      Persona persona12=new Persona(10);
      Persona persona13=new Persona(11);
      
      personaDao.eliminar(persona8);
      personaDao.eliminar(persona9);
      personaDao.eliminar(persona10);
      personaDao.eliminar(persona11);
      personaDao.eliminar(persona12);
      personaDao.eliminar(persona13);
      
      Persona persona14=new Persona("Alfonso", "Porto", "putoamo", "el mejor");
      personaDao.insertar(persona14);
      
       List <Persona> personas=personaDao.seleccionar();
       
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
    
}
