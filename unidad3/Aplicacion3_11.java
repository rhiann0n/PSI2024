package unidad3;
/*Realiza un programa que convierta un número decimal en su representación binaria. Hay
que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el usuario.
Por simplicidad iremos mostrando el número binario con un dígito por línea.
 */
import java.util.Scanner;

public class Aplicacion3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, exp, digito;
        double binario;
        do{
            System.out.print("Introduce un numero entero mayor o igual que 0: ");
            numero = sc.nextInt();
        }while(numero<0);
        exp=0;
        binario=0;
        while(numero!=0){
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }

    }


