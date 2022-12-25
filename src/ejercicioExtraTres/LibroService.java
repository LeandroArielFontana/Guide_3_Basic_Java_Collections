package ejercicioExtraTres;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LibroService {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        Libro libro = new Libro();

        System.out.println("Digite el nombre del libro");
        libro.setNombre(read.next());

        System.out.println("Digite el nombre del autor del libro");
        libro.setAutor(read.next());

        System.out.println("Digite la cantidad de ejemplares");
        libro.setNumeroEjemplares(read.nextInt());

        System.out.println("Digite el numero de ejemplares prestados");
        libro.setNumerosEjemplaresPrestados(read.nextInt());
        return libro;
    }

    public void prestamo(Set<Libro> libreria) {
        System.out.println("Digite el nombre del titulo que desea tomar prestado");
        String libroBuscado = read.next();
        Iterator<Libro> it = libreria.iterator();

        while (it.hasNext()) {
            Libro libro = it.next();

            if (libro.getNombre().toLowerCase().equals(libroBuscado)) {
                if (libro.getNumeroEjemplares() != 0) {
                    System.out.println("El libro puede ser prestado!");
                    libro.setNumeroEjemplares(libro.getNumeroEjemplares() - 1);
                    libro.setNumerosEjemplaresPrestados(libro.getNumerosEjemplaresPrestados() + 1);

                    /**
                     * System.out.println(libro.getNumeroEjemplares());
                     * System.out.println(libro.getNumerosEjemplaresPrestados());
                     */
                } else {
                    System.out.println("El libro no tiene ejemplares para poder prestar en estos momentos");
                }
            } else {
                System.out.println("El nombre del libro no se encuentra actualmente");
            }
        }
    }

    public void devolucion(Set<Libro> libreria) {
        System.out.println("Digite el nombre del titulo que desea devolver");
        String libroBuscado = read.next();
        Iterator<Libro> it = libreria.iterator();

        while (it.hasNext()) {
            Libro libro = it.next();

            if (libro.getNombre().toLowerCase().equals(libroBuscado)) {
                if (libro.getNumerosEjemplaresPrestados() >= 0) {
                    System.out.println("El libro puede sera devuelto");
                    libro.setNumeroEjemplares(libro.getNumeroEjemplares() + 1);
                    libro.setNumerosEjemplaresPrestados(libro.getNumerosEjemplaresPrestados() - 1);

                    System.out.println(libro.getNumeroEjemplares());
                    System.out.println(libro.getNumerosEjemplaresPrestados());
                } else {
                    System.out.println("El libro no tiene ejemplares para poder prestar en estos momentos");
                }
            } else {
                System.out.println("El nombre del libro no se encuentra actualmente");
            }
        }
    }

    public void mostrarLibros(Set<Libro> libreria) {
        for (Libro libro : libreria) {
            System.out.println(libro.toString()+"\n");
        }
    }
}
