package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos
        /*
        int-Integer
        long-Long
        float-Float
        double-Double
        boolean-Boolean
        char-Chatacter
        short-Short
        */
        
        int entero=10;
        //Autoboxing:
        Integer entero1=10;
        
        System.out.println("entero1 = " + entero1);
        System.out.println("entero1 = " + entero1.toString());
        System.out.println("entero1 double = " + entero1.doubleValue());
        
        //Unboxing:
        
        int entero2=entero1;
        
        System.out.println("entero2 = " + entero2);
    }
}
