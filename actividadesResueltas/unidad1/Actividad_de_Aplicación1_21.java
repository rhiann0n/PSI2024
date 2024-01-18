package unidad1;

import java.util.Scanner;

/*Pide dos números al usuario: a y b. Deberá mostrarse true si ambos
números son iguales y false en caso contrario.*/
public class Actividad_de_Aplicación1_21 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int na;
        int nb;
        boolean resultado;
        System.out.println("Número a: ");
        na = sn.nextInt();
        System.out.println("Número b: ");
        nb = sn.nextInt();
        resultado = na==nb?true:false;
        System.out.println("¿Son iguales?: " + resultado);





    }
}
