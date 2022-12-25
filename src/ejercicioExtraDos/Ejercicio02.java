package ejercicioExtraDos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02 {

    /**
     * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
     * tendrá como atributos el nombre y discoConMasVentas.
     * Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
     * objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
     * cada cantante y su disco con más ventas por pantalla.
     * <p>
     * Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
     * agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
     * usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
     * cambios.
     */
    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        List<CantanteFamoso> cantantes = new ArrayList();
        CantanteFamosoService cService = new CantanteFamosoService();
        boolean salir;

        for (int i = 0; i < 5; i++) {
            cantantes.add(cService.crearCantante());
        }

        do {
            salir = menu(cantantes, cService);
        } while (salir);
    }

    public static boolean menu(List<CantanteFamoso> cantantes, CantanteFamosoService cantanteService) {
        System.out.println("Digite que la opcion que desea realizar");
        System.out.println("1 - Agregar un cantante");
        System.out.println("2 - Mostrar los cantantes");
        System.out.println("3 - Eliminar un cantante");
        System.out.println("4 - Salir del programa");

        int respuesta = read.nextInt();

        if (respuesta == 1) {
            cantantes.add(cantanteService.crearCantante());
            return true;
        } else if (respuesta == 2) {
            cantanteService.mostrarCantante(cantantes);
            return true;
        } else if (respuesta == 3) {
            cantanteService.eliminarCantante(cantantes);
            return true;
        } else {
            return false;
        }
    }
}
