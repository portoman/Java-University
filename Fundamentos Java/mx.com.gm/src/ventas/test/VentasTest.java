package ventas.test;

import ventas.Producto;
import ventas.Orden;

public class VentasTest {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Leche", 1.2);
        Producto producto2 = new Producto("Agua", 0.84);
        Producto producto3 = new Producto("Platano", 1.5);
        Producto producto4 = new Producto("Manzana", 1.8);
        Producto producto5 = new Producto("Limón", 0.5);
        Producto producto6 = new Producto("Fresa", 9.5);
        Producto producto7 = new Producto("Pera", 4.5);
        Producto producto8 = new Producto("Sandia", 1);
        
        
        Orden orden1 = new Orden();

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
       
        System.out.println("Precio total: "+orden1.calcularTotal());
         orden1.mostrarOrden();
         System.out.println(orden1);
         
         System.out.println("La suma de los precios es: "+orden1.calcularTotal());
    }

}
