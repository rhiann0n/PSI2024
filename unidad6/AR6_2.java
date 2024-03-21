package unidad6;
import java.util.Scanner;
/*Introducir por teclado dos frases e indicar cuál de ellas es
la más corta, es decir, la que contiene menos caracteres.*/
public class AR6_2 {
    /*Leeremos dos cadenas (String), y compararemos sus longitudes.
    * Para obtener el tamaño utilizamos length(). */
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        //leemos las dos frases
        mostrar("Primera frase:");
        String frase1 = sn.nextLine();
        mostrar("Segunda frase:");
        String frase2 = sn.nextLine();
        //calculamos la longitud de cada palabra
        int longFrase1 = frase1.length();
        int longFrase2 = frase2.length();
        //comparamos los tamaños
        if (longFrase1 == longFrase2) {
            mostrar("Son de idéntica longitud");
        } else if (longFrase1 < longFrase2) {
            mostrar(frase1 + " es más corta que " + frase2);
        } else {
            mostrar(frase2 + " es más corta que " + frase1);        }

    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
