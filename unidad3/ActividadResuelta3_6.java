package unidad3;
import java.util.Scanner;
/* Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
todos los números del 1 a n. */
/* Sabemos con certeza el número de iteraciones del bucle: n, por lo que
* utilizaremos un bucle for que recorrerá todos los números de 1 a n. */
public class ActividadResuelta3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // i tomará los valores de 1 a n
            //la variable i es una variable del bloque de instrucciones del for, es
            //decir, solo se puede utilizar dicho bloque (su ámbito es el bloque)
            //utilizar la variable i fuera del bloque genera un error
            System.out.println(i); //mostramos i
        }

    }
}
