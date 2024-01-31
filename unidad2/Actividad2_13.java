package unidad2;

import java.util.Scanner;

public class Actividad2_13 {
    public static void main(String[] args) {
        /* Escribir un programa que pida una hora así: hora, minutos y segundos.
        El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
        hora actual [10:41:59] → hora actual +1 segundo: [10:42:00]
        Suponemos que la hora introducida por el usuario es correcta. El algoritmo
        incrementa los segundos en 1. Esto puede hacer que salgan del rango 0..59, en
        este caso, pondremos los segundos a 0 e incrementamos los minutos.
        Igualmente, tenemos que comprobar que los minutos no se salgan de rango. E igual
        para las horas.*/

        Scanner sc = new Scanner(System.in);
        int h, m, s; //horas, minutos, segundos
        System.out.print("Introduzca hora: ");
        h = sc.nextInt();
        System.out.println("Introduzca minutos: ");
        m = sc.nextInt();
        System.out.println("Introduzca segundos: ");
        s = sc.nextInt();
        s++; //incrementamos los segundos
        if (s > 59) { //si los segundos superan 59
            s = 0; //los reiniciamos a 0
            m++; //e incrementamos los minutos
            if (m > 59) { //si los minutos superan 59
                m = 0; //los reiniciamos a 0
                h++; //e incrementamos la hora
                if (h > 23) { //si la hora supera 23
                    h = 0; //reiniciamos la hora a 0


                }
            }
        }
        System.out.println("Hora + 1 segundo: " + h + ":" + m + ":" + s);
    }
}