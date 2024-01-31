package unidad2;

/*Escribe una aplicación que solicite por consola dos números reales que correspondan
a la base y la altura de un triángulo. Deberá mostrarse su área, comprobando que los
números introducidos por el usuario no son negativos, algo que no tendría sentido.*/

import java.util.Locale;
import java.util.Scanner;

public class Aplicacion2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double base, altura, areaTriangulo;
        System.out.print("Introduzca la base: ");
        base = sc.nextDouble();
        System.out.println("Introduzca la altura: ");
        altura = sc.nextDouble();
        if (base>0 && altura>0 ) {
            areaTriangulo = ((base * altura) / 2);
            System.out.println("El área del triángulo es de: " + areaTriangulo);
        } else {
            System.out.println("El área del triángulo no se puede calcular");


        }


    }
}
