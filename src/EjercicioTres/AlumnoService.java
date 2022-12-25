package EjercicioTres;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {
    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Alumno datos() { // pedimos los datos del alumno con esta funcion
        List<Integer> notas = new ArrayList(); // creamos la lista que vamos a utilizar como auxiliar para poder definir las notas (atributo)
        Alumno alumno = new Alumno(); // para pedir los datos debemos crear un objeto de tipo Alumno
        int nota;

        System.out.println("Digite el nombre del alumno");
        alumno.setNombre(read.next()); // setteamos el nombre del alumno

        for (int i = 0; i < 3; i++) { // con un for agregamos las notas a la lista antes creada
            System.out.println("Digite la nota nro " + (i + 1));
            nota = read.nextInt();
            notas.add(nota);
            alumno.setNotas(notas);// aca es donde setteamos en el atributo las notas de la lista creada en la funcion

        }

        /**
         * Demostracion de que las notas si se guardan en el atributo Notas!
         * for (Integer nota1 : alumno.getNotas()) {
         *
         *     System.out.println(nota1);
         *
         * }
         */
        return alumno; // devolvemos un objeto alumno en esta funcion
    }

    public int notaFinal(List<Alumno> alumnos) { // la funcion de la nota final recibe como parametro la lista de alumnos del main
        String alumnoBuscado = "";
        int sumatoria = 0;
        int promedio = 0;

        System.out.println("Digite el nombre del alumno al cual le desea buscar su nota final");
        alumnoBuscado = read.next().toLowerCase(); // aca ponemos que alumno queremos buscar

        for (Alumno alumno1 : alumnos) { // con el for each buscamos cada nombre en la lista de alumnos
            /** System.out.println(alumnos.size()); */

            if (alumno1.getNombre().toLowerCase().equals(alumnoBuscado)) { // aca ponemos la condicion de si el nombre esta o no
                Iterator<Integer> it = alumno1.getNotas().iterator(); //en el caso de que el nombre este, creamos un iterador

                while (it.hasNext()) { // con el iterador ponemos un while que mientras haya notas las vamos a agregar a la sumatoria de estas
                    sumatoria += it.next(); // aca vamos sumando las notas
                }

                promedio = sumatoria / 3; // definimos el promedio (da un valor redondeado)
            }
        }

        if (promedio == 0) {
            System.out.println("El nombre del alumno no esta en la lista");
            return 0;
        } else {
            return promedio; //devolvemos el promedio
        }
    }
}

/**
 * Nota: En el caso de que se ponga un nombre que no este en la lista de alumnos, se avisa que no esta y lo que devuelve es 0
 */