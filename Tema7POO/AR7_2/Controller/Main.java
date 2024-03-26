package AR7_2.Controller;
import AR7_2.Clases.CuentaCorriente;


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
            mostrar("1. Crear Cliente sin saldo");
            mostrar("2. Crear cliente con saldo");
            mostrar("3. Egresar");
            mostrar("4. Ingresar");
            mostrar("5. Mostrar");
            mostrar("6. Salir");
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
                        nuevoCliente.saldo=0;
                    } else {
                        mostrar("No se puede crear un cliente sin sus datos. Comience de nuevo.");
                    }
                }
                case 2 -> {
                    mostrar("Indique el nombre del Cliente -> ");
                    String nombreT = sn.next();sn.nextLine();
                    mostrar("Indique el DNI del Cliente -> ");
                    String dniT = sn.next(); sn.nextLine();
                    mostrar("Indique el saldo inicial -> ");
                    double saldo = sn.nextDouble();
                    if (!nombreT.equals("") || !dniT.equals("") || saldo != 0) {
                        nuevoCliente.nombreCliente = nombreT;
                        nuevoCliente.dni = dniT;
                        nuevoCliente.saldo =saldo;
                    } else {
                        mostrar("No se puede crear un cliente sin sus datos. Comience de nuevo.");
                    }

                }
                case 3 -> {
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
                case 4 -> {
                    if (nuevoCliente.nombreCliente!=null) {
                        mostrar("Indique el importe a Ingresar -> ");
                        double ingreso = sn.nextDouble();
                        nuevoCliente.ingresar(ingreso);
                        mostrar("Ingresando saldo...");
                    } else {
                        mostrar("No existe cliente para Ingresar saldo");
                    }
                }
                case 5 -> {
                    if (nuevoCliente.nombreCliente!=null) {
                nuevoCliente.mostrarInfo();
                } else {
                        mostrar("No existe Cliente que mostrar");
                    }
                }
                case 6 -> mostrar("Saliendo...");
                default -> mostrar("Opción no válida");
            }
        } while (opcion != 6);
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
