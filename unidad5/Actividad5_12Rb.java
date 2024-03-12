package unidad5;

import java.util.Arrays;

public class Actividad5_12Rb {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(operacion()));
    }

    public static int[][] operacion() {
        int[][] num = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = 10 * i + j;
            }
        }
        mostrarTabla(num);
        return num;
    }

    //forma de recorrer un array bidimensional con un for-each
    public static void mostrarTabla(int[][] num) {
        for (int[] fila : num) {
            for (int col : fila) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}
