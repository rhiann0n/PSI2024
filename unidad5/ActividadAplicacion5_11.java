package unidad5;
/*Realiza la función: int[] buscarTodos(int t[], int clave), que crea
y devuelve una tabla con todos los índices de los elementos donde se
encuentra la clave de búsqueda. En el caso de que clave no se encuentre
en la tabla t, la función devolverá una tabla vacía.*/


import java.util.Arrays;
import java.util.Scanner;

public class ActividadAplicacion5_11 {
    public static void main(String[] args) {
        int[] tabla = crearTabla();
        int [] resultado = buscarIndice(tabla);
        mostrarSinLn("El resultado encontrado es: ");
        mostrarSinLn(Arrays.toString(resultado));

    }
    //MÉTODO PARA CREAR LA TABLA Y DEVOLVER LOS DATOS
    public static Scanner sn = new Scanner(System.in);
    public static int[] crearTabla() {

        mostrarSinLn("Indique el nº de elementos a insertar: ");
        int longitud = sn.nextInt(); //preguntamos longitud
        int[] tabla = new int[longitud]; //creamos tabla con longitud indicada
        for (int i = 0; i < tabla.length; i++) { //recorremos la tabla para insertar datos
            mostrarSinLn("Indique el elemento " + (i+1));
            tabla[i] = sn.nextInt(); //leemos el dato insertamos el índice i
        }
        return tabla;
    }
    //MÉTODO PARA BUSCAR EN LA TABLA EL VALOR QUE SE SOLICITA Y GUARDA EL RESULTADO EN OTRA TABLA AUXILIAR
    public static int[] buscarIndice(int[] tabla) {
        //Creamos una tabla donde insertaremos los índices
        int[] aux = new int[0]; //
        mostrarSinLn("Indique el número a buscar: ");
        int buscar = sn.nextInt(); //leemos el número a buscar
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == buscar) {
                //aumento 1 posición al array aux
                aux = Arrays.copyOf(aux, aux.length +1);
                //inserto el elemento encontrado
                aux[aux.length-1] = tabla[i];
            }
        }
        return aux;
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
