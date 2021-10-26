package test;

import domain.Empleado;
import java.util.logging.Logger;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado("Juan", 5000);
        Empleado empleado2=new Empleado("Juan", 500);
        
        if (empleado1==empleado2){
            System.out.println("Empleados tienen la misma referencia");
        }
        else {System.out.println("Empleados tienen diferente referencia");
        }
        
        
        if (empleado1.equals(empleado2)){
            System.out.println("Empleados tienen el mismo contenido");
          }
        else{System.out.println("Empleados tienen diferente contenido");
        }
        
        String casa="casa";
        String casa1="casa";
        
        if (casa==casa1){
            System.out.println("Casas tienen la misma referencia");
        }
        else{System.out.println("Casas tienen diferente referencia");
        
        }
        
        System.out.println(casa.equals(casa1));
        
        System.out.println(casa1.hashCode());
        System.out.println(empleado1.hashCode());
        
       
    }
    
}
