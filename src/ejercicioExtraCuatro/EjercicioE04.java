package ejercicioExtraCuatro;

import java.util.HashMap;

public class EjercicioE04 {

    /**
     * Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
     * página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
     * numero.
     * • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades. (listo)
     * • Muestra por pantalla los datos introducidos(listo)
     * • Pide un código postal y muestra la ciudad asociada si existe sino avisa al
     * usuario. (Listo)
     * • Muestra por pantalla los datos (listo)
     * • Agregar una ciudad con su código postal correspondiente más al HashMap.(Listo)
     * • Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
     * • Muestra por pantalla los datos
     */
    public static void main(String[] args) {
        PaisService pService = new PaisService();
        Pais pais;
        HashMap<Integer, Pais> paises = new HashMap();

        for (int i = 0; i < 10; i++) {
            pais = pService.crearPais();
            paises.put(pais.getCodigo(), pais);
        }

        System.out.println("\n\n");
        pService.mostrarPaises(paises);

        System.out.println("\n\n");
        pService.mostrarLocalidadBuscada(paises);

        System.out.println("\n\nAgregue una localidad mas por favor");
        pais = pService.crearPais();
        paises.put(pais.getCodigo(), pais);

        System.out.println("\n\n");
        pService.mostrarPaises(paises);

        System.out.println("\n\n");

        for (int i = 0; i < 3; i++) {
            pService.eliminarPaises(paises);
        }

        System.out.println("\n\n");
        pService.mostrarPaises(paises);
    }
}
