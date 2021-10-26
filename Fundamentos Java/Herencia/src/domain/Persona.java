
package domain;


public class Persona {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    protected static String aldea;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Persona(){
        
        
    }
    public Persona (String nombre){
        
        this.nombre=nombre;
    }
    
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.setNombre(nombre);
        this.setGenero(genero);
        this.setEdad(edad);
        this.setDireccion(direccion);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    /**
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * @return the genero
     */
    public char getGenero() {
         return this.genero;
    }
    
    /**
     * @return the edad
     */
    public int getEdad() {
        return this.edad;
    }
    
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
//        if (genero!='h' && genero!='m')
//        {throw new IllegalArgumentException(String.format("El sexo tiene que ser hombre o mujer, no %s", genero));
//        }
//        else{    
        this.genero = genero;
//        }
        }
    
    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        if(edad<0 || edad>100)throw new IllegalArgumentException(String.format("El valor %d introducido es no válido", edad));
        this.edad = edad;
    }
    
    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
//</editor-fold>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre= ").append(nombre);
        sb.append(", genero= ").append(genero);
        sb.append(", edad= ").append(edad);
        sb.append(", direccion= ").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
