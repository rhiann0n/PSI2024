package unidad2;
import java.util.Scanner;
//En esta versión contemplamos la posibilidad de que ambos números sean iguales.
public class Actividad2_6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            //si no son iguales podemos decidir cuál es el mayor
            if (n1 > n2) {
                System.out.println(n1 + " es mayor que " + n2);
            } else {
                System.out.println(n2 + " es mayor que " +  n1);
            }
        }
    }
}
