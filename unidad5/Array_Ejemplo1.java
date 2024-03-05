package unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ejemplo1 {
    public static void main(String[] args) {
        int [] edad = new int [5];
        edad [0] = 23;
        edad [1] = 52;
        edad [2] = 18;
        edad [3] = 32;
        edad [4] = 45; //valores de la variable edad
        System.out.println(Arrays.toString(edad));
        //Solicitar con Scanner las edades
        //Solicitar 1º cuántas edades voy a insertar
        Scanner sn = new Scanner(System.in);
        mostrar ("Indique el número de edades a insertar -> ");
        int longitud = sn.nextInt(); // se guarda la longitud con que voy a crear el array
        byte[] edades = new byte[longitud]; //creamos el array con la longitud leída
        //necesitamos preguntar las edades, para ello vamos a crear un bucle for sencillo
        //para que recorra las posiciones del array e inserte los valores
        for (int i = 0; i < longitud; i++) {
            mostrar("Indique la edad nª " + (i + 1));
            edades [i] = sn.nextByte();
        }
        //System.out.println(Arrays.toString(edades));
        for (int ed:edades){
            System.out.println("Edad insertada -> " + ed);
        }
        //Métodos de la API de Java sobre los arrays
        //Conocer la longitudde un array
        mostrar("Longitud del array Edad -> " + edad.length);
        mostrar("Longitud del array Edades -> " + edades.length);
        for (int i = 0; i < edad.length; i++) {
            mostrar("La edad insertada en la posición " + (i+1) + " es  -> " + edad [i]);
        }

        //Referencias en los arrays, variables, etc
        mostrar("*************REFERENCIAS DE MEMORIA3************************");
        System.out.println(edad);
        System.out.println(edades);
    }
    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
}
//bucle for each: es un bucle específico para recorrer tablas
//su sintaxis es (for (int ed: edades) {}
//se declara una variable llamada elemento y que recorre el array
