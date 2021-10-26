
package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    
    //<editor-fold defaultstate="collapsed" desc="Bloques">
    
    //<editor-fold defaultstate="collapsed" desc="Bloque estático">
    
    //Bloque inicialización estático: Se ejecuta la primera vez que se ejecuta la clase
    static {
        
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas;
        //this.idPersona; No se puede invocar una variable no estática en un contexto estático
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Bloque no estático">
    //Bloque inicialización no estático(contexto dinámico): Se ejecuta antes del constructor
    {
    System.out.println("Ejecución bloque no estático");
    this.idPersona= Persona.contadorPersonas++;
}
//</editor-fold>
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    
    public Persona(){
        
        System.out.println("Ejecución del constructor");
    }
    
//</editor-fold>

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
