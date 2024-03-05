package unidad3;

import java.util.Scanner;

public class Aplicacion3_12b {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Indica un número binario para convertirlo a decimal: ");
        int binario = sn.nextInt();
        int decimal = 0;
        int base = 1;
        while (binario!=0) {
            int unidadBinaria=binario%2;
            binario/=10;
            decimal+=base*unidadBinaria;
            base*=2;
        }
        System.out.println("El número binario en decimal es: " + decimal);
    }
}
