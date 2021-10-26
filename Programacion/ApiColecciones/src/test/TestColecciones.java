package test;

import java.util.*;


public class TestColecciones {
   
    public static void main(String[] args) {
        
        //<editor-fold defaultstate="collapsed" desc="List">
        List miLista=new ArrayList();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add(4);
        
        for(Object elemento:miLista){
            System.out.println("elemento= "+elemento);
        }
        
        
        miLista.forEach(elemento ->{
            System.out.println("elemento = " + elemento);
        });
        imprimir(miLista);
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Set">
        Set miSet = new HashSet();
        
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add(1);
        
        miSet.forEach(elemento ->{
            System.out.println("elementoMiSet = " + elemento);
        });
        
        imprimir(miSet);
//</editor-fold>
       
       
       
       Map miMapa = new HashMap();
       
       miMapa.put("Suficiente", 5);
       miMapa.put("Bien", 6);
       miMapa.put("Notable", 8);
       miMapa.put("Sobresaliente", 10);
       
       int suficiente=(int) miMapa.get("Suficiente");
        System.out.println("suficiente = " + suficiente);
        
        System.out.println( miMapa.toString());
       
    }
   
    public static void imprimir(Collection coleccion){
        for(Object elemento:coleccion){
            System.out.printf("%s, ",elemento );
        }
        System.out.println("\n");
    }
}
