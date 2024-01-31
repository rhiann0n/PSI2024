package unidad2;

import java.util.Scanner;

public class Propuesta2_5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int aforo, numVendidas;
        double precioEntrada, recaudacion;
        System.out.println("Indique el precio por entrada");
        precioEntrada = sn.nextDouble();
        System.out.println("Indique el aforo del local");
        aforo = sn.nextInt();
        System.out.println("Indique el número de entradas vendidas");
        numVendidas = sn.nextInt();
        //cálculo de la recaudación
        recaudacion = numVendidas * precioEntrada;
        //Tomar decisiones basadas en el aforo
        if (numVendidas < aforo * 0.2) {
            System.out.println("Se cancela el concierto");
        } else if (numVendidas < aforo * 0.5) {
            precioEntrada = (precioEntrada * 0.25);
            recaudacion = numVendidas * precioEntrada;
        } else {
            System.out.println("El concierto se celebra");

        }

        System.out.println("La recaudación del concierto es de " + recaudacion + "€");





    }
}
