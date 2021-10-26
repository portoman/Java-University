/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author portb
 */
public class TestMatrices {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
    
    int edades[][] = new int[4][2];

    
    edades[0][0] = 1;
    edades[0][1] = 2;
    edades[1][0] = 3;
    edades[1][1] = 4;
    edades[2][0] = 5;
    edades[2][1] = 6;
    edades[3][0] = 7;
    edades[3][1] = 8;
    
    
        for (int i = 0; i < edades.length; i++) {
            for(int j=0; j<edades[i].length; j++){
                System.out.println(edades[i][j]);
            }
            System.out.println("cambio de fila");    
        }
        
        
        String frutas [][]= {{"Naranja", "Limón"},{"Fresa", "Zarzamora"},{"Pera","Manzana"}};
       
        
        for ( int i = 0; i < frutas.length; i++) {
         for( int j=0; j<frutas[i].length; j++){
               
            System.out.printf("La fruta en la fila %d y columna %d es %s \n", i, j, frutas[i][j]);    
        }
        }
        
        
        Persona personas[][]= new Persona[2][3];
        
        personas[0][0]=new Persona("Juan");
        personas[0][1]=new Persona("Pedro"); 
        personas[0][2]=new Persona("Paco"); 
        personas[1][0]=new Persona("Lurdes"); 
        personas[1][1]=new Persona("Rosa"); 
        personas[1][2]=new Persona("Paula"); 
           
        
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.printf("La persona en la fila %d y columna %d es %s \n", i, j, personas[i][j]);   
            }
        }
        
        imprimir (frutas);
        imprimir(personas);
        
       
}
    
    public static void imprimir(Object matriz[][]){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("La %s en la fila %d y columna %d es %s \n","matriz", i, j, matriz[i][j]);
        
    }
}
    }
}