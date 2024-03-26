package unidad6;
import java.util.Scanner;
/*Segunda versión del juego*/
/*Las cadenas no se pueden comparar utilizando el operador ==, para realizar
* comparaciones de cadenas disponemos de equals() y otros métodos. */
public class AR6_3b {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String passwd, palabra;
        mostrarSinLn("Jugadore 1. Introduzca la contraseña: ");
        passwd = sn.nextLine(); //leemos la contraseña
        mostrar("La contraseña tiene " + passwd.length() + " caracteres.");
        mostrarSinLn("Jugadore 2. Palabra: ");
        palabra = sn.nextLine(); //leemos una palabra: primer intento
        while (!palabra.equals(passwd)) { //mientras no sean iguales seguimos jugando
            StringBuilder pista = new StringBuilder();
            //si palabra tiene una longitud menor que la contraseña
            //se producirá un error en tiempo de ejecución ¿Por qué?
            for (int i = 0; i < passwd.length(); i++) {
                if (passwd.charAt(i) == palabra.charAt(i)) { //si son iguales
                    pista.append(passwd.charAt(i)); //se añade el i-ésimo caracter a la pista
                } else {
                    pista.append('*'); //en otro caso, añadimos un *
                }
            }
            mostrar(pista.toString());
            mostrarSinLn("Jugadore 2. Introduzca palabra de nuevo: ");
            palabra = new Scanner(System.in).next(); //leemos otra palabra
        }
        mostrar("¡Acertaste!"); //salir de while significa acertar

    }

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);
    }
}