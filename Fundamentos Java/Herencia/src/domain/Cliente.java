/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

public class Cliente extends Persona{
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private static int idCliente;
    Date fechaRegistro=new Date(System.currentTimeMillis());
    private static int contador;
    private boolean vip;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    
    public static int getIdCliente() {
        return idCliente;
    }
    
    
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public boolean isVip() {
        return this.vip;
    }
    
    public void setVip(boolean vip) {
        this.vip = vip;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    
    
    
    
//</editor-fold>

    public Cliente( String nombre, char genero, int edad, String direccion, boolean vip) {
        super(nombre, genero, edad, direccion);
        this.setVip(vip);
        this.idCliente = ++Cliente.contador;
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{fechaRegistro=").append(fechaRegistro);
        sb.append(", contador=").append(contador);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
 
}
