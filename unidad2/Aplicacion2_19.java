package unidad2;

import java.util.Scanner;

/* Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo
y muestre el equivalente en radianes. Si el ángulo introducido por el usuario
no se encuentra en el rango de 0º a 360º, hay que transformarlo a dicho rango.

Nota: el operador módulo puede ayudarnos a convertir un ángulo a su equivalente
en el rango comprendido de 0º a 360º. */
public class Aplicacion2_19 {

    public static void main(String[] args) {
        //indicar los grados y calcular los radianes
        //radianes = grados*pi/180
        //grados%=360;
        Scanner sn = new Scanner(System.in);
        double grados;
        System.out.println("Indica los grados del ángulo: ");
        grados = sn.nextDouble();
        grados%=360;
        double radianes = grados*Math.PI/180;
        System.out.print("Los radianes son  "); //no hace salto de línea
        System.out.printf("%.4f%n", radianes); // redondeará a 4 decimales






    }
}
