package unidad2;
import java.util.Scanner;
/*Supondremos que todos los números introducidos por teclado son distintos.
Para el caso de números iguales solo hay que utilizar el operador >=
Vamos a plantear tantos condicionales como casos existen con tres números.*/
public class Actividad2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c; //números a ordenar
        System.out.print("Introduzca primer número: ");
        a = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        b = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        c = sc.nextInt();
        if (a > b && b > c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a > c && c >b) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (b > a && a > c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b > c && c > a) {
            System.out.println(b + ", " + c + ", " + a);
        } else if (c > a && a > b) {
            System.out.println(c + ", " + a + ", " + b);
        } else if (c > b && b > a) {
            System.out.println(c + ", " + b + ", " + a);
        }
    }
}
