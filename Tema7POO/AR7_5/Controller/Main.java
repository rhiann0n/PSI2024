package AR7_5.Controller;

import AR7_5.Clases.*;

import java.util.Scanner;

public class Main {
    static Scanner sn = new Scanner (System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int opcion = 0;
        CuentaCorriente nuevoCliente = new CuentaCorriente();
        Gestor elGestor = new Gestor();
        do {
            mostrar("***** B A N C O  P S I *****");
            mostrar("1. Crear Cliente sin saldo");
            mostrar("2. Crear cliente con saldo");
            mostrar("3. Egresar");
            mostrar("4. Ingresar");
            mostrar("5. Mostrar");
            mostrar("6. Cambiar de Banco");
            mostrar("7. Salir");
            mostrarSinLn("Indique su opción -> ");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1 -> {
                    mostrarSinLn("Indique el nombre del Cliente -> ");
                    String nombreT = sn.next();sn.nextLine();
                    mostrarSinLn("Indique el DNI del Cliente -> ");
                    String dniT = sn.next(); sn.nextLine();
                    mostrarSinLn("Nombre del Gestor -> ");
                    String gestorT = sn.next(); sn.nextLine();
                    mostrarSinLn("Indique el teLéfono del Gestor -> ");
                    String telefonoG = sn.next(); sn.nextLine();
                    if (!nombreT.equals("") || !dniT.equals("")) {
                        nuevoCliente.nombreCliente = nombreT;
                        nuevoCliente.setDni(dniT);
                        nuevoCliente.setSaldo(0);
                        elGestor.setNombreGestor(nombreT);
                        elGestor.setTelefono(telefonoG);
                        nuevoCliente.setElGestorCta(elGestor);
                    } else {
                        mostrar("No se puede crear un cliente sin sus datos. Comience de nuevo.");
                    }
                }
                case 2 -> {
                    mostrarSinLn("Indique el nombre del Cliente -> ");
                    String nombreT = sn.next();sn.nextLine();
                    mostrarSinLn("Indique el DNI del Cliente -> ");
                    String dniT = sn.next(); sn.nextLine();
                    mostrarSinLn("Indique el saldo inicial -> ");
                    double saldo = sn.nextDouble();
                    mostrarSinLn("Nombre del Gestor -> ");
                    String gestorT = sn.next(); sn.nextLine();
                    mostrarSinLn("Indique el teLéfono del Gestor -> ");
                    String telefonoG = sn.next(); sn.nextLine();
                    if (!nombreT.equals("") || !dniT.equals("") || saldo != 0) {
                        nuevoCliente.nombreCliente = nombreT;
                        nuevoCliente.setDni(dniT);
                        nuevoCliente.setSaldo(saldo);
                        elGestor.setNombreGestor(nombreT);
                        elGestor.setTelefono(telefonoG);
                        nuevoCliente.setElGestorCta(elGestor);
                    } else {
                        mostrar("No se puede crear un cliente sin sus datos. Comience de nuevo.");
                    }

                }
                case 3 -> {
                    if (nuevoCliente.nombreCliente != null) {

                        mostrarSinLn("Indique el monto a Egresar -> ");
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
                        mostrarSinLn("Indique el importe a Ingresar -> ");
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
                case 6 -> {
                    mostrarSinLn("Indica el nombre del Banco -> ");
                    String nombreBtemp = sn.next(); sn.nextLine();
                    if (!nombreBtemp.equals("")) {
                        CuentaCorriente.setNombreBanco(nombreBtemp);
                    }
                }
                case 7-> mostrar("Saliendo...");
                default -> mostrar("Opción no válida");
            }
        } while (opcion != 7);
    }
    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);
    }
}
