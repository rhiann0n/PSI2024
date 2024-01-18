package unidad1;

import java.util.Scanner;

/*Una empresa que gestiona un parque acuático te solicita una aplicación que
les ayude a calcular el importe que hay que cobrar en la taquilla por la compra
de una serie de entradas (cuyo número será introducido por el usuario). Existen
dos tipos de entrada: infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€.
En el caso de que el importe total sea igual o superior a 100€, se aplicará
automáticamente un bono descuento del 5%.*/
public class Actividad_de_Aplicación1_19 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double entradasIn, entradasAd, totalEntradas, descuento;
        System.out.println("Introduce el número de entradas infantiles que desee comprar: ");
        entradasIn = sn.nextInt();
        entradasIn = (entradasIn*15.50);
        System.out.println("Introduce el número de entradas de adultos que desee comprar: ");
        entradasAd = sn.nextInt();
        entradasAd = (entradasAd*20.00);
        totalEntradas = (entradasIn+entradasAd);
        System.out.println("Precio total de las entradas: " + totalEntradas);
        descuento=totalEntradas-(totalEntradas*0.05);
        descuento = totalEntradas >= 100 ? descuento : totalEntradas;
        System.out.println("Precio total: " + totalEntradas + "€ " + " Con descuento: " + descuento + "€");











    }
}
