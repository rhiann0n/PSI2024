package unidad6;

import java.util.Scanner;

/*Modificar la AR6.14 para que el programa indique al jugador 2 cuántas letras
* coinciden (son iguales y están en la misma posición) entre el texto introducido
* por él y el original.*/
public class AR6_15 {
    public static void main(String[] args) {
        String original; //texto original que introduce el jugador1
        String intento; //intento de acertar la palabra original del jugador 2
        do {
            mostrarSinLn("Jugador 1. Introduzca una palabra: ");
            original = new Scanner(System.in).next();
        } while (original.isEmpty());
        String anagrama = creaAnagrama(original);
        mostrar("A qué palabra corresponde el anagrama: " + anagrama);
        //se modifica este bucle do-while:
        do {
            mostrar("Jugador 2. ¿Cuál es el original?");
            intento = new Scanner(System.in).next();
            mostrar("Letras correctas: " + letrasCorrectas(original, intento));
        } while (!original.equals(intento)); //mientras no acierte el texto original
        mostrar("Muy bien"); //si salimos del bucle es que ha acertado
    }
    //Comprueba cuántas letras coinciden (son iguales y ocupan la misma posición)
    //entre las dos cadenas pasadas como parámetros.
    static int letrasCorrectas(String a, String b) {
        int longitudMinima = Math.min(a.length(), b.length());
        //usamos la longitud mínima de ambas cadenas para evitar extraer caracteres de más
        int contadorLetrasCorrectas = 0;
        for (int i = 0; i < longitudMinima; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                contadorLetrasCorrectas++;
            }
        }
        return contadorLetrasCorrectas;
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
}
