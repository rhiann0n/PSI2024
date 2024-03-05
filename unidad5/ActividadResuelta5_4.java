package unidad5;

import java.util.Scanner;

public class ActividadResuelta5_4 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        mostrarSinLn("Indique el número de elementos enteros a insertar: ");
        int longitud = sn.nextInt();
        int[] numeros = new int [longitud];
        for (int i = 0; i < longitud; i++) {
            mostrarSinLn("Indique el número: ");
            numeros[i] = sn.nextInt();
        }
        //mostrar a la inversa
        mostrar("Muestra de forma inversa los números insertados");
        mostrar("************************************************");
        for (int i = numeros.length-1; i >= 0; i--){
            mostrar(" -> " + numeros[i]);
        }
        mostrar("El valor máximo insertado es: " + maximo(numeros));
    }
    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);
    }

    public static int maximo(int t[]) { //podemos pasar arrays por parámetros a una función
        int max = t[0]; //asumimos que al menos hay un elemento
        for (int elemento:t){ //recorremos el array pasado por parámetros
            if (elemento>max){ //validamos cada elemento y comparamos con el max acumulado
                max = elemento;
            }
        }

        return max;
    }
}
