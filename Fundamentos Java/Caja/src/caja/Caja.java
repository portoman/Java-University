/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;


public class Caja {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    int ancho;
    int alto;
    int profundo;
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructores">
   public Caja(int ancho, int alto, int profundo){
       this.ancho=ancho;
       this.alto=alto; 
       this.profundo=profundo;
             
       
   }
    
    public Caja(){
       this(0,0,0);
    }
    
   
    
//</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Métodos">
    
    public void  calcularVolumen(){
        
        System.out.println(ancho*alto*profundo);
    }
    
//</editor-fold>
    
}
