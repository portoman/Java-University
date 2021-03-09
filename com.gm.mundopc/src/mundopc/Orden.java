
package mundopc;


public class Orden {
    
    private int idOrden;
    public  Computadora computadoras[];
    private static int contadorOrdenes;
    private  int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=10;
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        computadoras=new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
       if(this.contadorComputadoras<Orden.MAX_COMPUTADORAS){
       this.computadoras[this.contadorComputadoras++]=computadora;}
        
    }
    
    public void mostrarOrden(){
        
        for (int i=0; i<this.contadorComputadoras;i++){
            
            System.out.println("La computadora es: "+computadoras[i]);
        }
        
    }
}
