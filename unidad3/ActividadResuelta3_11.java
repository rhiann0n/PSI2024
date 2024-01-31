package unidad3;

import java.util.Scanner;

public class ActividadResuelta3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //podríamos declarar factorial de tipo long, el tamaño de este tipo permite
        //calcular hasta el factorial de 25. Mejor utilizar un double
        double factorial;
        int num;
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        factorial =1; //es importante inicializarlo a 1, ya que multiplicará
        for (int i= num; i > 0; i--) {
            factorial*=i;
        }
        System.out.println("El factorial de " + num + " es " + factorial);

    }
}
