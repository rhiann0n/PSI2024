package unidad4;
import java.util.Scanner;
public class CalculadoraIMCb {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        double p, e, imc; //variables de peso, estatura e índice de masa corporal
        // ENTRADAS
        System.out.println("Introduzca el peso en kilos ->  ");
        p = sn.nextDouble();
        System.out.println("Introduzca la estatura en metros -> ");
        e = sn.nextDouble();

        //CALCULO
        imc = p/(e*e);

        System.out.println("SU IMC ES: " + imc);

        //BUCLE, tipos de IMC

        if (imc<18.5) {
            System.out.println("INFRAPESO");
        } else if (imc>=18.5 && imc<=24.9) {
            System.out.println("NORMOPESO");
        } else if (imc>=25 && imc<=29.9) {
            System.out.println("SOBREPESO");
        } else {
            System.out.println("OBESIDAD");
        }
    }
}

