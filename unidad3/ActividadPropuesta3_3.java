package unidad3;

import java.util.Scanner;

/*Implementa un programa que pida al usuario un número positivo y lo
muestre guarismo a guarismo. Por ejemplo, para el número 123, debe mostar
primero el 3, a continuación el 2 y por último el 1.*/
public class ActividadPropuesta3_3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Indica un número positivo y lo mostraré guarismo a guarismo: ");
        int numero = sn.nextInt(); //leemos el número
        int numeroFor=numero; //aquí igualamos
        int unidad = 0; //
        //para mostrarlo voy a calcular el unidad%10 y luego lo divido /10
        //hasta que el número sea 0
        System.out.println("***** Con bucle WHILE *****");
        while (numero>0) {
            unidad = numero%10;
            System.out.println(unidad);
            numero/=10;
        }
        System.out.println("***** Con bucle FOR *****");
        //con bucle for
        for (int i=numeroFor; i>0;i/=10){
            System.out.println(i%10);
        }
    }
}
