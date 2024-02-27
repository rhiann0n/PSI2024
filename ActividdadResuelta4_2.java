package unidad4;

import java.util.Scanner;

public class ActividdadResuelta4_2 {
    /*Escribir una función a la que se le pasen dos enteros y muestre todos los números
     * comprendidos entre ellos.*/
    //Tenemos que saber si los números están en orden creciente o decreciente.
    //la función ordena los valores pasados y los utiliza com valores de un bucle "for"
    static void mostrar(int a, int b) {
        int mayor = a > b ? a : b; //asignamos a 'mayor' el mayor entre a y b
        int menor = a < b ? a : b; //y en 'menor' el más pequeño entre a y b
        for (int i = menor; i <= mayor; i++) { //siempre iremos del menor al mayor
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        int b = sc.nextInt();
        mostrar(a, b);
    }
}
