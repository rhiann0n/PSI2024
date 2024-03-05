package unidad4;
import java.util.*;
/*Las funciones recursivas suelen tener la misma estructura:
* - caso base: que permite salir de la recursividad
* - llamada recursiva.
* En nuestro caso: el caso base es aElevadoN(x, 0) = 1
* y la llamada recursiva: aElevadoN(a, n) = aElevadoN(a, n-1)*a */
public class ActividadResuelta4_10b {
    //programa principal para probar la función aElevadoN(), de forma recursiva
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Introduzca base (real): ");
        double base = sc.nextDouble();
        System.out.print("Introduzca el exponente: ");
        int exp = sc.nextInt();
        System.out.println("El resultado es " + aElevadoN(base, exp));
    }

    static double aElevadoN(double a, int n) {
        double res;
        if (n == 0) { //caso base
            res = 1; //a elevado a 0 es 1
        } else {
            res = a * aElevadoN(a, n - 1); //llamada recursiva
        }
        return (res);
    }
}
