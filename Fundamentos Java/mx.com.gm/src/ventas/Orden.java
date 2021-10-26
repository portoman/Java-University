
package ventas;


public class Orden {
    private int idOrden;
    public Producto productos[];
    private static int contadorOrdenes=0;
    private int contadorProductos;
    public static final int MAX_PRODUCTOS=10;
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
        
     public Orden(){
        
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos=new Producto[Orden.MAX_PRODUCTOS];
        
        }
//</editor-fold>
      
     //<editor-fold defaultstate="collapsed" desc="Métodos">
     
     public void agregarProducto(Producto producto){
         if(this.contadorProductos<Orden.MAX_PRODUCTOS){
             this.productos[this.contadorProductos++]=producto;
         }
         else{throw new NullPointerException("Se ha superado el máximo de productos: "+ Orden.MAX_PRODUCTOS);
             
         }
         
     }
     
     public double calcularTotal(){
        
         double total=0;
         
         for (int i=0;i<this.contadorProductos;i++){
             
             total+=this.productos[i].getPrecio();
         }
             
             
         return total;
         
     }
     
     public void mostrarOrden(){
         
         System.out.println("La orden es: "+this.idOrden);
         for (int i = 0; i < contadorProductos; i++) {
            System.out.printf("El producto número %d es un/una %s con precio %.2f €. \n"
                    ,i, productos[i].getNombre(), productos[i].getPrecio());
        }
         
         
     }
//</editor-fold>

  
}
