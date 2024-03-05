package unidad3;
import java.util.Scanner;
/*Modifica la Actividad de aplicación 3.11 para que el usuario pueda introducir un número
binario y el programa muestre su conversión a decimal.
 */
public class Aplicacion3_12 {
    public static void main(String[] args) {
        long numero, aux, digito, decimal;
        int exponente;
        boolean esBinario;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero binario: ");
            numero = sc.nextLong();
            esBinario = true;
            aux = numero;
            while (aux != 0) {
                digito = aux % 10;
                if (digito != 0 && digito != 1) {
                    esBinario = false;
                }
                aux = aux / 10;
            }
        } while (!esBinario);
        exponente = 0;
        decimal = 0;
        while (numero != 0) {
            digito = numero % 10;
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            exponente++;
            numero = numero / 10;
        }
        System.out.println("Decimal: " + decimal);
    }
}
