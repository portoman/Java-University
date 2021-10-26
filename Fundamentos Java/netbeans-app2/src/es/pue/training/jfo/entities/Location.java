//Declaración del package
package es.pue.training.jfo.entities;


//Declaración de la clase
//Fully Qualified Class Name: es.pue.training.jfo.entities.Location
public class Location {

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">
    private double latitude;
    private double longitude;
    
    public static final double MAX_LATITUDE = 90.0;
    public static final double MIN_LATITUDE = -MAX_LATITUDE;
    public static final double MAX_LONGITUDE = 180.0;
    public static final double MIN_LONGITUDE = -MAX_LONGITUDE;
    private static int contador=0;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Location(double latitude, double longitude) {
        //---------------->[]latitude: 0.0 | longitude: 0.0
        //Inicializarel estado de este objeto
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public Location() {
        this(0.0, 0.0);
    }
    
    //</editor-fold>
    
    //</editor-fold>

}
