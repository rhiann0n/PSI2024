package unidad2;

import java.util.Scanner;
/*Escribe un programa que solicite al usuario un número comprendido entre 1 y 99.
El programa debe mostrarlo con letras, por ejemplo, para 56, se verá: "cincuenta y seis".*/
public class Aplicacion2_14 {
    public static void main(String[] args) {
        //Declarar variables
        byte num; //leer el número
        String salida = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("********  ~NÚMERO A LETRAS~  ********");
        System.out.println("*--------*--------*--------*--------*");
        System.out.println("Por favor, ingrese un número de 1 a 99: ");
        num = sc.nextByte();
        /* 1 - Números especiales (no se pueden hacer concatenados): 11, 12, 13, 14, 15, 16, 17, 18, 19,...
        así hasta 29. Hay que hacerles un switch.
        2 - Calculamos las decenas byte u=num%10; d=num/10 -> switch con las decenas -> diez, veinte, treinta...
        3 - Si u!=0 creamos una condición a concatenar con "y"
        4 - Switch de unidades del 1 al 9

        *Lógica -> hacer un switch del 1 al 99 escribiendo todos los posibles resultados
         */
        //Desarrollo de la lógica

        switch (num) {
            case 11 -> salida = "Once";
            case 12 -> salida = "Doce";
            case 13 -> salida = "Trece";
            case 14 -> salida = "Catorce";
            case 15 -> salida = "Quince";
            case 16 -> salida = "Dieciséis";
            case 17 -> salida = "Diecisiete";
            case 18 -> salida = "Dieciocho";
            case 19 -> salida = "Diecinueve";
            case 20 -> salida = "Veinte";
            case 21 -> salida = "Veintiuno";
            case 22 -> salida = "Veintidós";
            case 23 -> salida = "Veintitrés";
            case 24 -> salida = "Veinticuatro";
            case 25 -> salida = "Veinticinco";
            case 26 -> salida = "Veintiséis";
            case 27 -> salida = "Veintisiete";
            case 28 -> salida = "Veintiocho";
            case 29 -> salida = "Veintinueve";
            default -> {
                byte u = (byte) (num % 10);
                int d = num / 10;
                switch (d) {
                    case 1 -> salida = "diez";
                    case 2 -> salida = "veinte";
                    case 3 -> salida = "treinta";
                    case 4 -> salida = "cuarenta";
                    case 5 -> salida = "cincuenta";
                    case 6 -> salida = "sesenta";
                    case 7 -> salida = "setenta";
                    case 8 -> salida = "ochenta";
                    case 9 -> salida = "noventa";
                }

                //Luego si la decena es mayor o igual a 3 y la unidad es distinta a 0
                if (d >= 3 && u != 0) {
                    salida += " y ";
                }
                switch (u) {
                    case 1 -> salida += "uno";
                    case 2 -> salida += "dos";
                    case 3 -> salida += "tres";
                    case 4 -> salida += "cuatro";
                    case 5 -> salida += "cinco";
                    case 6 -> salida += "seis";
                    case 7 -> salida += "siete";
                    case 8 -> salida += "ocho";
                    case 9 -> salida += "nueve";
                }

            }
                }

        System.out.println("El número escrito es " + salida);
        }


    }

