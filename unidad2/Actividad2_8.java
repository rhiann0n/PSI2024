package unidad2;
import java.util.*;
/*Para cualcular las soluciones de una ecuación de segundo grado hay
que aplicar una sencilla fórmula. El único inconveniente es comprobar
que no existan divisiones por 0 o que no calculemos la raíz cuadrada de
un número negativo. Estos errores producen una parada de la ejecución
del programa.*/
public class Actividad2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a, b, c; // coeficientes ax2 + bx + c = 0
        double x1, x2, d; //soluciones y discriminante.
        System.out.print("Introduzca primer coeficiente (a): ");
        a = sc.nextDouble();
        System.out.print("Introduzca segundo coeficiente (b): ");
        b = sc.nextDouble();
        System.out.print("Introduzca tercer coeficiente (c): ");
        c = sc.nextDouble();
        //calculamos el discriminante
        d = (b * b - 4 * a * c);
        if (d < 0) { //como hay que calcular la raíz cuadrada de d,
            //este no puede ser negativo
            System.out.println("No existen soluciones reales");
        } else {
            //si a=0 se produce una división por cero. Y en este caso,
            //ni siquiera sería una ecuación de 2º grado
            if (a == 0) { // si a es igual a 0
                System.out.println("No es una ecuación de segundo grado");
            } else {
                x1 = (-b + Math.sqrt(d))/(2 * a); //sqrt() calcula la raíz cuadrada
                x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
            }
        }

    }
}
