/*Realizar un programa que lea una frase del teclado y nos indique si es
palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha,
que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de
frase palíndroma es: «Dabale arroz a la zorra el abad». Las vocales con tilde
hacen que los algoritmos consideren una frase palíndroma como si no lo fuese.
Por esto, supondremos que el usuario introduce la frase sin tildes.*/
package unidad6;
import java.util.Scanner;
/* La frase "Dabale arroz a la zorra el abad" es palíndroma si no tenemos encuentra
*  los espacios en blanco. Por lo tanto, lo primero que tenemos que hacer, es eliminarlos.
*  A continuación, vamos a construir la frase invertida. Si ambas, original e* invertida,
*  coinciden es porque la frase original es palíndroma.* Nota: escribiremos las frases sin
*  vocales acentuadas. */
public class AR6_10 {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        String frase, sinEspacios, invertida;
        mostrarSinLn("Introduzca una frase: ");
        frase = sn.nextLine();
        frase = frase.toLowerCase(); //trabajamos con las letras en minúsculas
        sinEspacios = eliminaEspacios(frase); //devuelve una cadena sin espacios
        invertida = alReves (sinEspacios); //Definida en la Act. Resuelta 6.5
        if (sinEspacios.equals(invertida)) {
            mostrar("La frase es palíndroma");
        } else {
            error("La frase no es palíndroma");
        }
    }
    //La función construye y devuelve una cadena idéntica a la pasada, con la diferencia
    //que se han eliminado todos los espacios en blanco
    static String eliminaEspacios(String cadena) {
        String sin = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i); //miramos el carácter en la i-ésima posición
            if (!Character.isWhitespace(c)) { //si no es un carácter blanco
                sin = sin + c; //construimos la cadena sin con c (que no es un blanco)
            }
        }
        return sin;
    }
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
        public static void error (String texto) {
            System.err.println("\t" + texto);
        }
}