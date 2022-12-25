package EjercicioTres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        List<Alumno> alumnos = new ArrayList(); // creacion de la lista que contendra los alumnos
        AlumnoService aService = new AlumnoService();
        boolean salir;
        String respuesta;

        do {
            alumnos.add(aService.datos()); // guardamos a los alumnos en la lista

            System.out.println("¿Desea agregar otro alumno? ( Y / N )"); // preguntamos si desea agregar otro alumno
            respuesta = read.next().toUpperCase();

            if (respuesta.equals("Y")) {
                salir = true;
            } else {
                salir = false;
            }
        } while (salir);

        System.out.println("La nota final del alumno es de : " + aService.notaFinal(alumnos)); // aca mostramos la nota final del alumno ( redondeado )
    }

    /**
     * Crear una clase llamada Alumno que mantenga información sobre las notas de
     * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
     * de tipo Integer con sus 3 notas.
     * <p>
     * En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
     * información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
     * pregunta al usuario si quiere crear otro Alumno o no.
     * <p>
     * Despues de ese bluce tendremos el siguiente método en la clase Alumno:
     * Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
     * su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
     * método. Dentro del método se usará la lista notas para calcular el promedio final
     * de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
     * main.
     */
}
