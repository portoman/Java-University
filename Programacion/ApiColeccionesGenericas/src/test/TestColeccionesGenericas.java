package test;

import java.util.*;

public class TestColeccionesGenericas {
    
    public static void main(String[] args) {

        //<editor-fold defaultstate="collapsed" desc="List">
        List<String> miLista = new ArrayList<>();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        String elemento1=miLista.get(1);
        System.out.println("elemento1 = " + elemento1);
        
        imprimir(miLista);
        
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Set">
        Set<String> miSet = new HashSet <>();
        
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        
        miSet.forEach(elemento -> {
            System.out.println("elementoMiSet = " + elemento);
        });
        
        imprimir(miSet);
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Map">
        Map<String, Integer> miMapa = new HashMap<>();
        
        miMapa.put("Suficiente", 5);
        miMapa.put("Bien", 6);
        miMapa.put("Notable", 8);
        miMapa.put("Sobresaliente", 10);
        
        int suficiente = miMapa.get("Suficiente");
        System.out.println("suficiente = " + suficiente);
        
        System.out.println(miMapa.toString());
//</editor-fold>
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="Imprimir">
    public static void imprimir(Collection<String> coleccion) {
        for (String elemento : coleccion) {
            System.out.printf("%s, ", elemento.charAt(0));
        }
        System.out.println("\n");
//</editor-fold>
    }
}
