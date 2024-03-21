/*Escribir un programa que pida el nombre completo al usuario y lo muestre
* sin vocales (mayúsculas, minúsculas y acentuadas). */
package unidad6;
import java.util.Scanner;
/* La idea es recorrer el nombre, carácter a carácter, comprobando si es una
* vocal. En el caso de que no lo sea concatenarmos el cáracter al final de una
* segunda cadena, que llamaremos sinVocales. Para comprobar sin un carácter
* es una vocal crearemos la función: esVocal(). */
public class AR6_6 {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        String nombre, sinVocales = "";
        char c;
        mostrarSinLn("Escriba su nombre completo: ");
        nombre = sn.nextLine();
        for (int i = 0; i < nombre.length(); i++) { //recorremos la tabla
            c = nombre.charAt(i);
            if (!esVocal(c)) {
                sinVocales = sinVocales + c;
            }
        }
        mostrar(sinVocales);
    }
    static boolean esVocal (char c) {
        boolean result; //resultado de la comprobación
        String vocales = "aeiouáéíóúü"; //cadena con todas las vocales posibles en minúscula
        c = Character.toLowerCase(c); //convertimos c en minúsculas
        if (vocales.indexOf(c) == -1) { //buscamos c en la cadena vocales
            result = false; //si no se encuentra es que no es una vocal
        } else {
            result = true; //en caso contrario: es una vocal
        }
        return result;
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
