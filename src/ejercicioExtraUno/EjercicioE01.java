package ejercicioExtraUno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioE01 {

    /**
     * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
     * y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
     * introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
     * programa mostrará por pantalla el número de valores que se han leído, su suma y su
     * media (promedio).
     */

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList();
        Scanner read = new Scanner(System.in);
        Integer sumatoria = 0;
        boolean salir;

        do {
            System.out.println("Digite un numero");
            Integer numero = read.nextInt();

            if (numero != -99) {
                salir = true;
                numeros.add(numero);
            } else {
                salir = false;
            }
        } while (salir);

        for (Integer numero : numeros) {
            sumatoria += numero;
        }

        double promedio = (double) sumatoria / (double) numeros.size();

        System.out.println("LA SUMATORIA DE TODOS LOS NUMEROS ES DE : " + sumatoria);
        System.out.println("EL PROMEDIO DE TODOS LOS NUMEROS INGRESADOS : " + promedio);
    }
}
