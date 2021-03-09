
package mundopc;


public class mundopc {
    public static void main(String[] args) {
        Raton raton1=new Raton("USB", "Trust");
        
        Teclado teclado1=new Teclado("USB", "Dell");
        Teclado teclado2=new Teclado("RGB", "Superstar");
        
        Monitor monitor1=new Monitor("VivoBook", 15.6);
        Monitor monitor2=new Monitor("VivoBook", 14);
        
        Computadora computadora1=new Computadora("Asus", monitor1, teclado1, raton1);
        Computadora computadora2=new Computadora("Asus", monitor2, teclado2, raton1);
        Computadora computadora3=new Computadora();
        
        
        Orden orden1=new Orden();
        
       orden1.agregarComputadora(computadora1);
       orden1.agregarComputadora(computadora2);
       orden1.agregarComputadora(computadora3);  
       orden1.agregarComputadora(computadora1);
        
       
        
        orden1.mostrarOrden();
        
    }
}
