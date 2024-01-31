package unidad2;
import java.util.Scanner;

/*El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene
a partir del número de la siguiente forma:
                letra = número DNI módulo 23
Basándote en esta información, elige la letra a partir de la numeración de la siguiente tabla:
0T, 1R, 2W, 3A, G4, M5, 6Y, 7F, 8P, 9D, 10X, 11B, 12N, 13J, 14Z, 15S, 16Q, 17V, 18H, 19L, 20C, 21K, 22E
y diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde.
Observa que un número de 8 dígitos está dentro del rango del tipo int. */
public class Aplicacion2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDNI, calculo;
        char letra = ' ';
        System.out.println("Introduce tu DNI SIN la letra: ");
        numeroDNI = sc.nextInt();
        calculo = numeroDNI % 23; // 0 al 22
        switch (calculo) {
            case 0 -> letra = 'T';
            case 1 -> letra = 'R';
            case 2 -> letra = 'W';
            case 3 -> letra = 'A';
            case 4 -> letra = 'G';
            case 5 -> letra = 'M';
            case 6 -> letra = 'Y';
            case 7 -> letra = 'F';
            case 8 -> letra = 'P';
            case 9 -> letra = 'D';
            case 10 -> letra = 'X';
            case 11 -> letra = 'B';
            case 12 -> letra = 'N';
            case 13 -> letra = 'J';
            case 14 -> letra = 'Z';
            case 15 -> letra = 'S';
            case 16 -> letra = 'Q';
            case 17 -> letra = 'V';
            case 18 -> letra = 'H';
            case 19 -> letra = 'L';
            case 20 -> letra = 'C';
            case 21 -> letra = 'K';
            case 22 -> letra = 'E';

        }
        System.out.println("La letra del DNI " + numeroDNI + " es " + letra);






    }
}
