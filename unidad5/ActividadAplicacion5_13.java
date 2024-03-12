package unidad5;

import java.util.Arrays;
import java.util.Scanner;

/* Modifica la Actividad de aplicación 5.12 para que la función no
modifique la tabla que se pasa como parámetro y, en su lugar, cree y
devuelva una copia de la tabla donde se han desordenado los valores de
los elementos. */
public class ActividadAplicacion5_13 {
    public static void main(String[] args) {
        int[] tabla = crearTabla();
        mostrar("Tabla Original\n" + Arrays.toString(tabla));
        mostrar("Tabla Desordenada\n" + Arrays.toString(desordenarTabla(tabla)));

    }
    //MÉTODO PARA CREAR LA TABLA Y DEVOLVER LOS DATOS
    public static Scanner sn = new Scanner(System.in);
    public static int[] crearTabla() {

        mostrarSinLn("Indique el nº de elementos a insertar: ");
        int longitud = sn.nextInt(); //preguntamos longitud
        int[] tabla = new int[longitud]; //creamos tabla con longitud indicada
        for (int i = 0; i < tabla.length; i++) { //recorremos la tabla para insertar datos
            mostrarSinLn("Indique el elemento " + (i+1) + "-> ");
            tabla[i] = sn.nextInt(); //leemos el dato insertamos el índice i
        }
        Arrays.sort(tabla);
        return tabla;
    }
    //MÉTODO PARA BUSCAR EN LA TABLA EL VALOR QUE SE SOLICITA Y GUARDA EL RESULTADO EN OTRA TABLA AUXILIAR
    public static int[] desordenarTabla(int[] tabla) {
        //Valor1/Valor2= Random con dos valores multiplicado por la longitud de la tabla
        //Mediante un bucle de recorrido por toda la tabla
        //variable auxiliar=valor1
        //valor1=valor2
        //valor2=aux
        for (int i = 0; i < tabla.length; i++) {
            int valor1 = (int)(Math.random()*tabla.length);
            int valor2 = (int)(Math.random()*tabla.length);
            int aux = tabla[valor1];
            tabla[valor1]=tabla[valor2];
            tabla[valor2]=aux;
        }
        int[] desordenada = Arrays.copyOf(tabla,tabla.length);
        return desordenada;
    }
    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);
    }
}
