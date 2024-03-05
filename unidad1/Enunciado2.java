package unidad1;

import java.util.Scanner;

public class Enunciado2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Indiqe el precio del producto"); // solicitamos que ingrese el precio
        Double precio=sn.nextDouble(); //leemos por consola
        System.out.println("Indique el descuento"); //solicitamos que ingrese el descuento
        Double precioFinal= precio-(precio*(sn.nextDouble()/100)); //operacion matematica de resta, multip y division
        System.out.println(precioFinal);

        /* Desglose de la línea 11, son iguales pero más detalladas
        Double descuento=sn.nextDouble();  ->5
        Double montoDescuento=precio-descuento/100;  ->0.5
        Double precioTotal=precio-montoDescuento   ->9.5  */

        /*Enunciado: En una tienda se requiere calcular el porcentaje de descuento de
        un producto, por lo que debes solicitar el precio del producto y
        el porcentaje a aplicar, y calcular el precio total.*/


    }
}
