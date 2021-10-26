/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

/**
 *
 * @author portb
 */
public class Producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {

        this.idProducto = Producto.contadorProductos++;
        
    }

    public Producto(String nombre, double precio) {
        this();
        setNombre(nombre);
        setPrecio(precio);

    }

    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }
//</editor-fold>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

}
