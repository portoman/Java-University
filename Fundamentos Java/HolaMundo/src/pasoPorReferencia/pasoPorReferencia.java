/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoPorReferencia;

import clases.Persona;

/**
 *
 * @author Alfonso
 */
public class pasoPorReferencia {
    
    public static void main(String[] args) {
        Persona persona1=new Persona();
//        persona1=null;
        persona1.nombre="Juan";
        
        persona1.despegarInfo();
        cambiarNombre(persona1);
        persona1.despegarInfo();
        
        Persona persona2;
        persona2=persona1;
        
        persona2.despegarInfo();
    }

    public static void cambiarNombre(Persona persona){
        
        persona.nombre="Pablo";
       
    }
}
