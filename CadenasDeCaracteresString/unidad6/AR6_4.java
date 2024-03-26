/* Diseñar una aplicación que pida al usuario que introduzca una frase por teclado
* e indique cuántos espacios en blanco tiene. */
package unidad6;
import java.util.Scanner;
public class AR6_4 {
    /* Vamos a recorrer la cadena introducida por el usuario, comprobando carácter
    * a carácter si coincide con un espacio en blanco. */
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        String frase;
        int numEspaciosBlanco = 0; //contador del nº de espacios en blanco
        char c;
        mostrarSinLn("Escriba una frase: ");
        frase = sn.nextLine();
        for (int i = 0; i < frase.length(); i++) { //recorremos del índice 0 a longitud -1
            c = frase.charAt(i); //vemos cual es el i-ésimo carácter
            if (Character.isSpaceChar(c)) { //es equivalente a: c == ' '
                numEspaciosBlanco++; //incrementamos
            }
        }
        mostrar("Tiene " + numEspaciosBlanco + " espacios en blanco.");
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
