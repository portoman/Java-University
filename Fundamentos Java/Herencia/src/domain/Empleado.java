/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Alfonso
 */
public class Empleado extends Persona{
    
    protected double sueldo;
    private int idEmpleado;
    private static int contadorEmpleado;

    public Empleado(){
        this.idEmpleado=++Empleado.contadorEmpleado;
        
    }
    
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo=sueldo;

    }
    
    public Empleado(String nombre){
        this();
        this.nombre=nombre;
        
    }
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{sueldo= ").append(this.sueldo);
        sb.append(", idEmpleado= ").append(this.idEmpleado);
        sb.append(", nombre= ").append(this.nombre);
        sb.append(", Persona= ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    

 
    
    
}
