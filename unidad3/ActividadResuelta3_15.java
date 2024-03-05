package unidad3;

import java.util.Scanner;

/*Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
utilizando para ello astericos (*). Por ejemplo, para n = 4
* * * *
* * *
* *
*
 */
/*Utilizaremos un bucle para mostrar cada fila y, dentro de este, otro para escribir
* cada * (columna). El bucle que escribe cada columna (dentro de la fila) dependerá
* de los valores de la fila, así conseguimos el efecto "triángulo".
 */
public class ActividadResuelta3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba n: ");
        int n = sc.nextInt();
        int contador = 0;
        for (int fila = 1; fila <= n; fila++) {
            for (int col = fila; col <= n; col++) { //el número de * coincide con: n-fila+1
                System.out.print(" * "); //no println, para que no cambie de línea
                contador++;
            }
            System.out.println(""); //tras cada fila metemos una nueva línea
        }
        System.out.println("Se han mostrado " + contador + " *");
    }

}
