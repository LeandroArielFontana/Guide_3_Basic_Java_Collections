package ejercicioSeis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Producto crearProducto(Producto producto) {
        System.out.println("Digite el nombre del producto");
        producto.setNombre(read.next());

        System.out.println("Digite el precio del producto");
        producto.setPrecio(read.nextDouble());

        return producto;
    }

    public void mostrarProductos(HashMap<String, Producto> productoHashMap) {
        Iterator<HashMap.Entry<String, Producto>> it = productoHashMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Producto> producto = it.next();
            System.out.println("NOMBRE DE PRODUCTO : " + producto.getKey() + "\tPRECIO : $ " + producto.getValue().getPrecio());
        }
    }

    public HashMap<String, Producto> modificarPrecio(HashMap<String, Producto> productoHashMap) {
        System.out.println("Digite el nombre del producto que desea cambiarle el precio");
        String nombreProducto = read.next().toLowerCase();

        Iterator<HashMap.Entry<String, Producto>> it = productoHashMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Producto> objeto = it.next();

            if (objeto.getKey().toLowerCase().equals(nombreProducto)) {
                System.out.println("Digite el nuevo valor del producto");
                objeto.getValue().setPrecio(read.nextDouble());
            }
        }
        return productoHashMap;
    }
}
