package unidad2;

import java.util.Scanner;

/* Realiza "el juego de la suma", que consiste en que aparezcan dos números
aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar.
La aplicación debe indicar si el resultado de la operación es correcto o incorrecto. */
public class Aplicacion2_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRand1 = (int) (Math.random()*100+1);
        int numRand2 = (int) (Math.random()*100+1);
        int resultado = numRand1 + numRand2;
        System.out.println("Indica el resultado de la suma de " + numRand1 + " + " + numRand2);
        int resulUser = sc.nextInt();
        if(resultado==resulUser){
            System.out.println("Resultado correcto -> " + resultado);
        }else{
            System.out.println("Resultado incorrecto -> ");
        }





    }
}
