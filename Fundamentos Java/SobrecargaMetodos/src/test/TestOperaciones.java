
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    
    public static void main(String[] args) {
        var resultado= Operaciones.sumar(1, 2);
        System.out.println("resultado = " + resultado);
        Operaciones.sumar(1, 2, 3);
        
        Operaciones op1=new Operaciones();
        op1.sumar(1, 2, 3, 4);
    }
    
}
