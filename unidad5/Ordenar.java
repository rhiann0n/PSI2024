package unidad5;

import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
        //Ordenar un Array, se modifica el array...
        //Se ordena de forma creciente
        //Los datos pueden ser primitivos (numéricos)
        int [] numeros = {5, 8, 7, 1, 3, 9, 15};
        //método para ordenar: Arrays.sort(nombreDelArray)
        Arrays.sort(numeros); //el array se modifica y se ordena
        System.out.println(Arrays.toString(numeros));
        //ordenar tipos no primitivos (String)
        String nombres [] = {"Edgard", "Edgardo", "Xiomara", "Beatriz", "arancha"};
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
    }
}
