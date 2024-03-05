package unidad5;

import java.util.Scanner;

/*Solicita un número, realiza la media de los números insertados, la media de los
* negativos y la cuenta de los números 0 introducidos. */
public class ActividadPropuesta5_3 {
    public static void main(String[] args) {
        //declaramos scanner, solicitar cuántos números a insertar
        Scanner sn = new Scanner(System.in);
        mostrar("Indica el número de elementos a insertar -> ");
        int longitud = sn.nextInt();
        int numeros[] = new int[longitud];
        int contadorCeros = 0;
        int contadorNegativos = 0;
        int contadorPositivos = 0;
        double mediaPositivos = 0;
        double mediaNegativos = 0;
        for (int i = 0; i < longitud; i++) {
            mostrar("Indica el elemento nº " + (i+1));
            numeros[i] = sn.nextInt();
            if (numeros[i] < 0) {
                mediaNegativos += numeros[i];
                contadorNegativos++;
            } else if (numeros[i] > 0) {
                mediaPositivos += numeros[i];
                contadorPositivos++;
            } else {
                contadorCeros++;
            }
        }
        mediaNegativos/=contadorNegativos;
        mediaPositivos/=contadorPositivos;
        mostrar("La media de los " + contadorNegativos + " números negativos es: " + mediaNegativos);
        mostrar("La media de los " + contadorPositivos + " números positivos es: " + mediaPositivos);
        mostrar("Nº de ceros: " + contadorCeros);
    }
        public static void mostrar (String texto) {
            System.out.println(texto);
        }
    }

