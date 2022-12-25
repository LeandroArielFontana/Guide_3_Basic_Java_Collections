package ejercicioCinco;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PaisService {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Pais nombrePais() {
        Pais p = new Pais();
        System.out.println("Digite el nombre del pais");
        p.setNombre(read.next().toLowerCase());
        return p;
    }

    public void mostrarPaises(Set<Pais> paises) {
        for (Pais pais : paises) {
            System.out.println(pais.getNombre());
        }
    }

    public void eliminarPais(Set<Pais> paises) {
        System.out.println("Digite un pais a buscar");
        String paisBuscado = read.next().toLowerCase();
        Iterator<Pais> it = paises.iterator();
        Integer contador2 = paises.size();
        Integer contador = 0;

        while (it.hasNext()) {
            Pais pais = it.next();

            if (pais.getNombre().equalsIgnoreCase(paisBuscado)) {
                it.remove();
            } else {
                contador++;
            }
        }

        if (contador2 == contador) {
            System.out.println("NO SE ELIMINO NINGUN PAIS");
        } else {
            System.out.println("SE ELIMINARON " + (contador2 - contador) + " PAISE(S) ");
        }
    }
}
