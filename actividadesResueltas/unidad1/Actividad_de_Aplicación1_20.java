package unidad1;

import java.util.Scanner;

/*Solicita al usuario un número real y calcula su raíz cuadrada. Implementa
el programa utilizando el nombre cualificado de las clases, en lugar de utilizar
ninguna importación.*/
public class Actividad_de_Aplicación1_20 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double  numero;
        System.out.println("Indica el número: ");
        numero = Math.sqrt(sn.nextDouble()); //optimización de código, no se declaran nuevas variables
        System.out.println("La raíz cuadrada es: "+ numero);



    }
}
