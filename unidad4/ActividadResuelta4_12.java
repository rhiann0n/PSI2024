/*Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonacci.
* En esta serie el enésimo valor se calcula sumando los dos valores anteriores de la serie.
* Es decir: fibonacci(n) = fibonacci(n-1)+fibonacci(n-2)
* fibonacci(0) = 1
* fibonacci(1) = 1*/
package unidad4;
import java.util.Scanner;
public class ActividadResuelta4_12 {
    //programa principal para probar la función fibo()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular fibonacci(n)");
        System.out.print("Introduzca n (se recomienda n<40): ");
        int num = sc.nextInt();
        int resultado = fibo(num); // si n es muy grande esto puede tardar bastante
        System.out.println("\nfibonacci(" + num + ") = " + resultado);
    }

    //función recursiva
    static int fibo(int num) {
        int res;
        if (num == 0 || num == 1) { //casos base
            res = 1;
        } else {
            res = fibo(num - 1) + fibo(num - 2); //caso general recursivo
        }
        return (res);
    }
}
