package unidad1;

/*Dado un número, para calcular su valor absoluto solo tenemos que saber si es
negativo, en cuyo caso es necesario multiplicarlo por -1, con lo que se
consigue el mismo valor pero con signo positivo.*/

import java.util.Scanner;

public class Actividad1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número (positivo o negativo): ");
        int n = sc.nextInt();
        int valorAbsoluto = n<0?-1*n:n;
        System.out.println("El valor absoluto de " + n + " es " + valorAbsoluto);

    }
}
