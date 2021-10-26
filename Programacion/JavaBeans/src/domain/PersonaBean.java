package domain;

import java.io.Serializable;

public class PersonaBean implements Serializable{
    
    //Obligatorio para que sea JavaBeans: Atributos privados, Constructor vacio, Getter/Setters
    private String nombre;
    private String apellido;
    
    public PersonaBean(){
   
    }
    
    public PersonaBean(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
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

    @Override
    public String toString() {
        return "PersonaBean{" + "nombre= " + nombre + ", apellido= " + apellido + '}';
    }
    
    
}
