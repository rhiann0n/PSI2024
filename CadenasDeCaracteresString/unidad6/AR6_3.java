package unidad6;
import java.util.Scanner;
/* Diseñar el juego «Acierta la contraseña». La mecánica del juego es la siguiente:
el primer jugador introduce la contraseña; a continuación, el segundo jugador debe
teclear palabras hasta que la acierte. Realizar dos versiones; en la primera se
facilita el juego indicando si la palabra introducida es mayor o menor alfabéticamente
que la contraseña. En la se-gunda, el programa mostrará la longitud de la contraseña
y una cadena con los caracteres acertados en sus lugares respectivos y asteriscos
en los no acertados. */

/* El método equals() nos dice si dos cadenas son iguales y el método compareTo()
* especifica qué cadena es mayor o menor que la otra. */
public class AR6_3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        String passwd, palabra;
        mostrarSinLn("Jugadore 1. Introduzca la contraseña: ");
        passwd = sn.nextLine(); //leemos la contraseña
        do {
            mostrarSinLn("Jugadore 2. Palabra: ");
            palabra = sn.nextLine();
            int comparacion = passwd.compareTo(palabra); //comparamos alfabéticamente
            if (comparacion == 0) {
                mostrar("¡Acertaste!"); //son iguales
            } else if (comparacion < 0) {
                error("La contraseña es menor alfabéticamente que: " + palabra);
            } else {
                error("La contraseña es mayor alfabéticamente que: " + palabra);
            }
        } while (!passwd.equals(palabra));
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
        public static void error (String texo) {
            System.err.println("\t" + texo);
        }
}
