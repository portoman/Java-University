//Declaración del package
package es.pue.training.jfo.utilities;

//Declaración de la clase
//Fully Qualified Class Name: es.pue.training.jfo.utilities.MathUtils
public class MathUtils {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos/Campos estáticos">
    public static final double PI = 3.14_15_92_65_35_89_79_32_384D;
    public static final double E = 2.7182818284590452353d;
    public static final double PHI = (1 + Math.sqrt(5))/2;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructora privada">
    private MathUtils(){}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos/Operaciones estáticas">
    
    public static double abs(double op) {
        return (op < 0) ? -op : op;
    }
    
    public static boolean isEven(int op) {
        return op % 2 == 0;
    }
    
    public static boolean isOdd(int op) {
        return op % 2 != 0;
    }
    
    public static double max(double op1, double op2, double... ops) {
        var result = (op1 >= op2) ? op1 : op2;
        for(var op : ops) {
            result = (op >= result) ? op : result;
        }
        return result;
    }
    
    public static double min(double op1, double op2, double... ops) {
        var result = (op1 < op2) ? op1 : op2;
        for(var op : ops) {
            result = (op < result) ? op : result;
        }
        return result;
    }
    
    public static double average(double op1, double... ops) {
        var sum = op1;
        for(var op : ops) {
            sum += op;
        }
        return sum / (ops.length + 1);
    }
//</editor-fold>

}
