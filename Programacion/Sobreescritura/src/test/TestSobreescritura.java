
package test;

import domain.Empleado;
import domain.Gerente;


public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1=new Gerente("Lucas", 500, "Calidad");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        
        
        Empleado empleado=new Empleado("Juan", 400);
        System.out.println("Empleado1="+empleado.obtenerDetalles());
        imprimir(empleado);
        
        //La variable empleado puede apuntar sin problema a objetos instanciados padres(Empleado) o hijos(Gerente)
        empleado=new Gerente("Marcos", 999, "Sistemas");
        System.out.println("gerente2 = " + empleado.obtenerDetalles());
        imprimir(empleado);
    }
    
    public static void imprimir(Empleado empleado){
        String detalles=empleado.obtenerDetalles();
        System.out.println("empleado: "+detalles);
        
    }
    
}
