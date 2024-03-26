package AR7_1.Controller;

import AR7_1.Clases.CuentaCorriente;

import java.util.Scanner;

public class Main {
    static Scanner sn = new Scanner (System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int opcion = 0;
        CuentaCorriente nuevoCliente = new CuentaCorriente();
        do {
            mostrar("***** B A N C O  P S I *****");
            mostrar("1. Crear Cliente");
            mostrar("2. Egresar");
            mostrar("3. Ingresar");
            mostrar("4. Mostrar");
            mostrar("5. Salir");
            mostrarSinLn("Indique su opción -> ");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1 -> {
                    mostrar("Indique el nombre del Cliente -> ");
                    String nombreT = sn.next();sn.nextLine();
                    mostrar("Indique el DNI del Cliente -> ");
                    String dniT = sn.next(); sn.nextLine();
                    if (!nombreT.equals("") || !dniT.equals("")) {
                        nuevoCliente.nombreCliente = nombreT;
                        nuevoCliente.dni = dniT;
                    } else {
                        mostrar("No se puede crear un cliente sin sus datos. Comience de nuevo.");
                    }
                }
                case 2 -> {
                    if (nuevoCliente.nombreCliente != null) {

                        mostrar("Indique el monto a Egresar -> ");
                        double importe = sn.nextDouble();
                        if (nuevoCliente.egreso(importe)) {
                            mostrar("Egresando saldo...");
                        } else {
                            mostrar("No existe Cliente para Egresar saldo");
                        }
                    }
                }
                case 3 -> {
                    if (nuevoCliente.nombreCliente!=null) {
                        mostrar("Indique el importe a Ingresar -> ");
                        double ingreso = sn.nextDouble();
                        nuevoCliente.ingresar(ingreso);
                        mostrar("Ingresando saldo...");
                    } else {
                        mostrar("No existe cliente para Ingresar saldo");
                    }
                }
                case 4 -> {
                    if (nuevoCliente.nombreCliente!=null) {
                nuevoCliente.mostrarInfo();
                } else {
                        mostrar("No existe Cliente que mostrar");
                    }
                }
                case 5 -> mostrar("Saliendo...");
                default -> mostrar("Opción no válida");
            }
        } while (opcion != 5);
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
