package ejercicioExtraCuatro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PaisService {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Pais crearPais() {
        Pais pais = new Pais();

        System.out.println("Digite el nombre de la localidad");
        pais.setNombre(read.next());

        System.out.println("Digite el codigo del pais");
        pais.setCodigo(read.nextInt());
        return pais;
    }

    public void mostrarPaises(HashMap<Integer, Pais> paises) {
        Iterator<HashMap.Entry<Integer, Pais>> it = paises.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Pais> obj = it.next();
            System.out.println("Nombre Localidad : " + obj.getValue().getNombre() + "\tCodigo Postal : " + obj.getKey());
        }
    }

    public void mostrarLocalidadBuscada(HashMap<Integer, Pais> paises) {
        boolean eliminado = false;
        System.out.println("Digite la localidad que desea buscar");
        String localidadBuscada = read.next().toLowerCase();

        Iterator<HashMap.Entry<Integer, Pais>> it = paises.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Pais> obj = it.next();

            if (obj.getValue().getNombre().toLowerCase().equals(localidadBuscada)) {
                System.out.println("Nombre Localidad : " + obj.getValue().getNombre() + "\tCodigo Postal : " + obj.getKey());
                eliminado = true;
                break;
            }
        }

        if (eliminado == false) {
            System.out.println("No se encontro ninguna localidad con ese nombre");
        }
    }

    public void eliminarPaises(HashMap<Integer, Pais> paises) {
        boolean eliminado = false;
        System.out.println("Digite la localidad que desea eliminar");
        String localidadBuscada = read.next().toLowerCase();

        Iterator<HashMap.Entry<Integer, Pais>> it = paises.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Pais> obj = it.next();

            if (obj.getValue().getNombre().toLowerCase().equals(localidadBuscada)) {
                it.remove();
                eliminado = true;
                break;
            }
        }

        if (eliminado == false) {
            System.out.println("No se elimino ninguna localidad");
        }
    }
}
