/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Empleado;
import domain.Persona;

/**
 *
 * @author portb
 */
public class TestFinal {
    public static void main(String[] args) {
        
        final int miVarible=10;
        
        System.out.println("miVarible = " + miVarible);
              
        //miVarible=5;
        Empleado empleado1=new Empleado();
        
        Persona persona1=new Persona();
        persona1.imprimir();
        empleado1.imprimir();
        
        System.out.println(String.format("Mi constante vale: %d", Persona.MI_CONSTANTE));
        
        final Persona persona2=new Persona();
        
        persona2.setNombre("Pablo");
        System.out.println("Nombre de la persona 2: "+persona2.getNombre());    

    }
}
