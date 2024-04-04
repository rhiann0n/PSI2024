package CALENDARIO_Irene.Controller;
import CALENDARIO_Irene.Clases.Calendario;

import java.util.Scanner;

//eso es →
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        Calendario fecha1 = null; //invocar la clase vecina y crear objeto, inicializo con null
        int opcion;
        //creo el menú con las opciones
        do {
            mostrar("          Bienvenid@ a         ");
            mostrar("*·*·*·MENÚ DEL CALENDARIO·*·*·*");
            mostrar("_______________________________");
            mostrar("1. Introducir fecha");
            mostrar("2. Incrementar día");
            mostrar("3. Incrementar mes");
            mostrar("4. Incrementar año");
            mostrar("5. Decrementar día");
            mostrar("6. Decrementar mes");
            mostrar("7. Decrementar año");
            mostrar("8. Mostrar fecha");
            mostrar("9. Comparar fechas");
            mostrar("10. Salir");
            mostrar("_______________________________");
            mostrarSinLn("Introduce una opción → ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1 ->{
                    mostrarSinLn("Introduce el año → ");
                    int anyo = sn.nextInt(); //guarda el año
                    mostrarSinLn("Introduce el mes → ");
                    byte mes = sn.nextByte(); //guarda el mes
                    mostrarSinLn("Introduce el día → ");
                    byte dia = sn.nextByte(); //guarda el día
                    fecha1 = new Calendario(anyo, mes, dia);
                }
                case 2 -> {
                    if (fecha1 != null) { //si la fecha no está vacía
                        fecha1.incrementarDia(); //incrementará un día cada vez que se pulse la opción 2
                    } else {
                        error("Primero debes introducir una fecha.");
                    }
                }
                case 3 -> {
                    if (fecha1 != null) { //si la fecha no está vacía
                        fecha1.incrementarMes(); //incrementará un mes cada vez que se pulse la opción 3
                    } else {
                        error("Primero debes introducir una fecha.");
                    }
                }
                case 4 -> {
                    if (fecha1 != null) { //si la fecha no está vacía
                        mostrarSinLn("Introduce la cantidad de años a incrementar → "); //introducimos la cantidad
                        //de años que queremos aumentar de la fecha previamente introducida en la opción 1
                        int cantidad = sn.nextInt(); //se guarda la cantidad introducida
                        fecha1.incrementarAnyo(cantidad); //se incrementa el año
                    } else {
                        error("Primero debes introducir una fecha.");
                    }
                }
                case 5 -> {
                    if (fecha1 != null) {
                        fecha1.decrementarDia();
                    } else {
                        error("Primero debes introducir una fecha.");
                    }
                }
                case 6 -> {
                    if (fecha1 != null) {
                        fecha1.decrementarMes();
                    } else {
                        error("Primero debes introducir una fecha.");
                    }
                }
                case 7 -> {
                    if (fecha1 != null) {
                        int cantidad = sn.nextInt();
                        fecha1.decrementarAnyo(cantidad);
                    } else {
                        error("Primero debes introducir una fecha.");
                    }
                }
                case 8 -> {
                    if (fecha1 != null) { //si la fecha no está vacía
                        fecha1.mostrar(); //mostrará la fecha introducida (o fechas si elegimos la opcion 6
                    } else {
                        error("Primero debes introducir una fecha.");
                    }
                }
                case 9 -> {
                    if (fecha1 != null) { //si la fecha no está vacía
                        mostrar("Introduce la fecha para comparar:");
                        mostrar("Introduce el año → ");
                        int anyo2 = sn.nextInt(); //guarda el año
                        mostrar("Introduce el mes → ");
                        byte mes2 = sn.nextByte(); //guarda el mes
                        mostrar("Introduce el día → ");
                        byte dia2 = sn.nextByte(); //guarda el día
                        Calendario fecha2 = new Calendario(anyo2, mes2, dia2);
                        mostrarSinLn("¿Las fechas son iguales? → " + fecha1.iguales(fecha2)); //
                    } else {
                        error("Primero debes introducir una fecha.");
                    }
                }
                case 10 -> mostrar("Saliendo del Calendario...");
                default -> error("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 10);
    }

    //MÉTODOS PARA MOSTRAR EN CONSOLA
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
        public static void error (String texto) {
            System.err.print("\t" + texto);
        }
}