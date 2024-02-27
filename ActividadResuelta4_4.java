package unidad4;
/*Diseñar una función que recibe como parámetros dos números enteros y
* devuelve el máximo de ambos. */
import java.util.Scanner;
//En caso de que ambos números sean iguales, el algoritmo también es válido.
public class ActividadResuelta4_4 {
    //compara los parámetros, a y b, y devuelve el mayor de ambos
    static int maximo(int a, int b) {
        int max;
        if (a > b) { //si a es mayor que b
            max = a;
        } else { //si son iguales o b mayor que a
            max = b;
        }
        return (max); //devuelve el valor de la variable max
    }
    /* main para probar la función*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int a = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        int b = sc.nextInt();
        System.out.println("El número mayor es: " + maximo(a, b));
    }
}