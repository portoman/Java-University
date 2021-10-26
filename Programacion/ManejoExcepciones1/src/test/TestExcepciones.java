package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        
//<editor-fold defaultstate="collapsed" desc="Excepción estándar">
        int resultado = 0;
        try {
            resultado = 10 / 0;
        } catch (Exception e) {
            System.out.println("Ocurrió un error: ");
            e.printStackTrace(System.out);
        };

        System.out.println("resultado = " + resultado);
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Excepción compleja">
        /*Try catch con varios each (El primer each siempre es dese clase con menos jerarquía
        y un finally(el finally se hace siempre*/
        try {
            resultado = Aritmetica.division(10, 0);

        } catch (OperacionExcepcion a) {
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            //a.printStackTrace(System.out);
            System.out.println(a.getMessage());
        } catch (Exception a) {
            System.out.println("Ocurrió un error de tipo Exception");
            //a.printStackTrace(System.out);
            System.out.println(a.getMessage());
        } finally {
            System.out.println("Se revisó la división entre cero");
        }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Excepción en Runtime">
        resultado = Aritmetica.divisionRuntime(10, 0);

//</editor-fold>
    }

}
