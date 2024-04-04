package AR7_11.Clases;
import java.util.Arrays;
public class Lista {
    Integer[] elemento;
    public Lista() {
        elemento = new Integer[0];
    }

    //Insertar al principio de la lista... incrementar en 1 el array
    public void insertarPrincipio(Integer nuevo) {
        //1. incrementar la tabla
        elemento = Arrays.copyOf(elemento,elemento.length+1);
        //2. crear hueco al principio de la tabla
        System.arraycopy(elemento,0,elemento,1,elemento.length-1);
        //3. insertar el elemento
        elemento[0] = nuevo;
    }

    //Insertar en el último lugar de la tabla
    public void insertarFinal(Integer nuevo) {
        elemento = Arrays.copyOf(elemento, elemento.length+1);
        elemento[elemento.length-1] = nuevo;
    }

    //Obtener el número de elementos insertados
    public void mostrarElementos() {
        System.out.println("Número de elementos -> " + elemento.length);
        System.out.println("Todos los elementos" + Arrays.deepToString(elemento));
    }

    //Insertar un elemento, pero nos indican el índice donde insertarlo
    public void insertarConIndice(int indice, Integer nuevo) {
        //validamos que el índice pasado por parámetro es menor que la longitud del array
        if (elemento.length > indice) {
            elemento = Arrays.copyOf(elemento,elemento.length+1);
            System.arraycopy(elemento,indice,elemento,indice+1,elemento.length-indice-1);
            //[1,2,3,4,5,6,7] -> 4,10 -> [1,2,3,4] [5,6,7]
            elemento[indice] = nuevo;
        } else {
            System.err.println("Índice fuera de rango");
        }
    }

    //Insertar otra lista dentro de la lista original
    public void insertarLista(Lista nuevaLista) {
        //1. debemos saber la longitud de la lista original
        int longOriginal = elemento.length;
        //2. hacer hueco
        elemento = Arrays.copyOf(elemento, elemento.length + nuevaLista.elemento.length);
        System.out.println(Arrays.toString(elemento));
        //3. copiar la lista
        System.arraycopy(nuevaLista.elemento, 0, elemento, longOriginal, nuevaLista.elemento.length);
        System.out.println(Arrays.toString(elemento));
    }

    public void eliminarNum(int indice) {
        if (elemento.length > indice && indice >= 0) { //para que no se ponga un índice negativo
            Integer numEliminar = null; //el dato tipo wrapper se declara como nulo
            numEliminar = elemento [indice]; //ej: 100 - indice = 2
            for (int i = indice+1; i < elemento.length; i++) {
                elemento[i-1] = elemento[i];
            }
            System.out.println(Arrays.toString(elemento));
            System.out.println("El número [" + numEliminar + "] será eliminado del array");
            elemento = Arrays.copyOf(elemento, elemento.length-1);
        }
    }

    //buscar un número que pasen por parámetro
    public void buscarNum(Integer num) {
        int indice = -1;
        for (int i = 0; i < elemento.length && indice == -1; i++) {
            //para comparar el Integer se utiliza equal (no ==) porque es un array
            if (elemento[i].equals(num)) {
                indice = i;
            }
        }
        if (indice != -1) {
            System.out.println("El número buscado [" + num + "] está en la posición " + indice);
        } else {
            System.err.println("Número no encontrado");
        }
    }
}
