package unidad2;
import java.util.Scanner;
/*Leemos dos números enteros, que tendremos que comparar para decidir si son
iguales o distintos.*/
public class Actividad2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n1 = sc.nextInt(); // primer número
        System.out.print("Introduzca otro número: ");
        int n2 = sc.nextInt();
        if (n1 == n2) { //si n1 es igual a n2
            System.out.println("Ambos números son iguales");
        } else {
            System.out.println("Los números son distintos");
        }
    }
}
