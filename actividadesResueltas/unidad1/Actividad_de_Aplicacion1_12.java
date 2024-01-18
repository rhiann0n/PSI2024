package unidad1;

import java.util.Scanner;

public class Actividad_de_Aplicacion1_12 {
    public static void main(String[] args) {
        /*Escribe un programa que tome como entrada un número entero e indique qué cantidad
        hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
        * - A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7.
        * - A 13 hay que sumarle 1 para que el resultado (13+1=14) sea múltiplo de 7.
        Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o 1, respectivamente.
        Pista: El operador módulo puede ser muy útil para solucionar esta actividad.
        */
        int num, calculo;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        num = sc.nextInt();
        calculo = num % 7;
        calculo = 7 - calculo;
        System.out.println("Hay que sumar: " + calculo + " a " + num + " para que sea múltiplo de 7");







    }
}
