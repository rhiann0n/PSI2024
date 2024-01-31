package unidad3;

import java.util.Scanner;

public class ActividadResuelta3_5b {
    public static void main(String[] args) {
        //declaración de variables
        int operando1, operando2, resultado=0;
        int numeroAcertadas=0, resultadoUser=0;
        byte operacion;
        char simbolo = ' ';
        Scanner sn = new Scanner(System.in);
        do{
            operacion = (byte) (Math.random()*3+1);
            operando1 = (int) (Math.random()*100+1);
            operando2 = (int) (Math.random()*100+1);
            switch (operacion){
                case 1 -> {
                    simbolo = '+';
                    resultado = operando1 + operando2;

                }case 2 -> {
                    simbolo = '-';
                    resultado = operando1 - operando2;
                }case 3 -> {
                    simbolo = '*';
                    resultado = operando1 * operando2;
                }
            }



            System.out.println(operando1 + " " + simbolo + " " + operando2 + "-> ");
            resultadoUser = sn.nextInt();
            numeroAcertadas++;

        }while (resultado==resultadoUser);
        --numeroAcertadas;
        System.out.println("Has acertado: " + numeroAcertadas);
    }
}
