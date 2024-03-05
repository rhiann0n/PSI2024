package unidad1;

import java.util.Scanner;

/*La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza
una competición donde cada participante escribe un algoritmo en un papel
y lo lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del
concurso es que la longitudo del lanzamiento se mide en metros (con tantos
decimales como se desee), pero para el ranking solo se tiene en cuenta la
longitud en centímetros (sin decimales). Por ejemplo, para un lanzamiento
de 12,3456m (que son 1234,56 cm) solo se contabilizarán 1234 cm.
Realiza un programa que solicite la longitud (en metros) de un lanzamiento
y muestre la parte entera correspondiente en centímetros.*/
public class Actividad_de_Aplicación1_22 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int metros, centimetros;
        System.out.println("Introduzca la longitud (en metros): ");
        metros = sn.nextInt();
        centimetros = metros*100;
        System.out.println("Centímetros: " + centimetros);





    }
}
