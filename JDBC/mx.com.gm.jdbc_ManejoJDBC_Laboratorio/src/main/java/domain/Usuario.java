package domain;

//Clase de entidad
public class Usuario {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
   private int idUsuario;
   private String usuario;
   private String password;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Usuario() {
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(int idUsuario, String usuario, String password) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }
    
    
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
 @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", password=" + password + '}';
    }

//</editor-fold>

   
}