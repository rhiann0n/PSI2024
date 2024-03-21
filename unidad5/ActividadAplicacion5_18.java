package unidad5;

import java.util.Arrays;
import java.util.Scanner;

/*Escribe un programa que solicite los elementos de una matriz de tamaño 4x4.
* La aplicación debe decidir si la matriz introducida corresponde a una matriz
* mágica, que es aquella donde la suma de los elementos de cualquier fila o de
* cualquier columna valen lo mismo.*/
public class ActividadAplicacion5_18 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int [][] matriz = new int [4][4];
        /*Bucle para solicitar los datos a incluir en la matriz*/
        for (int i = 0; i < matriz.length; i++) {
            /*En el bucle, se recorre cada una de las columnas de esa fila
            * Por ejemplo: si i = 0
            * Entonces: 00 01 02 03...*/
            for (int j = 0; j < matriz[i].length; j++) {
                mostrarSinLn("Introduce los elementos de la fila -> "+i+ " y de la columna -> " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
        //mostrar la matriz de forma ordenada
        for (int i = 0; i < 4; i++) {
            mostrar(Arrays.toString(matriz[i]));
        }

        //algorimto que sume los valores de las columnas y sume los valores de las filas
        //y luego comparar si suman lo mismo para indicar que es una matriz mágica
        boolean esMagica = true;
        int sumaTotal = 0;
        //recorremos la fila 0 y sumamos
        for (int i = 0; i < 4 ; i++) {
            sumaTotal += matriz[0][i];
        }
        mostrar("Suma total -> " + sumaTotal);
        //
        for (int j = 0; j < 4; j++) {
            int sumaColumna = 0;
            for (int k = 0; k < 4; k++) {
                sumaColumna += matriz[k][j];
            }
            mostrar("Suma de la columna -> " + sumaColumna);
            if (sumaColumna != sumaTotal) {
                esMagica = false;
            }
        }
        //suma de filas
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 4; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaTotal)
                esMagica = false;
        }
        if (esMagica) mostrar("La matriz es mágica");
        else error("La matriz no es mágica");
    }

    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
        public static void error (String texto) {
            System.err.println("\t" + texto);
        }
}
