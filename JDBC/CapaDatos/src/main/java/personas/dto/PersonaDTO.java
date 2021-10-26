package personas.dto;

public class PersonaDTO {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int id_persona;
    private String nombre;
    private String apellido;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public PersonaDTO() {
        
    }
    
    public PersonaDTO(int id_persona) {
        this.id_persona = id_persona;
    }

    public PersonaDTO(int id_persona, String nombre, String apellido) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    
    public int getId_persona() {
        return id_persona;
    }
    
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "PersonaDTO{" + "id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
//</editor-fold>

}
