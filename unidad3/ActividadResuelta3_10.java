package unidad3;
/*DISEÑAR UN PROGRAMA QUE MUESTRE LA SUMA DE LOS 10 PRIMEROS NÚMEROS IMPARES*/
/*El bucle for estará controlado por i (1...10).
* El i-ésimo número impar se calcula: 2*i-1 */
public class ActividadResuelta3_10 {
    public static void main(String[] args) {
        double suma = 0; // guardará la suma de los 10 primeros impares
        for (int i = 1; i <=10; i++) {
            int impar = 2 * i - 1;
            suma+= impar;
        }
        System.out.println("La suma de los 10 primeros impares es: " + suma);
    }
}
