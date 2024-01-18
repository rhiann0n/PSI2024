package unidad1;
import  java.util.Scanner;
public class Actividad_de_Aplicacion1_13 {
    public static void main(String[] args) {
        int n, suma;
        int aux;
        int m;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: " );
        n= entrada.nextInt();
        System.out.print("Introduce otro número: ");
        m= entrada.nextInt();
        aux= n % m;
        suma= m - aux;
        System.out.print("Hay que sumar "+suma+" para que sea múltiplo de " + m);

    }
}
