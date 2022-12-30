package ejercicioCuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio04 {

    /**
     * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
     * Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
     * película (en horas). Implemente las clases y métodos necesarios para esta
     * situación, teniendo en cuenta lo que se pide a continuación:
     * <p>
     * En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
     * usuario todos sus datos y guardándolos en el objeto Pelicula.
     * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
     * si quiere crear otra Pelicula o no. (Listo)
     * <p>
     * Después de ese bucle realizaremos las siguientes acciones:
     * <p>
     * • Mostrar en pantalla todas las películas. (Listo)
     * <p>
     * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.(Listo)
     * <p>
     * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
     * en pantalla. (Listo)
     * <p>
     * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
     * en pantalla. (Listo)
     * <p>
     * • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla. (Listo)
     * <p>
     * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. (Listo)
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        List<Pelicula> peliculas = new ArrayList();
        PeliculaService pService = new PeliculaService();
        boolean salir;
        String respuesta;

        do {
            peliculas.add(pService.datos());
            System.out.println("¿Desea agregar otra pelicula? ( Y / N )");
            respuesta = read.next().toUpperCase();

            if (respuesta.equals("Y")) {
                salir = true;
            } else {
                salir = false;
            }
        } while (salir);

        System.out.println("LISTA DE PELICULAS\n");
        pService.mostrarPeliculas(peliculas);

        System.out.println("\n-----------------\n");
        pService.peliculasMayor1Hora(peliculas);

        System.out.println("\n-----------------\n");
        pService.ordenDuracionDesc(peliculas);

        System.out.println("\n-----------------\n");
        pService.ordenDuracionAsc(peliculas);

        System.out.println("\n-----------------\n");
        pService.ordenNombreAsc(peliculas);

        System.out.println("\n-----------------\n");
        pService.ordenDirectorAsc(peliculas);
    }
}
