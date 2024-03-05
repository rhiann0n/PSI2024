package unidad5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Crea 5 elementos: enteros, doubles y booleanos
//Mostrarlos -> usa una función
public class ActividadPropuesta5_1 {
    public static void main(String[] args) {
        //TABLA ENTEROS
        int [] enteros = new int[5];
        enteros [0] = 16;
        enteros [1] = 14;
        enteros [2] = 2;
        enteros [3] = 4;
        enteros [4] = 18;
        System.out.println(Arrays.toString(enteros));

        //TABLA DOUBLE
        Scanner sn = new Scanner(System.in);
        sn.useLocale(Locale.US);
        double[] t = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un número: ");
            t [i] = sn.nextDouble();
        }
        System.out.println(Arrays.toString(t));

        //TABLA BOOLEANA
        boolean [] booleano = new boolean[5];
        booleano [0] = true;
        booleano [1] = false;
        booleano [2] = true;
        booleano [3] = false;
        booleano [4] = true;
        System.out.println("Valores de la tabla booleana -> ");
        for (int i = 0; i < booleano.length; i++) {
            System.out.println("Elemento " + i + ": " + booleano[i]);
        }
        //REFERENCIAS
        mostrar("*-*-* REFERENCIAS DE MEMORIA *-*-*");
        System.out.println(enteros);
        System.out.println(t);
        System.out.println(booleano);

    }
    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
}
