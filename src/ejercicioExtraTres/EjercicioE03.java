package ejercicioExtraTres;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioE03 {

    /**
     * Implemente un programa para una Librería haciendo uso de un HashSet para evitar
     * datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
     * información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
     * el título del libro, autor, número de ejemplares y número de ejemplares prestados.
     * También se creará en el main un HashSet de tipo Libro que guardará todos los libros
     * creados.
     * <p>
     * En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
     * sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
     * se le pregunta al usuario si quiere crear otro Libro o no.
     * La clase Librería contendrá además los siguientes métodos:
     * <p>
     * • Constructor por defecto.(Listo)
     * <p>
     * • Constructor con parámetros.(Listo)
     * <p>
     * • Métodos Setters/getters(Listo)
     * <p>
     * • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
     * busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
     * método. El método se incrementa de a uno, como un carrito de compras, el
     * atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
     * cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
     * que no queden ejemplares disponibles para prestar. Devuelve true si se ha
     * podido realizar la operación y false en caso contrario. (Listo)
     * <p>
     * • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
     * lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
     * El método decrementa de a uno, como un carrito de compras, el atributo
     * ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
     * vez que se produzca la devolución de un libro. No se podrán devolver libros
     * donde que no tengan ejemplares prestados. Devuelve true si se ha podido
     * realizar la operación y false en caso contrario.
     * <p>
     * • Método toString para mostrar los datos de los libros (Listo)
     */

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Set<Libro> libreria = new HashSet();
        LibroService lService = new LibroService();
        boolean salir;
        String opc;

        do {
            libreria.add(lService.crearLibro());
            System.out.println("¿Desea agregar otro libro? (Y / N)");
            opc = read.next().toLowerCase();

            System.out.println("\n\n\n\n\n");
        } while (!opc.equals("n"));

        do {
            System.out.println("\n\n\n\n\n");
            salir = menu(libreria, lService);
        } while (salir);
    }

    public static boolean menu(Set<Libro> libreria, LibroService libroService) {
        boolean flag = true;

        System.out.println("Digite la opcion que desea realizar");
        System.out.println("1 - Agregar un libro");
        System.out.println("2 - Tomar un libro prestado");
        System.out.println("3 - Devolver un libro");
        System.out.println("4 - Mostrar Libros");
        System.out.println("5 - Salir");

        switch (read.nextInt()) {
            case 1:
                libreria.add(libroService.crearLibro());
                flag = true;
                break;
            case 2:
                libroService.prestamo(libreria);
                flag = true;
                break;
            case 3:
                libroService.devolucion(libreria);
                flag = true;
                break;
            case 4:
                System.out.println("\n\n\n\n\n");
                libroService.mostrarLibros(libreria);
                flag = true;
                break;
            case 5:
                System.out.println("Saliendo del programa");
                flag = false;
                break;
            default:
                break;
        }
        return flag;
    }
}
