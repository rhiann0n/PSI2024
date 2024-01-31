package unidad3;

import java.util.Scanner;

public class Aplicacion3_11b {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Indica el número decimal: ");
        int numero = sn.nextInt();
        while (numero!=0){
            int unidadBinaria=numero%2;
            numero/=2;
            System.out.println(unidadBinaria);
        }
    }
}
