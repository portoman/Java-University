/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author portb
 */
public  class Persona {
    
    public final static int MI_CONSTANTE=1;
    
    private String nombre;
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public  void imprimir(){
        
        System.out.println("Metodo imprimir");
        
    }

   
    
}
