package unidad2;

import java.util.Scanner;

/* Utiliza el operador ternario para calcular el valor absoluto de un
número que se solicita al usuario por teclado. */
public class Aplicacion2_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, valorAbsoluto;
        System.out.println("Introduzca un número: ");
        num = sc.nextInt();
        valorAbsoluto = num<0?-1*num:num;
        System.out.println("El valor absoluto del número introducido es: " + valorAbsoluto);






    }
}
