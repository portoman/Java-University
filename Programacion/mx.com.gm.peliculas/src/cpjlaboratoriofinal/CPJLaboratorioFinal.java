package cpjlaboratoriofinal;

import domain.Pelicula;
import java.util.ArrayList;
import java.util.*;
import negocio.CatalogoPeliculasImpl;
import negocio.ICatalogoPeliculas;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {

        var opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("""
                               Seleccione opción: 
                               1.- Iniciar catálogo de películas 
                               2.- Agregar película 
                               3.- Listar películas 
                               4.- Buscar película 
                               0.- Salir""");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce nombre de la película");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce una pelicula a buscar: ");
                    var peliculaBuscar = scanner.nextLine();
                    catalogo.buscarPeliculas(peliculaBuscar);
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no reconocida");
                    break;
            }

        }
    }
}
