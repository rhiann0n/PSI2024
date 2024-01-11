package unidad1;
import java.util.*;
/*Los números pares tienen la propiedad que al dividirlos por dos la división exacta,
es decir, el resto (módulo) de la división siempre es 0.
 */
public class Actividad1_9 {
    public static void main(String[] args) {
        int numero;
        System.out.print("Escriba un número: ");
        //Es habitual crear y leer de un Scanner, haciéndolo todo en la misma instrucción//
        numero = new Scanner(System.in) .nextInt();
        boolean esPar = (numero % 2) == 0; //calcula el resto de dividir el número
        //entre 2 y el resultado de esta operación la compara con 0
        System.out.println("Es par: " + esPar);



    }
}
