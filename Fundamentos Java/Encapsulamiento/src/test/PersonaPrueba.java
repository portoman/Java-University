/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Persona;

/**
 *
 * @author Alfonso
 */
public class PersonaPrueba {
    
    public static void main(String[] args) {
        
    
    Persona persona1=new Persona("Paco", 10_000,true);
    
        System.out.println("Nombre persona1: "+persona1.getNombre());
        
        persona1.setNombre("Pedro");
        
        System.out.println("Nombre persona1: "+persona1.getNombre());
        
        Persona persona2=new Persona("Sandra", 445.5, false);
        
        persona2.imprimir();
        
        persona2.setSueldo(22);
        
        persona2.imprimir();
        
        System.out.println(persona2.toString());
    }
    
}
