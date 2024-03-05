package unidad2;
import java.util.Scanner;
/*Los números comprendidos entre 0 y 9, inclusives, tienen una cifra.
Los números comprendidos entre 10 y 99, inclusives, tienen 2 cifras.
Los números comprendidos entre 100 y 999, insclusives, tienen 3 cifras.
Etc.*/
public class Actividad2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        int num = sc.nextInt();
        if (num < 10) {
            System.out.println("Tiene 1 cifra");
        } else if (num < 100) {
            System.out.println("Tiene 2 cifras");
        } else if (num < 1000) {
            System.out.println("Tiene 3 cifras");
        } else if (num < 10000) {
            System.out.println("Tiene 4 cifras");
        } else if (num < 100000) {
            System.out.println("Tiene 5 cifras");
        }
    }
}
