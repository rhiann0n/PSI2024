package unidad2;

import java.util.Scanner;

public class Aplicacion2_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRand1 = (int) (Math.random()*100+1);
        int numRand2 = (int) (Math.random()*100+1);
        //suma, resta y multiplicación, por lo que las operaciones solo pueden ser 3
        int operacion = (int) (Math.random()*3+1);
        int resultado = 0;
        char simbolo=' ';
        switch (operacion){
            case 1 -> {
                simbolo = '+';
                resultado = numRand1 + numRand2; //suma
            }
            case 2 -> {
                simbolo = '-';
                resultado = numRand1 - numRand2; //resta
            }
            case 3 -> {simbolo = 'x';
            resultado=numRand1 * numRand2; //multiplicación
            }
        }
        System.out.println("¿Cuánto es " + numRand1 + " " + simbolo + " " + numRand2 + " ?");
        int resultUser = sc.nextInt();
        if (resultado==resultUser){
            System.out.println("Operación correcta");
        }else {
            System.out.println("Operación incorrecta");
            System.out.println("Vuelve a primaria, fiera");
        }


        }
    }

