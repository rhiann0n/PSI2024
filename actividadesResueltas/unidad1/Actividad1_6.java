package unidad1;
import  java.util.Scanner;
/*Pediremos dos notas enteras y clacularemos la media. Como la media puede
* tener decimales utilizaremos una variable de tipo real.
 */
public class Actividad1_6 {
    public static void main(String[] args) {
        int nota1, nota2; //variables enteras para las notas
        double media; //la media puede contener decimales: usamos double
        Scanner sc = new Scanner(System.in);
        //leemos las notas
        System.out.print("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.print("Nota 2: ");
        nota2 = sc.nextInt ();
        //calculamos la media
        media = (nota1 + nota2) / 2.0;
        //en la expresión, el punto decimal de 2.0 hace que no sea una división entera.
        //El numerador sufre una conversión automática a real en doble precisión y el
        //resultado conserva la parte decimal
        System.out.println("La media es: " + media);



    }
}
