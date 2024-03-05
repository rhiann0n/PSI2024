package unidad5;

import java.util.Arrays;

public class BusquedaOrdenada {
    public static void main(String[] args) {
        int[] numeros = {13,15,18,12,11,16,19,17};
        mostrar("Longitud -> " + numeros.length);
            mostrar("-Sin ordenar-");
        mostrar(Arrays.toString(numeros));
            Arrays.sort(numeros);
         mostrar("-Ordenado-");
        mostrar(Arrays.toString(numeros));
        //Después de ordenar el array, se puede buscar un elemento con la clase
        //binarySearch(nombreArray,elementoAbuscar)
        //El resultado de esta clase es un entero, si es positivo, es el índice
        //donde se encuentra
        //Si es negativo menor que 0, es el índice donde debería estar posicionado
        //ese elemento buscado, pero que no se encuentra
        int pos = Arrays.binarySearch(numeros, 20);
        mostrar("Posición -> " + pos);
        if (pos < 0) {
            int indiceInsertar = -pos - 1;
            mostrar("El 20 debería ir en el índice " + indiceInsertar + " para mantener la tabla ordenada.");
        }

    }


    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);
    }
}
