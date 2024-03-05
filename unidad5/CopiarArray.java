package unidad5;

import java.util.Arrays;

public class CopiarArray {
    public static void main(String[] args) {
        //Copiar un array: crear 2 arrays con la misma longitud
        int[] arrayUno = new int [5];
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = (int) (Math.random()*100+1);
        }
        mostrar(Arrays.toString(arrayUno));
        //si necesitas copiar un array
        int[] arrayDos = new int[5];
        //copyOf construye y devuelve una copia del origen al destino
        //con la longitud indicada en el método
            arrayDos= Arrays.copyOf(arrayUno, 5);
        mostrar(Arrays.toString(arrayDos));
        //copyOfRange
        //crea y devuelve una tabla donde se copian los elementos indicados
        //en el rango
        //índice desde donde comienza
        //hasta donde termina sin incluir este elemento
        int[] arrayTres = Arrays.copyOfRange(arrayUno, 2, 4);
        mostrar(Arrays.toString(arrayTres));
        //Copiar con un método de la clase System
        //Se necesita para insertar o borrar elementos en una tabla
        int[] arrayCuatro = new int[5];
        System.arraycopy(arrayUno,0,arrayCuatro,0,arrayUno.length);
        mostrar(Arrays.toString(arrayCuatro));
    }

    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);
    }
}
