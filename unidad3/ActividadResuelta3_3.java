package unidad3;
import java.util.Scanner;
/*Codificar el juego "el número secreto", que consiste en acertar un número entre 1 y 100 (generado aleatoriamente).
Para ello se introduce por teclado una serie de números, para los que se indica: "mayor" o "menor", según sea mayor o
menor con respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo
un -1). */
public class ActividadResuelta3_3 {
    /* La aplicación generará un número aleatorio entre 1 y 100. A continuación el jugador irá probando suerte con la
     * ayuda de las indicaciones que la propia aplicación le ofrece. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSecreto = (int) (Math.random() * 100 + 1); //nº aleatorio entre 1 y 100
        System.out.print("Introduzca un número entre 1 y 100: ");
        int num = sc.nextInt();
        while (numSecreto != num && num != -1) {
            ; //mientras no acertemos (son distintos) y no introduzcamos un -1
            if (numSecreto < num) { //el número secreto es menor
                System.out.println("Menor");
            } else { //en otro caso, será mayor
                System.out.println("Mayor");
            }
            System.out.print("Introduzca otro número: ");
            num = sc.nextInt();
        }
        //salimos del bucle porque el jugador acierta el número o se rinde
        if (numSecreto == num) {
            System.out.println("¡Enhorabuena!");
        } else {
            System.out.println("Otra vez será...");
        }
    }
}