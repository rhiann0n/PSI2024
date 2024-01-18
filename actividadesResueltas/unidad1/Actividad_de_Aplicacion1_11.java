package unidad1;

import java.util.Scanner;

/*Un economista te ha encargado un programa para realizar cálculos con el IVA.
La aplicación debe solicitar la base imponible y el IVA se debe aplicar.
Muestra en pantalla el importe correspondiente al IVA y  al total.
 */
public class Actividad_de_Aplicacion1_11 {
    public static void main(String[] args) {
        double precioProducto,precioTotal,ivaCalculado;
        byte iva;
        //preguntamos el precio
        Scanner sn=new Scanner(System.in);
        System.out.println("CÁLCULO DEL IVA");
        System.out.println("*******************");
        System.out.print("Indica el precio sin IVA del producto (base) -> ");
        precioProducto=sn.nextDouble();
        System.out.println("Indica el IVA -> ");
        iva= sn.nextByte();
        ivaCalculado=precioProducto*((double) iva/100);
        precioTotal=ivaCalculado+precioProducto;
        System.out.println("*******************");
        System.out.println("El producto con base " + precioProducto + "€ tiene un IVA de " + ivaCalculado+"€");
        System.out.println("El prodcuto cuesta en taotal " + precioTotal + "€");











    }
}
