/*Diseñar un algoritmo que lea del teclado una frase e indique, para cada letra que
* aparece en la frase, cuántas veces se repite. Se consideran iguales las letras mayúsculas
* y las minúsculas para realizar la cuenta.*/
package unidad6;
import java.util.Scanner;
/*Vamos a utilizar una tabla de contadores (numVeces) donde cada elemento de la tabla
* corresponde a una letra y donde se almacena el número de veces que aparece en la frase
* dicha letra. numVeces tendrá tantos elementos como letras tiene el alfabeto, es decir,
* 'z'-'a'+1 elementos. Las letras del abecedario tienen valores Unicode correlativos.
* A un carácter cualquiera c, le corresponde el elemento de la tabla con posición c-'a':
* numVeces[c-'a'], se incrementa cada vez que haya una ocurrencia de c en la frase.*/
public class AR6_13 {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        String frase;
        int[] numVeces; //contador de las ocurrencias de cada letra
        mostrarSinLn("Introduzca una frase: ");
        frase = sn.nextLine();
        //para contabilizar también las mayúsculas pasamos todo a minúsuculas
        frase = frase.toLowerCase();
        //cada posición de numVeces guardará el nº de ocurrencias de una letra
        //numVeces[0] para la 'a', numVeces[1] para la 'b', etc
        numVeces = new int['z'-'a'+1]; //tantas componentes como letras
        //la tabla se crea con todos los elementos inicializados a 0
        for (int i = 0; i < frase.length(); i++) { //recorre la frase carácter a carácter
            if (Character.isLetter(frase.charAt(i))) { //si el i-ésimo carácter es una letra
                numVeces[frase.charAt(i)-'a']++; //incrementamos el contador de esa letra
            }
        }
        for (int i = 0; i < 'z' - 'a' + 1; i++) { //mostramos numVeces
            if (numVeces[i] != 0) {
                mostrar("La letra " + (char) (i + 'a') + " se repite " + numVeces[i] + " veces");
            }
        }
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
