/* Introducir por teclado una frase palabra a palabra, y mostrar la frase
completa separando las palabras introducidas con espacios en blanco. Terminar
de leer la frase cuando alguna de las palabras introducidas sea la cadena
«fin» escrita con cualquier combinación de mayúsculas y minúsculas. La cadena
«fin» no aparecerá en la frase final. */
package unidad6;
import java.util.Scanner;
/* Vamos a leer una serie de palabras que iremos concatenando. Hay que comprobar
*  cada palabra leída por si coincide con alguna combinación de mayúsculas/minúsculas
*  de la cadena "fin". */
public class AR6_9 {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        String frase = "", palabra; //frase debe inicializarse con la cadena vacía
        //ya que vamos a concatenarle otra cadena.
        //leemos la primera palabra fuera del bucle por si es "fin"
        mostrarSinLn("Escriba una palabra: ");
        palabra = sn.next(); //solo leemos una palabra
        while (!palabra.toLowerCase().equals("fin")) {
            frase = frase + " " + palabra; //concatenamos la palabra al final de la frase,
            //con un espacio en blanco. La primera vez, frase está inicalizada con la
            //cadena vacía. Si no, produciría un error.
            mostrarSinLn("Escriba una palabra: ");
            palabra = sn.next();
        }
        //Sea cual sea la combinación de mayúsculas/minúsculas de palabra, la
        //convertimos a minúscula para compararla con "fin". Se podría convertir
        //a mayúsculas y comparar con "FIN"
        mostrar(frase); //mostramos el resultado
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
