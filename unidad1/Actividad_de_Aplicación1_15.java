package unidad1;
import java.util.Scanner;
/*Dado el siguiente polinomio de segundo grado:
                                                y=ax^2+bx+c
crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula
el valor correspondiente de y.
 */
public class Actividad_de_Aplicación1_15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b, c, x, y;
        System.out.println("Introduzca el valor del coeficiente a: ");
        a = sc.nextInt();
        System.out.println("Introduzca el valor del coeficiente b: ");
        b = sc.nextInt();
        System.out.println("Introduzca el valor del coeficiente c: ");
        c = sc.nextInt();
        System.out.println("Introduzca el valor de x: ");
        x = sc.nextInt();
        y = (int) ((a * (Math.pow(x,2))) + (b*x) + c);
        System.out.println("El valor de y es: " + y);











    }
}
