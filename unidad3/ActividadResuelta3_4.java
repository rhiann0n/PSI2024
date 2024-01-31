package unidad3;
import java.util.Scanner;
/*Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto.
Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos
cuando se utilice -1 como altura). Los árboles se identifican mediante etiquetas con números correlativos, comenzando
en 0. Diseña una aplicación que resuelva el problema planteado. */

/*Introducimos la altura de cada árbol dentro de un bucle y guardaremos la mayor y el nº de etiqueta del árbol al que
corresponde. En la búsqueda del máximo (o mínimo) se nos plantea un problema: con qué valor inicializamos el máximo.
Hemos de inicializarlo con un valor menor o igual que todos los valores con los que trabajaremos.
igual que todos los valores con los que trabajaremos.
máximo es -2. Si inicializamos arbitrariamente máximo=0, como 0 es mayor que cualquier valor del conjunto, el algoritmo
dirá que el máximo es 0 (error). En este caso al trabajar con alturas (positivas), podemos inicializar sin problema a 0
(es menor que cualquier positivo). Sin embargo, en el caso general, la mejor opción es inicializar el máximo al primer
valor leído. */
public class ActividadResuelta3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int etiquetaArbolMasAlto; //número identificativo del árbol más alto
        int alturaArbolMasAlto; //altura del árbol más alto
        int etiqueta = 0; //número identificativo del árbol del que se piden los datos
        int altura; //altura del árbol del que se piden los datos
        System.out.print("Altura del árbol (" + etiqueta + "): ");
        altura = sc.nextInt();
        alturaArbolMasAlto = altura; // el 1er árbol será, por ahora, el más alto
        etiquetaArbolMasAlto = 0; //el árbol con etiqueta 0 es, por ahora el más alto
        while (altura != -1) {
            if (altura > alturaArbolMasAlto) { //hemos encontrado un árbol más alto
                alturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;
            }
            etiqueta++; //incrementamos la etiqueta, para solicitar la altura del siguiente
            System.out.print("Altura del árbol (" + etiqueta + "): ");
            altura = sc.nextInt();


        }
        if (alturaArbolMasAlto == -1) {
            System.out.println("No hay ningún arbol");
        }else{
            System.out.println("El árbol más alto mide: " + alturaArbolMasAlto);
            System.out.println("Etiqueta del árbol: " + etiquetaArbolMasAlto);

        }
    }
}
