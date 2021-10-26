package test;

import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {

        int edades[] = {5, 6, 8, 9};

        for (int edad : edades) {

            System.out.printf("edad = %d \n", edad);
            System.out.println(String.format("edad = %d", edad));
        }

        Persona persona1=new Persona("Pablo");
        Persona persona2=new Persona("Pedro");
        Persona persona3=new Persona("Paula");
        
         
        Persona personas[]={persona1,persona2,persona3};
        
        for(Object nombre: personas){
            System.out.println("La persona es = " + nombre);
        }
    }
}
