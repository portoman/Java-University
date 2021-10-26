
package test;

import domain.*;



public class TestCasting {
    public static void main(String[] args) {
     
        Empleado empleado;
        
        empleado=new Empleado("Juan",5000);
        //System.out.println(empleado.obtenerDetalles());//Como empleado apunta a clase padre, ejecuta método clase padre
        
        empleado=new Escritor("Pablo", 411, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        System.out.println(empleado.obtenerDetalles());//Como empleado apunta a clase hija, ejecuta método clase hija
        
        //Downcasting
       //((Escritor)empleado).getTipoEscritura();
       
       Escritor escritor = (Escritor) empleado;
       escritor.getTipoEscritura();
       
       //Upcasting (No es necesario poner el () con la clase)
       //Empleado empleado2=(Empleado)escritor;
       Empleado empleado2=escritor;
       
        System.out.println("empleado2 = " + empleado2);
       
       
    }
    
}

 
