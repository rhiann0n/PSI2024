package unidad1;
import java.util.*;
import java.util.Scanner;

public class Actividad_de_Aplicación1_14 {
    public static void main(String[] args) {
        /*Crea un programa que pida la base y la altura de un triángulo y muestre su área.
        Área triángulo = (base*altura)/2. Pista:
         */
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double base, altura, areaTriangulo;
        System.out.print("Introduzca la base: ");
        base = sc.nextDouble();
        System.out.println("Introduzca la altura: ");
        altura = sc.nextDouble();
        areaTriangulo= ((base*altura)/2);
        System.out.println("El área del triángulo es de: " + areaTriangulo);







    }
}
