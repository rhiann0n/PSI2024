package unidad2;
import java.util.Scanner;
/* Para ordenar dos números hay que compararlos. Es posible hacer el
programa usando if-else, pero en este caso vamos a hacerlo con el
operador ternario.*/
public class Actividad2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2; //números introducidos por el usuario
        int mayor, menor; //contendrán el mayor y el menor de n1 y n2
        System.out.print("Introduzca un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        n2 = sc.nextInt();
        mayor = n1>n2 ? n1 : n2; // si n1 es el mayor, entonces mayor=n1,
        //si no = n2
        menor = n1<n2 ? n1 : n2; // si n1 es menor que n2, entonces
        // menor=n1, si no = n1
        System.out.println(mayor + ", " + menor);
    }
}
