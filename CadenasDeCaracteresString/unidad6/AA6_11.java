package unidad6;

import java.util.Scanner;

/*Escribe un programa descodificador que muestre un texto codificado con el
* programa realizado en la AR6.11.*/
public class AA6_11 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        final char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        String codificado;

        mostrarSinLn("Introduzca el código a descodificar: ");
        codificado = sn.nextLine();

        // Convertimos el código a minúsculas para hacer la descodificación
        codificado = codificado.toLowerCase();
        String descodificado = descodifica(conjunto1, conjunto2, codificado);
            mostrar("Texto descodificado: " + descodificado);
        }

        /* Esta función descodifica el carácter 'c' según los alfabetos conjunto1 y 2.
         * Buscamos el carácter 'c' en conjunto2. Si se encuentra en la posición pos,
         * se devuelve el carácter equivalente en el primer conjunto: conjunto1[pos].
         * En caso de no encontrar 'c' en conjunto2 se devuelve sin descodificar. */
        static String descodifica(char[] conjunto1, char[] conjunto2, String codificado) {
            String descodificado = "";
            for (int i = 0; i < codificado.length(); i++) {
                char c = codificado.charAt(i);
                int pos = encontrarPos(conjunto2, c);
                if (pos != -1) {
                    descodificado += conjunto1[pos];
                } else {
                    // Si el carácter no está en el conjunto2, lo dejamos igual
                    descodificado += c;
                }
            }
            return descodificado;
        }

    /* Esta función encuentra la posición de un carácter en un conjunto dado.
     * Si el carácter no está en el conjunto, devuelve -1. */
    static int encontrarPos(char[] conjunto, char c) {
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] == c) {
                return i;
            }
        }
        return -1; // Carácter no encontrado
    }
        public static void mostrar (String texto) {
                System.out.println("\t" + texto);
            }
            public static void mostrarSinLn (String texto) {
                System.out.print("\t" + texto);
            }
    }

