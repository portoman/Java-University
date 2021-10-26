/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathis;

/**
 *
 * @author Alfonso
 */
public class PalabraThis {
    
    
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", "Gomez");
        System.out.println("persona1 = " + persona1);
        String a = new String("P");
        String b = new String("P");

        Persona persona2 = new Persona("", "");
//        persona2=persona1;

        System.out.println("persona2 = " + persona2);
        
        
        
    }
    
          
}

class Persona{
    
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        super();
        System.out.println("Se crea objeto");
        this.nombre=nombre;
        this.apellido=apellido;
        System.out.println(this);
        
        new Imprimir().imprimir(this);
        
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: "+persona);
        System.out.println("Impresion del objeto actual(this): "+this);
        
    }
}
