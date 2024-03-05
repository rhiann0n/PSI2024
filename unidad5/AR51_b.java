package unidad5;

import java.util.Arrays;

public class AR51_b {
    public static void main(String[] args) {
        int [] numeros = new int [10];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*100+1);
            suma += numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma de todos los elementos = " + suma);
        //salida con for each
        for (int elemento:numeros) {
            System.out.print(elemento + " + ");
        }
        System.out.print(" = " + suma);



        String[] id = new String [5];
        Arrays.fill(id, "nombre");
        System.out.println("\n" + Arrays.toString(id));
        double[] puntuacion = new double[10];
        //inicializa todos los valores a 0
        Arrays.fill(puntuacion, 0);
        System.out.println(Arrays.toString(puntuacion));
        //inicializa los índices comprendidos de 0 a 5, con el valor de 55
        Arrays.fill(puntuacion, 0,5,55);
        System.out.println(Arrays.toString(puntuacion));

    }
}
