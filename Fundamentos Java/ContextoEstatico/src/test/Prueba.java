/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import domain.*;
/**
 *
 * @author Alfonso
 */
public class Prueba {
    
     
    
    public static void main(String[] args) {
        
        
        Persona persona1=new Persona("Juan");
        System.out.println(persona1.toString());
        
        persona1.setNombre("Pablo");
        System.out.println(persona1.toString());
        
        System.out.println("persona1 = " + persona1);
        
        Persona persona2=new Persona("Pedro");
        System.out.println("persona2 = " + persona2);
        
        Prueba.imprimir(persona1);
        Prueba.imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){
        
        System.out.println("persona = " + persona);
    }
}
