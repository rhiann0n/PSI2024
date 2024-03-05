package unidad1;

import java.util.Scanner;
import java.util.Locale;
public class Actividad1_14 {
    public static void main(String[] args) {
        /*Cuando se importan múltiples clases de un mismo paquete, en lugar de escribir
        un import para cada clase, existe la opción de usar: import java.util.*;// que importa las clases
        necesarias de java.util*/
        /*Redondear un número decimal significa aproximarlo al entero más cercano.
        Para ello, lo que haremos será sumar 0.5 y truncar (eliminar los decimales)
        el resultado. Así los números:
        2.3 se redondea a 2
        4.8 se redondea a 5*/

        double n; //aquí guardamos el número decimal introducido por el usuario
        int redondeo; //utilizamos esta variable para truncar los decimales
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Escriba un número decimal (con punto): ");
        n = sc.nextDouble();
        //ahora redondearemos n
        redondeo = (int) (n + 0.5); //convertimos un real en un entero.
        //Esta es una conversión por estrechamiento, por lo tanto estamos
        //obligados a apliar un cast (int). En caso de no hacerlo el
        //compilador generará un error.
        System.out.println(n + " redondeado es: " + redondeo);



    }
}
