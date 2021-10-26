package aritmetica;

import excepciones.*;

public class Aritmetica {
    
    public static int division(int numerador, int denominador)
            throws OperacionExcepcion {
        
        if (denominador==0){
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador/denominador;
    }
    
    public static int divisionRuntime(int numerador, int denominador)
            {
        
        if (denominador==0){
            throw new OperacionExcepcionRuntime("Division entre cero NOK desde RuntimeException");
        }
        return numerador/denominador;
    }
}
