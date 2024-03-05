package unidad4;
/*Escribir una función que calcule de forma recursiva el MCD de dos números.*/
import java.util.Scanner;
/*Para calcular el MCD usaremos, según el caso, una de las dos llamadas
* recursivas:
* - mcd(a, b) = mcd(a-b, b) si a>=b o
* - mcd(a, b) = mcd(a, b-a) si b>a
*
* Ambas llamadas recursivas pueden unificarse en una sola, teniendo en cuenta
* el valor máx. y mín. de a y b. Si min = mínimo(a,b) y max = máximo(a,b), entonces:
* - mcd(min,max)=mcd(min,max-min)
* Y tenemos dos casos bases:
* - mcd(a, b) = a si b es 0
* -mcd (a, b) = b si a es 0*/
public class ActividadResuelta4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, resultado;
        System.out.print("Introduzca primer número: ");
        a = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        b = sc.nextInt();
        resultado = mcd(a, b);
        System.out.println("El MCD es " + resultado);
    }

    //función recursiva para calcular el mcd.
    static int mcd(int a, int b) {
        int resultado;
        if (a == 0) { //primer caso base
            resultado = b;
        } else if (b == 0) {
            resultado = a; //segundo caso base
        } else {
            int min = Math.min(a, b); //valor mínimo entre a y b
            int max = Math.max(a, b); //valor máximo entre a y b
            resultado = mcd(min, max - min); //llamada recursiva

        }
        return (resultado);
    }
}
