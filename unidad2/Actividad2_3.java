package unidad2;

import java.util.Scanner;

/*Leemos dos números (en este caso enteros) que compararemos
con el operador > */
public class Actividad2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        int n2 = sc.nextInt();
        //el caso donde ambos números son iguales no se contempla
        //e imprimiría en pantalla que n2 es mayor que n1
        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else {
            System.out.println(n2 + " es mayor que " + n1);
        }
    }
}
