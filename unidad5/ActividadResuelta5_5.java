package unidad5;

import java.util.Arrays;
import java.util.Scanner;

/*Escribir la función int [] rellenaPares(int longitud, int fin), que crea y devuelve
* una tabla ordenada de la longitud especificada, que se encuentra rellena con números
* pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive). */
public class ActividadResuelta5_5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        mostrarSinLn("Indica la longitud de la tabla: ");
        int longitud = sn.nextInt();
        mostrarSinLn("Indica el número fin de los números aleatorios: ");
        int fin = sn.nextInt();
        int[] pares = new int[longitud];
        for (int i = 0; i < pares.length; i++) {
            int num = (int) (Math.random() * fin + 1);
            if (num % 2 == 0) {
                pares [i] = num;
            } else {
               --i;
            }
        }
        Arrays.sort(pares);
        mostrar("Tabla ordenada" + Arrays.toString(pares));
    }
    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);
    }
}

