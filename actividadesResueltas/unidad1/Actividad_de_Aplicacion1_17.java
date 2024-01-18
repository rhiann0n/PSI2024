package unidad1;

import java.util.Scanner;

/*Solicita al usuario tres distancias:
* - La primera, medida en milímetros.
* - La segunda, medida en centímetros.
* - La tercera, medida en metros.
Diseña un programa que muestre la suma de las tres longitudes introducidas
(medida en centímetros).*/
public class Actividad_de_Aplicacion1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double milimetros, centimetros, metros;
        System.out.println("Introduzca la medida en milímetros: ");
        milimetros = sc.nextDouble()*10;
        System.out.println("Introduzca la medida en centímetros: ");
        centimetros = sc.nextDouble();
        System.out.println("Introduzca la medida en metros: ");
        metros = sc.nextDouble()/100;
        double totalCentimetros = milimetros+centimetros+metros;
        System.out.println("El total en centímetros es: " + totalCentimetros);






    }
}
