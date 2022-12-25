package ejercicioSeis;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {

    /**
     * Se necesita una aplicación para una tienda en la cual queremos almacenar los
     * distintos productos que venderemos y el precio que tendrán. Además, se necesita
     * que la aplicación cuente con las funciones básicas.
     * <p>
     * Estas las realizaremos en el main. Como, introducir un elemento, modificar su
     * precio, eliminar un producto y mostrar los productos que tenemos con su precio
     * (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
     * el precio. Realizar un menú para lograr todas las acciones previamente
     * mencionadas.
     */
    public static void main(String[] args) {
        HashMap<String, Producto> productoHashMap = new HashMap();
        Scanner read = new Scanner(System.in);
        Producto producto = new Producto();
        ProductoService productoService = new ProductoService();
        String respuesta;
        boolean salir;

        do {
            producto = productoService.crearProducto(producto);
            productoHashMap.put(producto.getNombre(), producto);

            System.out.println("Desea agregar algun producto mas?(Y/N)");
            respuesta = read.next().toLowerCase();

            if (respuesta.equals("y")) {
                salir = true;
            } else {
                salir = false;
            }
        } while (salir);

        productoService.mostrarProductos(productoHashMap);

        do {
            System.out.println("Desea cambiar el precio de algun producto?");
            respuesta = read.next().toLowerCase();

            if (respuesta.equals("y")) {
                productoService.modificarPrecio(productoHashMap);
                salir = true;
            } else {
                salir = false;
            }
        } while (salir);

        productoService.mostrarProductos(productoHashMap);
    }
}    

