package unidad4;
/*Diseñar una función que calcule a elevado a n, donde a es real y n es entero
* no negativo. Realizar una versión iterativa y otra recursiva.*/
import java.util.*;
public class ActividadResuelta4_10a {
    //El exponente podrá ser 0, pero la base no. Ya que 0 elevado a 0 no está definido.
    static double aElevadoN(double a, int n) {
        double res = 1; //el resultado se inicializa a 1, ya que multiplicamos
        for (int i = 1; i <= n; i++) {
            res = res * a; //multiplicamos
        }
        return (res);
    }
    //programa principal para probar la función
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //para permitir puntos (.) en los decimales
        System.out.print("Introduzca base (real): ");
        double base = sc.nextDouble();
        System.out.print("Introduzca exponente (entero no negativo): ");
        int exp = sc.nextInt();
        double res = aElevadoN(base, exp);
        System.out.println(base + " elevado a " + exp + " = " + res);
    }
}
