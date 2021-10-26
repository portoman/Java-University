package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica claseGen=new ClaseGenerica("ff");
        
        claseGen.obtenerTipo();
        
        ClaseGenerica<Integer> objetoInt =new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Alfonso");
        objetoString.obtenerTipo();
        
    }
}
