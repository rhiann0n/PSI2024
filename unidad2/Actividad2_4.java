package unidad2;
import java.util.Scanner;
import java.util.*;
/*Un número casi-cero es el que se encuentra en el intervalo (-1, 1),
donde se excluye el -1, el 0 y el 1. Para comprobar si un número es
casi-cero tendremos que utilizar una condición con una expresión lógica.*/
public class Actividad2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //para utilizar punto (.) con los decimales
        System.out.print("Introduzca un número real positivo o negativo: ");
        double num = sc.nextDouble();
        //un casi-cero es mayor que -1, menor que 1 y no es 0
        if (-1 < num && num < 1 && num != 0) {
            System.out.println("Es un número casi-cero");
        } else {
            System.out.println("No es un casi-cero");
        }

    }
}
