package unidad4;

import java.util.Scanner;

public class Calculadora {
    static double resultado;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        System.out.println(" _______________________ ");
        System.out.println("|  CALCULADORA EN JAVA  |");
        System.out.println("|                       |");
        System.out.println("|  1. Sumar             |");
        System.out.println("|  2. Restar            |");
        System.out.println("|  3. Multiplicar       |");
        System.out.println("|  4. Dividir           |");
        System.out.println("|  5. Raíz cuadrada     |");
        System.out.println("|  6. Exponencial       |");
        System.out.println("|  x. SALIDA            |");
        System.out.println(" _______________________ ");
        int opcion = entrada.nextInt();
        operaciones(opcion);
    }
    static void operaciones(int opcion) {
        int numero1 = 0, numero2 = 0, base = 0, exponente = 0;
        if (opcion >= 1 && opcion <= 4) {
            System.out.println("Ingrese el primer número -> ");
            numero1 = entrada.nextInt();
            System.out.println("Ingrese el segundo número -> ");
            numero2 = entrada.nextInt();
        }
        switch (opcion) {
            case 1 -> resultado = numero1 + numero2;
            case 2 -> resultado = numero1 - numero2;
            case 3 -> resultado = numero1 * numero2;
            case 4 -> resultado = (double) numero1 / numero2;
            case 5 -> {
                System.out.println("Ingrese el número del que quiere saber la Raíz Cuadrada -> ");
                base = entrada.nextInt();
                resultado = Math.sqrt(base);
            }
            case 6 -> {
                System.out.println("Ingrese la base -> ");
                base = entrada.nextInt();
                System.out.println("Ingrese el exponente -> ");
                exponente = entrada.nextInt();
                resultado = Math.pow(base, exponente);
            }
            default -> {
                System.err.println("OPCIÓN NO VÁLIDA");
                menu();
            }
        }
        System.out.println("El resultado es " + resultado);
    }
}

