package unidad3;

import java.util.Scanner;

public class SalidasAnticipadas {
    public static void main(String[] args) {
        /*
        * Ejemplo: Indica la edad para entrar al pub. Solo pueden entrar los mayores de 18,
        * y quiero saber cuántas personas han entrado porque el aforo es de 100 personas.
        *
        * Indica la edad -> si es menor de 18 no entra y no cuenta, si es mayor y el aforo lo
        * permite, entra, si no el programa se interrumpe.
         */
        //declaraciones
        Scanner sc = new Scanner(System.in);
        byte edad;
        byte menores = 0;
        for (byte i = 1; i <= 5; i++) {
            System.out.print("Indica la edad: ");
            edad = sc.nextByte();
            if (edad < 18) {
                System.out.println("No tiene permitida la entrada");
                menores++;
                i--;
            }
            if (i==5) {
                System.out.println("Han intentado entrar " + menores + " menores de edad");
                System.out.println("************* AFORO COMPLETO *************");
                break;
            }
        }
    }
}
