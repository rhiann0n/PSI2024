package unidad6;
import java.util.Scanner;
/*Realiza el juego del ahorcado. Las reglas son:
* a) El jugador A teclea una palabra, sin que el jugador B la vea.
* b) Ahora se le muestra tantos guiones como letras tenga la palabra secreta.
* Por ejemplo, para "hola" será "____".
* c) El jugador B intentará acertar, letra a letra, la palabra secreta.
* d) Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán
* ocultas como guiones. Siguiendo con el ejemplo anterior, y suponiendo que se ha introducido:
* la 'o', la 'j' y la 'a', se mostrará: "_o__a".
* e) El jugador B solo tiene 7 intentos.
* f) La partida terminará al acertar todas las letras que forman la palabra secreta
* (gana el jugador B) o cuando se agoten todos los intentos (gana el jugador A).*/
public class AA6_12 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        mostrarSinLn("Jugador A, introduce la palabra secreta: ");
        String palabraSecreta = sn.nextLine().toLowerCase(); // Convertimos a minúsculas para evitar diferencias
        clearConsole();

        int longitudPalabra = palabraSecreta.length();
        String palabraAdivinada = "";
        for (int i = 0; i < longitudPalabra; i++) {
            palabraAdivinada += "_";
        }

        int intentosRestantes = 7;
        while (intentosRestantes > 0 && !palabraAdivinada.equals(palabraSecreta)) {
            mostrar("Intentos restantes: " + intentosRestantes);
            mostrar("Palabra adivinada: " + palabraAdivinada);
            mostrar("Introduce una letra: ");
            String letra = sn.nextLine().toLowerCase();

            if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
                mostrarSinLn("Por favor, introduce una sola letra válida.");
                continue;
            }

            char letraIntroducida = letra.charAt(0);
            boolean acierto = false;
            for (int i = 0; i < longitudPalabra; i++) {
                if (palabraSecreta.charAt(i) == letraIntroducida) {
                    palabraAdivinada = palabraAdivinada.substring(0, i) + letraIntroducida + palabraAdivinada.substring(i + 1);
                    acierto = true;
                }
            }

            if (!acierto) {
                error("¡Letra incorrecta!");
                intentosRestantes--;
            }
        }

        if (palabraAdivinada.equals(palabraSecreta)) {
            mostrarSinLn("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
        } else {
            error("¡Has agotado todos los intentos! La palabra secreta era: " + palabraSecreta);
        }

        sn.close();
    }
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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

