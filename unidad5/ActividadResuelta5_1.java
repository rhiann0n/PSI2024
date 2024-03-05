/*Crear una tabla de longitud 10 que se inicializará con números aleatorios
* comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios
* que se guardan en la tabla.*/
package unidad5;
public class ActividadResuelta5_1 {
    public static void main(String[] args) {
        int[] valores;
        valores = new int[10];

        //Vamos a recorrer la tabla para inicializar con valores aleatorios.
        //Cuando se modifican los elementos de una tabla no podemos usar for-each
        for (int i = 0; i < valores.length; i++) {
            valores [i] = (int)(Math.random()*100+1);
        }
        //Ahora recorreremos la tabla para calcular la suma de sus elementos
        int suma = 0;
        for (int valor: valores) {
            suma += valor;
        }
        System.out.println("La suma de los valores aleatorios es " + suma);
    }
}
