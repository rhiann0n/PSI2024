/* Diseñar un programa que solicite al usuario una frase y una palabra.
* A continuación buscar cuántas veces aparece la palabra en la frase. */
package unidad6;
import java.util.Scanner;
/* Buscamos la palabra en la frase usando el método indexOf(), una vez encontrada
*  la primera ocurrencia (en el índice pos) seguiremos buscando, a partir de pos,
*  por si existe otra ocurrencia. Y así sucesivamente hasta qu eno encontremos
*  más (pos será -1). */
public class AR6_7 {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        String frase, palabra;
        int veces = 0, pos; //variables contador y posición
        mostrarSinLn("Introduzca una frase: ");
        frase = sn.nextLine(); //lee cualquier carácter hasta pulsar Intro
        mostrarSinLn("Introduzca una palabra: ");
        palabra = sn.next(); //solo lee una palabra: sin espacios
        pos = frase.indexOf(palabra); //buscamos la primera ocurrencia
        while (pos != -1) { //mientras pos no sea -1, no hemos encontrado la palabra
            veces++; //si hemos encontrado una ocurrencia, incrementamos veces
            pos = frase.indexOf(palabra, pos + 1); //volvemos a buscar a partir de la
            //posición siguiente a pos, por si encontramos otra ocurrencia de palabra
        }
        //cuando salimos del bucle es que ya no existen más ocurrencias
        if (veces == 0) { //no hemos encontrado la palabra en la frase
            mostrar("\"" + palabra + "\" no se encuentra en la frase");
        } else {
            mostrar("\"" + palabra + "\" está " + veces + " veces.");
        }
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
