package unidad3;
import java.util.Scanner;
/* Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo y su cuadrado.
El proceso se repetirá hasta que el número introducido sea 0. */
public class ActividadResuelta3_1 {
    /* No tenemos la certeza de cuántos números se introducirán por teclado, por eso,
     * el bucle while se ejecutará mientras que el número introducido no sea 0.
     * El bloque de instrucciones del bucle estará formado por las sentencias que muestran
     * si el número es par, positivo y su cuadrado */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean esPar, esPositivo; //indicadores para el informe
        System.out.print("Introduzca número: ");
        int num = sc.nextInt(); //leemos el número
        if (num == 0) {
            System.out.println("Finalizado");
        }
        while (num != 0) { //repetimos mientras el número leído no sea 0
            //si divido un número entre 2 y obtengo como resto 0, significa que es par
            //el operador % (resto módulo) calcula el resto. Así sabremos la paridad
            esPar = num % 2 == 0 ? true : false; //si el resto es 0, será par
            esPositivo = num >= 0 ? true : false;  //consideramos el 0 positivo
            System.out.println("¿Es par?: " + esPar + " ¿Es positivo?: " + esPositivo);
            System.out.println("Cuadrado: " + num * num);
            System.out.println("Introduzca otro número: ");
            num = sc.nextInt(); //volvemos a leer num

        }
    }
}
