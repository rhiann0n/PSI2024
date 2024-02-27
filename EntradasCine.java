package unidad4;

import java.util.Scanner;
/*App que gestiona la venta de entradas en el cine.
A tener en cuenta:
Las películas tienen calificación (Adultos - TP)
Entradas adultos 6 euros, entradas niños 4,50
Miércoles todas las entradas 4,50
 */
public class EntradasCine {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner sn = new Scanner(System.in);
        final double precioNino = 4.5;
        double precioAdulto = 6;
        double totalEntradas = 0;
        byte miercoles = 0;
        byte opcionMenu = 0;
        String pelicula1 = "Ferrari";
        String pelicula2 = "Priscilla";
        String pelicula3 = "Peppa Cinema Party";
        String pelicula4 = "Pobres Criaturas";
        String pelicula5 = "La Piscina";
        String pelicula6 = "Cazadores de Demonios";
        String peliculaSelecc = "";
        /*Menú de opciones*/
        System.out.println("·····C I N E M A·····");
        System.out.println("\t1." + pelicula1);
        System.out.println("\t2." + pelicula2);
        System.out.println("\t3." + pelicula3);
        System.out.println("\t4." + pelicula4);
        System.out.println("\t5." + pelicula5);
        System.out.println("\t6." + pelicula6);
        System.out.println("\t7. Facturar y Salir");
        System.out.println("·······················");
        opcionMenu = sn.nextByte();
        System.out.println("¿Es miércoles?");
        System.out.println("\t1. Sí \n\t2. No");
        miercoles = sn.nextByte();
        if (miercoles == 1) {
            precioAdulto = 4.50;
        }
        do {
            System.out.println("¿Qué película quieres ver hoy? -> ");
            opcionMenu = sn.nextByte();
            switch (opcionMenu) {
                case 1, 2, 3 -> {
                    System.out.println("Nº de niños: ");
                    totalEntradas += sn.nextDouble() * precioNino;
                    System.out.println("Nº de adultos: ");
                    totalEntradas += sn.nextDouble() * precioAdulto;
                }
                case 4, 5, 6 -> {
                    System.out.println("Nº de adultos: ");
                    totalEntradas += sn.nextDouble() * precioAdulto;
                }
                case 7 -> {
                    System.out.println("\t·····Imprimiendo sus entradas·····");
                }
                default -> System.err.println("OPCIÓN NO VÁLIDA");
            }
        } while (opcionMenu!=7);
        System.out.println("\t········ENTRADAS········");
        System.out.println("\tImporte a pagar -> " + totalEntradas);
        System.out.println("\t·························");






    }
}
