package unidad4;

import java.util.Scanner;

public class Conversor {
    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        mostrar("Indique en € el monto a convertir -> ");
        double euros = sn.nextDouble();
        menu(euros); //llamada a una función con pase de parámetros
    }
    public static void menu (double euros) {
        char opcion;
        do {
            mostrar("\t\n*·*·*·* CONVERSOR DE MONEDA *·*·*·*");
            mostrar("Indica la moneda a convertir");
            mostrar("\ta -> Libras £");
            mostrar("\tb -> Yen Japonés ¥");
            mostrar("\tc -> Dólar (EEUU) $");
            mostrar("\td -> Dólar (Canadá) $");
            mostrar("\tx -> SALIR");

            opcion = sn.next().charAt(0);//0 significa que toma el 1 caracter
            System.out.println(opcion); // cadena 012345 posiciones de un texto
            switch (opcion) {
                case 'a' -> {
                    mostrar(euros + "€ = " + euros * 0.8562 + " £ GBP");
                }
                case 'b' -> {
                    mostrar(euros + "€ = " + euros * 163.24 + "¥ Japonés");
                }
                case 'c' -> {
                    mostrar(euros + "€ = " + euros * 1.0838 + " $ USA");
                }
                case 'd' -> {
                    mostrar((euros + "€ = " + euros * 1.4711 + " $ Canadá"));
                }
                case 'x' -> {
                    mostrar("Pulsa x de nuevo para confirmar");
                    opcion = sn.next().charAt(0);
                    if (opcion != 'x') {
                        menu(euros); //
                    } else {
                        break;
                    }
                }
                default -> mostrar("OPCIÓN NO VÁLIDA");
            }
            } while (opcion != 'x') ;
    }
    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }
}
