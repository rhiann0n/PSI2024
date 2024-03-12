package unidad5;

import java.util.Scanner;

/* En un juego de rol el mapa puede implementarse como una matriz donde
las filas y las columnas representan lugares (lugar 0, lugar 1, lugar 2,
etc.) que estarán conectados. Si desde el lugar X podemos ir hacia el
lugar Y, entonces la matriz en la posición [x][y] valdrá cierto; en
caso contrario, valdrá falso. Escribe una función que, dada una matriz
que representa el mapa y dos lugares, indique si es posible viajar
desde el primer lugar al segundo (directamente o pasando por lugares
intermedios). */
public class ActividadAplicacion5_16 {
    static Scanner sn = new Scanner(System.in);
    static int puntos = 0;
    public static void main(String[] args) {
        int next = 0;
        do {
            mostrar("¿Juegas? 1 -> Sí | 2 -> No");
            next = sn.nextInt();
            if (next == 1)
                partida();
        } while (next!=2);
    }
        //el mapa debe ser booleano
        public static void partida(){
        boolean[][] mapa = {
                {true, false, true, true, false},
                {false, true, false, true, true},
                {true, false, true, false, false},
                {false, false, true, false, true},
                {true, true, false, true, false}
        };
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mostrarSinLn("y=" + i + " | x=" + j);
            }
            mostrar("");
        }
        int x = 0;
        int y = 0;
        //solicitamos el valor de 'x' y de 'y' para buscarlo
        do {
            mostrar("Indique la posición Y de la tabla [0-4]: ");
            y = sn.nextInt();
            mostrar("Indique la posición X de la tabla [0-4]: ");
            x = sn.nextInt();
        } while (y>4||y<0 || x>4||x<0);
        //creamos un contador, donde mostremos las posiciones que tiene que recorrer en el
        //array para llegar al destino
        int contador = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                contador++;
                if (i==y && j==x){
                    mostrar("El resultado es: " + mapa[i][j]);
                    mostrar("Ha recorrido " + contador + " casillas.");
                    if(mapa[i][j]){
                        puntos++;
                    }
                    mostrar("Puntuación: " + puntos);
                    break;
                }
            }
        }
    }
    //MÉTODOS DE IMPRESIÓN EN PANTALLA
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
