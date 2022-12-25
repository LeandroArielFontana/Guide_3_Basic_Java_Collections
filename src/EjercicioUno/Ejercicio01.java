package EjercicioUno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01 {

    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
     * String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
     * en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
     * quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
     */
    public static void main(String[] args) {
        List<String> razas = new ArrayList(); //creacion de la lista que contendra todas las razas
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        boolean salir;
        String respuesta;
        String raza;

        do {
            System.out.println("Digite una raza de perro");
            raza = read.next();
            razas.add(raza); // agregamos la raza antes leida a las listas
            System.out.println("¿Desea agregar alguna otra raza? (Y / N)"); // preguntamos si se desea agregar una raza nueva
            respuesta = read.next().toUpperCase();

            if (respuesta.equals("Y")) {
                salir = true;
            } else {
                salir = false;
            }

        } while (salir);

        System.out.println("Los perros guardados fueron : "); // mostramos las razas de los perros guardados

        for (String raza1 : razas) {
            System.out.println(raza1);
        }
    }
}
