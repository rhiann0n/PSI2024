package unidad5;
//CESTA DE LA COMPRA
/*Cada vez que compramos, variamos de productos y cantidades.
* Creamos un array que crecerá a medida que insertemos productos, para ello
* utilizaremos un pequeño menú y, para la ejecución*/

import java.util.Arrays;
import java.util.Scanner;

public class InsertarOrdenadaFuncion {
    static Scanner sn = new Scanner(System.in);
    static String[] cesta = new String[0];
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        mostrar("----- CESTA DE LA COMPRA -----");
        mostrar("1. Insertar");
        mostrar("2. Mostrar Cesta");
        mostrar("3. Eliminar Producto");
        mostrar("4. Imprimir y salir");
        mostrarSinLn("Indique su opción --> ");
        int opcion = sn.nextInt();

        switch (opcion){
            case 1 -> {
                cesta = insertar(cesta);
                menu();
            }

            case 2 -> {
                mostrar(Arrays.toString(cesta));
                menu();
            }
            case 3 -> {
                cesta = eliminar(cesta);
                menu();
            }
            case 4 -> {}
        }
    }

    public static String[] insertar(String[] cesta) {
        //pregunto el producto a insertar
        mostrarSinLn("Indica el nombre del producto-> ");
        String productoNuevo = sn.next(); sn.nextLine();
        //lo buscamos; si está, enviamos un mensaje y si no, lo insertamos
        boolean existe = buscarProducto(cesta,productoNuevo);
        if (existe) {
            mostrar("El producto que indicas ya existe");
        } else { // lo insertamos
            cesta = Arrays.copyOf(cesta, cesta.length + 1);
            cesta [cesta.length - 1] = productoNuevo; //en el último índice, inserta el nuevo valor


        }
        //lo devolvemos a la función menu.
        return cesta;
    }


    public static boolean buscarProducto(String[] cesta, String productoNuevo){
        boolean existe=false; //creamos un booleano que controle si existe
        int indice=0;
        while (indice<cesta.length && !cesta[indice].equals(productoNuevo)){
            indice++;
        }
        if (indice<cesta.length)
            existe=true;
        return existe;
    }

    public static String[] eliminar(String[] cesta) {
        mostrarSinLn("Indica el nombre del producto a eliminar -> ");
        String productoEliminar = sn.next(); sn.nextLine();
        int indice = 0;
        for (int i = 0; i < cesta.length; i++) {
            if (cesta[i].equals(productoEliminar)) {
                indice = i;
            }

        }
        boolean existe = buscarProducto(cesta, productoEliminar);
        if (!existe) {
            mostrar("El producto que quieres borrar no existe en la Cesta");
        } else {
            cesta[indice] = cesta[cesta.length-1];
            cesta = Arrays.copyOf(cesta, cesta.length-1);
        }
        return cesta;
    }

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);
    }


}