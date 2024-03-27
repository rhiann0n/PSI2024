package AR7_6.Controller;
import AR7_6.Clases.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Hora h = new Hora(); //creamos un objeto Hora
        mostrar("Hora: ");
        int valor = sn.nextInt(); //leemos un valor para la hora
        h.setHora(valor); //asignamos un valor para la hora
        mostrar("Minuto: ");
        valor = sn.nextInt(); //leemos un valor para los minutos
        h.setMinuto(valor); //asignamos un valor a los minutos
        mostrar("Segundo: ");
        valor = sn.nextInt(); //leemos un valor para los segundos
        h.setSegundo(valor); //asignamos un valor a los segundos
        mostrar("¿Cuántos segundos quiere mostrar?: ");
        int numSegundos = sn.nextInt();
        for (int i = 0; i <= numSegundos; i++) {
            //mostramos la hora
            mostrar(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.incrementaSegundo(); //incrementamos la hora actual en un segundo

        }
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
