package ejercicioCinco;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio05 {
    /**
     * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
     * repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
     * guardará el país en el conjunto y después se le preguntará al usuario si quiere
     * guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
     * guardados en el conjunto.
     * <p>
     * Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
     * recordar como se ordena un conjunto.
     * <p>
     * Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
     * Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
     * país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
     * en el conjunto se le informará al usuario.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        PaisService pService = new PaisService();
        Set<Pais> paises = new TreeSet(Pais.comprarNombres);
        String respuesta;
        boolean salir;

        do {
            paises.add(pService.nombrePais());
            System.out.println("Desea agregar otro pais? (Y/N)");
            respuesta = read.next();

            if (respuesta.equalsIgnoreCase("y")) {
                salir = true;
            } else {
                salir = false;
            }
        } while (salir);

        System.out.println("Los paises ingresados fueron : \n");
        pService.mostrarPaises(paises);

        System.out.println("\n\n");
        pService.eliminarPais(paises);

        System.out.println("\n\nLista de paises actualizada");
        pService.mostrarPaises(paises);
    }
}
