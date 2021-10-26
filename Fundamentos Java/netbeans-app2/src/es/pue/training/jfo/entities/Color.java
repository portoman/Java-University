//Declaración del package
package es.pue.training.jfo.entities;


//Declaración de la clase
//Fully Qualified Class Name: es.pue.training.jfo.entities.Color
public class Color {

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">
    private String name;
    private int red;
    private int green;
    private int blue;
    
    public static final int MAX_VALUE = 255;
    public static final int MIN_VALUE = 0;
    private static int contador=0;
    public static final String DEFAULT_NAME="Undefined";
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    
    //<editor-fold defaultstate="collapsed" desc="Inicializar estático">
    static{
        
        System.out.println("***************************");
        System.out.println("Color.class >Se carga");
        System.out.println("***************************");
    }
    
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Color(String name, int red, int green, int blue) {
        //------------------------->[]name: null | red: 0 | green: 0 | blue: 0
        //Inicializar el estado del objeto
        contador++;
        this.name = name;
        this.red = red;
        this.green = green;
        this.blue = blue;
         
        
        
    }
    
    public Color(int red, int green, int blue) {
        this(DEFAULT_NAME, red, green, blue);
    }
    
    public Color() {
        this(DEFAULT_NAME, MIN_VALUE, MIN_VALUE, MIN_VALUE);
    }
    
    public static int getContador(){
        return contador;
    }
    
    public static Color random(){
        return new Color(0,0,0);
    }
    
    public static int fromHex(String n){
     
        return 0;
    }
    //</editor-fold>
    
    //</editor-fold>

}
