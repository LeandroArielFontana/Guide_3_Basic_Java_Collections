package ejercicioExtraDos;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CantanteFamosoService {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public CantanteFamoso crearCantante() {
        CantanteFamoso cantante = new CantanteFamoso();

        System.out.println("Digite el nombre del cantante");
        cantante.setNombre(read.next());

        System.out.println("Digite el nombre del disco mas vendido");
        cantante.setDiscoMasVendido(read.next());
        return cantante;
    }

    public void mostrarCantante(List<CantanteFamoso> cantantes) {
        for (CantanteFamoso cantante : cantantes) {
            System.out.println("Nombre : " + cantante.getNombre() + "\tDisco : " + cantante.getDiscoMasVendido());
        }
    }

    public void eliminarCantante(List<CantanteFamoso> cantantes1) {
        System.out.println("Digite el cantante que desea eliminar");
        String cantanteBuscado = read.next().toLowerCase();
        Iterator<CantanteFamoso> it = cantantes1.iterator();

        while (it.hasNext()) {
            CantanteFamoso cantante = it.next();

            if (cantante.getNombre().toLowerCase().equals(cantanteBuscado)) {
                it.remove();
            }
        }
    }
}
