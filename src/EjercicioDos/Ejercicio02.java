package EjercicioDos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02 {

    /**
     * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
     * pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
     * Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
     * la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
     * y se mostrará la lista ordenada
     */
    public static void main(String[] args) {
        List<String> razas = new ArrayList(); // creacion de la lista que contendra las razas
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        boolean salir;
        String respuesta;
        String razaBuscada;
        int contador = 0;
        int tamanioLista;

        do {
            System.out.println("Digite una raza de perro");
            razas.add(read.next()); // agregamos la raza a las lista

            System.out.println("¿Desea agregar alguna raza mas? (Y / N)");
            respuesta = read.next().toUpperCase();

            if (respuesta.equals("Y")) {
                salir = true;
            } else {
                salir = false;
            }

        } while (salir);

        tamanioLista = razas.size(); // tamaño lista contendra el tamaño de la listaa

        System.out.println("------------------------------");
        System.out.println("Los perros guardados fueron : "); // mostramos las razas de los perros

        for (String raza1 : razas) {
            System.out.println(raza1);
        }

        System.out.println("------------------------------");
        System.out.println("Digite una raza para buscar en la lista"); // preguntamos que raza buscamos

        razaBuscada = read.next();
        Iterator<String> it = razas.iterator();

        while (it.hasNext()) {
            if (razaBuscada.equals(it.next())) { // en el caso de que la raza este, esta misma se elimina
                it.remove();
            } else {
                contador++; // el contador esta para verificar si no se borro ningun perro
            }
        }

        System.out.println("------------------------------");

        if (contador == tamanioLista) { // condicion que verifica si se elimino alguna raza
            System.out.println("El perro no esta en la lista");
        }

        Collections.sort(razas); // usamos la funcion sort para poder organizar las razas
        System.out.println("Razas ordenadas"); // mostramos las razas ordenadas

        for (String raza1 : razas) {
            System.out.println(raza1);
        }
    }
}
