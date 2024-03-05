package unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_6 {
    public static void main(String[] args) {
        int combinacionGanadora[] = new int[6];
        int numero;
        for (int i = 0; i < 6; i++) {
            numero = (int) (Math.random() * 49 +1);
            //si el random duplica un número en la primitiva
            //hay que hacer una búsqueda en el array
            //declaramos el índice en 0 para que comience desde ese punto el recorrido del bucle
            int indice = 0;
            while (indice < combinacionGanadora.length && combinacionGanadora[indice] != numero) {
                indice++; //se incrementa el índice para ir recorriendo las posiciones del array
            }
            if (indice >= combinacionGanadora.length) {
                combinacionGanadora[i] = numero;
            } else {
                i--;
            }
        }
        Scanner sn = new Scanner(System.in);
        mostrar("-Indica tu apuesta -> ");
        int apuesta[] = new int [6];
        for (int i = 0; i < apuesta.length; i++) {
            mostrarSinLn("Número " + (i+1) + "->");
            apuesta [i] = sn.nextInt();
        }
        mostrar("Tu apuesta es: " + Arrays.toString(apuesta));
        mostrar("Número de aciertos en tu apuesta: " + primitiva(apuesta, combinacionGanadora));
    }
    static int primitiva(int apuesta[], int[] ganadora) {
        int aciertos = 0; //contador de aciertos
        Arrays.sort(apuesta);
        Arrays.sort(ganadora);
        for (int ele : apuesta) { //recorremos la tabla de apuesta
            //aprovechamos que la tabla con la combinación está ordenada
            if (Arrays.binarySearch(ganadora, ele) >= 0) { //si está
                aciertos++;
            }
        }
        return (aciertos);
    }
    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto){
        System.out.print("\t" + texto);
    }
}

