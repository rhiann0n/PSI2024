package AR7_9.Controller;

import AR7_9.Clases.Bombilla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sn = new Scanner(System.in);
        Bombilla salon = new Bombilla();
        Bombilla cocina = new Bombilla();
        Bombilla dorm1 = new Bombilla();
        Bombilla banyo = new Bombilla();
        int opcion;
        do {
            System.out.println("Menú de Interruptores de la CASA");
            System.out.println("1. Salón -> " + salon.mostrarEstado());
            System.out.println("2. Cocina -> " + cocina.mostrarEstado());
            System.out.println("3. Dormitorio -> " + dorm1.mostrarEstado());
            System.out.println("4. Baño -> " + banyo.mostrarEstado());
            System.out.println("5. Interruptor General -> " + Bombilla.interruptorGeneral);
            System.out.print("Indica tu opción -> ");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1 -> salon.apagarEncender();
                case 2 -> cocina.apagarEncender();
                case 3 -> dorm1.apagarEncender();
                case 4 -> banyo.apagarEncender();
                case 5 -> Bombilla.interruptorGeneral = !Bombilla.interruptorGeneral;
                case 6 -> System.out.println("SALIENDO DEL SISTEMA...");
                default -> System.err.println("Opción no válida");
            }
        } while (opcion != 6);
    }
}
