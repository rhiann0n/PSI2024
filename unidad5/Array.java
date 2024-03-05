package unidad5;

import java.util.Arrays;

//La declaración de un array (tabla) debe contener 3 elementos
//1. El tipo de dato
//2. El nombre de la variable
//3. La longitud
public class Array {
    public static void main(String[] args) {
        int [] edad = new int [5];
        edad [0] = 23;
        edad [1] = 52;
        edad [2] = 18;
        edad [3] = 32;
        edad [4] = 45; //valores de la variable edad
        System.out.println(Arrays.toString(edad));
    }
}
