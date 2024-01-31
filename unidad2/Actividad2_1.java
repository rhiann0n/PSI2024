package unidad2;
import java.util.Scanner;
public class Actividad2_1 {
    public static void main(String[] args) {
        /*Vamos a introducir por teclado un número entero. Para saber si es par
        o impar comprobamos el resto de dividir por 2. */
        Scanner sc = new Scanner (System.in);
        int num; //número introducido por el usuario
        System.out.println("Introduzca un número: ");
        num = sc.nextInt();
        if (num % 2 == 0) { //si num es par
            System.out.println("Es par");
        } else { // es impar
            System.out.println("Es impar");
        }
    }
}
