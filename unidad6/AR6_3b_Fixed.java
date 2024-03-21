package unidad6;
import java.util.Scanner;
public class AR6_3b_Fixed {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String passwd, palabra;
        mostrarSinLn("Jugador 1. Introduzca la contraseña: ");
        passwd = sn.nextLine(); //leemos la contraseña
        mostrar("La contraseña tiene " + passwd.length() + " caracteres.");
        mostrarSinLn("Jugador 2. Palabra: ");
        palabra = sn.nextLine(); //leemos una palabra: primer intento

        while (!palabra.equals(passwd)) { // mientras la palabra no sea igual a la contraseña
            if (palabra.length() != passwd.length()) {
                mostrar("La palabra debe tener " + passwd.length() + " caracteres.");
            } else {
                StringBuilder pista = new StringBuilder();
                for (int i = 0; i < passwd.length(); i++) {
                    if (passwd.charAt(i) == palabra.charAt(i)) { //si son iguales
                        pista.append(passwd.charAt(i)); //se añade el i-ésimo caracter a la pista
                    } else {
                        pista.append('*'); //en otro caso, añadimos un *
                    }
                }
                mostrar(pista.toString());
            }
            mostrarSinLn("Jugador 2. Introduzca palabra de nuevo: ");
            palabra = sn.nextLine(); //leemos otra palabra
        }
        mostrar("¡Acertaste!"); //salir del bucle significa acertar
    }

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);
    }
}
