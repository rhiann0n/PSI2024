package unidad5;
//BÚSQUEDAS EN ARRAYS NO ORDENADOS
/*Se hace por medio de un algoritmo utilizando un bucle para encontrar
* el primer elemento encontrado dentro del array, mostrando su índice.*/
public class BusquedaNoOrdenada {
    public static void main(String[] args) {
        int [] numeros = {5, 3, 7, 977, 3, 6, 8, 1, 4, 90, 44};
        mostrar("Longitud de la tabla: " + numeros.length);
        int indice = 0; //declramos el índice en 0 para inicializar desde ese punto el recorrido del bucle
        int numeroBuscado = 44; //Ejemplo de un número a buscar
        while (indice < numeros.length && numeros [indice] != numeroBuscado) {
            indice++; //se incrementa el índice para ir recorriendo las posiciones del array
        }
        if (indice < numeros.length) { //confirmamos que el índice no se ha salido de rango
            mostrar("La posición del número buscado es: " + indice);
        } else { //si es mayor o igual que la longitud, quiere decir que no se ha encontrado el elemento buscado
            mostrar("El número buscado no está en la tabla");
        }
        /*Ejemplo de búsqueda utilizando una función con cadena de caracteres*/
        String nombre [] = {"María", "Pedro", "Juan", "Irene", "Isabel", "José", "Alba", "Enrique"};
        buscarTexto(nombre, "María");
    }
    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);
    }
    public static void buscarTexto(String texto[], String buscar){
        int indice = 0;
        while (indice < texto.length && texto [indice].equals(buscar)) {
            indice++;
        }
        if (indice < texto.length) {
            mostrar("La posición del nombre buscado es: " + indice);
        } else {
            mostrar("El nombre buscado no está en la tabla");
        }
    }
}
