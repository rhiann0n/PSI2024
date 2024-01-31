package unidad3;
import java.util.Scanner;
/* PEDIR DIEZ NÚMEROS ENTEROS POR TECLADO Y MOSTRAR LA MEDIA */
/* Como tenemos claro que vamos a solicitar 10 números al usuario, utilizaremos
* un bucle for.
* Sumaremos todos los números introducidos y  al final dividiremos entre 10
* para obtener la media. */
public class ActividadResuelta3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; //cada número introducido por el usuario
        int suma = 0; //acumulará la suma de todos los números introducidos
        double media; //la media puede contener decimales
        for (int i = 1; i <=10; i++) {
            System.out.println("Escriba un número: ");
            n = sc.nextInt();
            suma += n; // es lo mismo que: suma=suma+n
        }
        media = suma / 10.0; //calculamos media
        System.out.println("La media es: " + media); //mostramos
    }
}
