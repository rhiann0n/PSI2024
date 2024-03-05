package unidad5;
/*Escribir una aplicación que solicite al usuario cuántos números desea introducir.
* A continuación, introducir por teclado esa cantidad de números enteros, y por último,
* mostrar en el orden inverso al introducido.*/

import java.util.Scanner;

/* Primero leeremos la cantidad de números a introducir.
* Creamos una tabla de la longitud adecuada para guardar los datos que se introducirán.
* Recorremos la tabla, pero comenzando en el último elemento y finalizando el primero
* y así mostrarlos en orden inverso. */
public class ActividadResuelta5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números desea introducir? -> ");
        int cuantosNumeros = sc.nextInt();

        int t[] = new int[cuantosNumeros]; //tabla con la longitud adecuada

        for (int i = 0; i < t.length; i++) { //recorremos desde 0 hasta t.length-1
            System.out.print("Introduzca un número: ");
            t[i] = sc.nextInt();
        }
        System.out.println("Los números en orden inverso son: ");
        for (int i = t.length -1; i >= 0; i--) { //recorremos en orden inverso
            System.out.println(t[i]);
        }
        //En este caso no podemos utilizar Arrays.toString() para mostrar la tabla
    }
}

