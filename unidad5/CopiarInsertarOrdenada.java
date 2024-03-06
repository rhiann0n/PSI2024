package unidad5;
import java.util.Arrays;
public class CopiarInsertarOrdenada {
    public static void main(String[] args) {
        int [] t = {1, 2, 3, 4, 6, 7, 8}; //tabla original donde se insertará uno nuevo
        int nuevo = 5;
        int indiceInsercion = Arrays.binarySearch(t, nuevo); //buscamos si existe o no el número nuevo en la tabla
        //Si el índice de inserción es negativo, debemos pasarlo a positivo y restarle 1.
        if (indiceInsercion < 0)
            indiceInsercion = - indiceInsercion - 1; //nos da como resultado donde debería estar el nuevo elemento
        //comenzamos con el proceso de copia del array para ingresar el nuevo elemento
        int [] copia = new int [t.length + 1];
        System.arraycopy(t, 0, copia, 0, indiceInsercion);
        mostrar(Arrays.toString(copia));
        copia [indiceInsercion] = nuevo;
        mostrar(Arrays.toString(copia));
        System.arraycopy(t, indiceInsercion, copia, indiceInsercion+1, t.length-indiceInsercion);
        mostrar(Arrays.toString(copia));
        t = copia;
        mostrar(Arrays.toString(t));
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}