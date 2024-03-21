package Controller;

import java.util.Scanner;

public class Comandasb {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner sn = new Scanner(System.in);
        int cuenta = 0;
        String detallePedido = "";
        byte opcion = 0;
        /*Crear un bucle con el menú*/
        byte cantidad = 0;
        do {
            System.out.println("·····Menú Coffe House·····");
            System.out.println("\t1. Tortilla");
            System.out.println("\t2. Croquetas");
            System.out.println("\t3. Jamón y queso");
            System.out.println("\t4. Bebida");
            System.out.println("\t5. Salir");
            System.out.print("\n\tIndique su opción ->");
            opcion = sn.nextByte();
            if (opcion!=5){
                System.out.print("\n\tIndique la cantidad ->");
                cantidad = sn.nextByte();
            }
            switch (opcion){
                case 1->{
                    cuenta+=2*cantidad;
                    detallePedido+="\tTortilla.........."+cantidad+"\n";
                }
                case 2->{
                    cuenta+=8*cantidad;
                    detallePedido+="\tCroquetas.........."+cantidad+"\n";
                }
                case 3->{
                    cuenta+=15*cantidad;
                    detallePedido+="\tJamón y queso.........."+cantidad+"\n";
                }
                case 4->{
                    cuenta+=3*cantidad;
                    detallePedido+="\tBebida.........."+cantidad+"\n";
                }
                case 5-> System.out.println("\t·····GENERANDO SU CUENTA·····");
                default -> {
                    System.err.println("OPCIÓN NO VÁLIDA");
                }
            }
        } while (opcion!=5);
        double iva = cuenta*0.21;
        System.out.println("\n\n·····Factura Simplificada·····");
        System.out.println("\tPedido: \n" + detallePedido);
        System.out.println("\tTotal sin IVA: " + cuenta + "€");
        System.out.print("\tIVA: ");
        System.out.printf("%15.2f", iva);
        System.out.println("€\n\tImporte a pagar (IVA incluido): " + (iva+cuenta) + "€");
        System.out.println("···········································");
    }
}
