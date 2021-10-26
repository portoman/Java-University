
package domain;


public class Persona {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
//</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
   
        public Persona(String nombre){
        
        this.nombre=nombre;
        
        idPersona=++Persona.contadorPersonas;
        
    }
    
//</editor-fold>


    //<editor-fold defaultstate="collapsed" desc="getter/setter">
//      public static int getContadorPersonas() {
//        return contadorPersonas;
//    }
//
//    public static void setContadorPersonas(int aContadorPersonas) {
//        contadorPersonas = aContadorPersonas;
//    }
    
      
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
//</editor-fold>

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
  
}
