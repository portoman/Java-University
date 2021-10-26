package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo="c:\\Users\\portb\\OneDrive\\Escritorio\\Java University\\prueba.txt";
        crearArchivo(nombreArchivo);
        
       escribirArchivo(nombreArchivo, "Hola desde Java");
//      anexarArchivo(nombreArchivo, "¿Cómo estás?");

        leerArchivo(nombreArchivo);
        
        System.out.println("nombreArchivo = " + nombreArchivo);
    }
}
