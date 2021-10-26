
package paquete1;

//Al ser la clase publica se puede acceder desde cualquier sitio del proyecto
public class Clase1 {
    
    //Una variable publica se puede acceder y modificar desde cualquier sitio del proyecto
    public String atributoPublico="Valor atributo publico";
    
    //Una variable protected se puede acceder desde las clases hijas
    protected String atributoProtected="Valor atributo protected";
    
    //Una variable default/paquete solo se puede modificar desde el mismo paquete
    String atributoDefault="Valor atributo default";
    
    //Una variable private solo se puede modificar desde la misma clase
    String atributoPrivate="Valor atributo private";
    
    
    //Un constructor se puede acceder desde cualquier sitio del proyecto
    public Clase1(){
    
        System.out.println("Constructor publico");
}
  
    //Los constructores, atributos y métodos protected solo se pueden usar desde las clases hijas
     protected Clase1(String name){
    
        System.out.println("Constructor protected");
}
     
    public void metodoPublico(){
        
        System.out.println("Método público");
    }
    
     public void metodoProtected(){
        
        System.out.println("Método protected");
    }
}
