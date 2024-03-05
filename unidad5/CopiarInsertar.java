package unidad5;

import java.util.Arrays;

public class CopiarInsertar {
    public static void main(String[] args) {
        int[] numeros = new int [6];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random()*100+1);
        }
        mostrar("Array ANTES de crecer. Longitud -> " + numeros.length);
        mostrar(Arrays.toString(numeros));

    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
