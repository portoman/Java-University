
package mundopc;


public class Computadora {
    
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    public static int contadorComputadora;
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        setNombre(nombre);
        setMonitor(monitor);
        setTeclado(teclado);
        setRaton(raton);
        this.idComputadora=Computadora.contadorComputadora++;
       
    }
    
    public Computadora(){
     
        this("null",null,null,null);
    }
            
    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
    
    
}
