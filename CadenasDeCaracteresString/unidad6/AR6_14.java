package unidad6;
/*Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra
* y la aplicación muestra un anagrama generado al azar. A continuación, otro jugador
* tiene que acertar cuál es el texto original. La aplicación no debe permitir que el
* texto introducido por el jugador 1 sea la cadena vacía. Por ejemplo, si el jugador 1 escribe
* "teclado", la aplicación muestra como pista un anagrama al azar, como por ejemplo: "etcloda".*/
import java.util.Scanner;

public class AR6_14 {
    public static void main(String[] args) {
        String original; //texto original que introduce el jugador1
        String intento; //intento de acertar la palabra original del jugador 2
        do {
            mostrarSinLn("Jugador 1. Introduzca una palabra: ");
            original = new Scanner(System.in).next();
        } while (original.isEmpty());

        String anagrama = creaAnagrama(original);
        mostrar("A qué palabra corresponde el anagrama: " + anagrama);
        do {
            mostrar("Jugador 2. ¿Cuál es el original?");
            intento = new Scanner(System.in).next();
        } while (!original.equals(intento)); //mientras no acierte el texto original
        mostrar("Muy bien"); //si salimos del bucle es que ha acertado
    }

    /*La función creaAnagrama() crea y devuelve un anagrama del texto original
    * pasado como parámetro. El algoritmo para construir el anagrama es:
    * 1. Convertir el String original en una tabla, que es más cómoda para intercambiar
    * caracteres.
    * 2. Elegir dos caracteres (sus índices) al azar e intercambiarlos.
    * 3. Repetir el punto 2. Cuantas más veces se repita, mayor es el desorden.
    * Repetiremos tantas veces como la longitud del texto original.*/
    static String creaAnagrama(String original) {
        char[] anagrama = original.toCharArray(); //una tabla es más cómoda para modificar
        //realizamos un intercambio al azar por cada carácter que forma el texto
        for (int numCambios = 0; numCambios < anagrama.length; numCambios++) {
            int i = (int) (Math.random()*anagrama.length); //índice al azar
            int j = (int) (Math.random()*anagrama.length); //índice al azar
            char aux = anagrama[i]; //intercambiamos anagrama[i] y anagrama[j]
            anagrama[i] = anagrama[j];
            anagrama[j] = aux;
        }
        return String.valueOf(anagrama); //devolvemos un String a partir de la tabla
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
