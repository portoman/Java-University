
package test;

import domain.Empleado;
import domain.Gerente;


public class TestInstanceOf {
    public static void main(String[] args) {
         
        Empleado empleado=new Empleado("Juan", 400);
        determinarTipo(empleado);
        
        
        empleado=new Gerente("Marcos", 999, "Sistemas");
        determinarTipo(empleado);
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
          System.out.println("Es de tipo Gerente");
          Gerente gerente=(Gerente) empleado;
          System.out.println("gerente = "+gerente.getDepartamento());
          
    }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.obtenerDetalles());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    
    }
    
    
}
