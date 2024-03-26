/* Diseñar una función a la que se le pase una cadena de caracteres y la devuelva
* invertida. Un ejemplo, la cadena "Hola mundo" quedaría "odnum aloH". */
package unidad6;
import java.util.Scanner;
//Vamos a crear una función a la que se le pasa una cadena y la devuelve invertida.
public class AR6_5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        String antes, despues;
        mostrarSinLn("Escriba una cadena: ");
        antes = sn.nextLine();
        despues = alReves(antes); //utilizamos la función
        mostrar(despues); //mostramos
    }
    //Vamos a recorrer la cadena original en el sentido de la escritura: de
    //izquierda a derecha. Cada carácter se concatenará al principio de la
    //cadena nueva. Con lo que conseguimos invertirla.
    static String alReves(String original) {
        String nueva = "";
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva; //concatenamos el carácter antes que nueva
        }
        return nueva;
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
