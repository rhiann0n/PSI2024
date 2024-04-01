package Actividad_IVA_Enum.Controller;

import Actividad_IVA_Enum.Clases.Producto;
import Actividad_IVA_Enum.Clases.TipoIVA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crear un producto
        Scanner sn = new Scanner(System.in);
        System.out.print("Indica el nombre del producto: ");
        String prodT = sn.next(); sn.nextLine();
        System.out.print("Indica la base del producto: ");
        double baseT = sn.nextDouble();
        System.out.println("Indica el tipo de IVA: \n1. General\n2. Reducido\n3. Superreducido\n4. Exento");
        String iva = sn.next();sn.nextLine();
        Producto p1 = new Producto(prodT, baseT, TipoIVA.valueOf(iva));
        System.out.println(p1.toString());
        System.out.println(p1.calcularIVA(baseT, p1.getIva().getPorcentaje()));
    }
}
