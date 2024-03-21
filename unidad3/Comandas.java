package Controller;

import javax.swing.*;

/** Enunciado: Crear un programa que permita a través de un menú (tortilla, croquetas, jamón y queso, bebidas)
 * indicar lo que el cliente solicita y mostrar el total de su pedido tomando en cuenta los precios:
 * tortilla 2 €
 * croquetas 8 €
 * jamón y queso 15 €
 * bebidas 3 €
 */
public class Comandas {
    public static void main(String[] args) {
        String menu = "";
        byte opcion = 0;
        char simbolo = ' ';
        String salida = " ";
        int operando1, operando2, resultado = 0, resultadoUser = 0, contador = 0;
        do {
            menu = " ";
            menu+="  Menú  \n";
            menu+="1. Tortilla \n";
            menu+="2. Croquetas \n";
            menu+="3. Jamón y queso \n";
            menu+="4. Bebida \n";
            menu+="5. Cuenta \n";
            opcion = (byte) Integer.parseInt(JOptionPane.showInputDialog(menu));
            operando1 = (int) (Math.random()*100+1);
            operando2 = (int) (Math.random()*100+1);
            switch (opcion) {
                case 1-> {
                    simbolo = '+';
                    resultado = operando1 + operando2;
                    salida = operando1 + " " + simbolo + operando2;
                } case 2-> {
                    simbolo = '-';
                    resultado = operando1 - operando2;
                    salida = operando1 + " " + simbolo + operando2;
                } case 3-> {
                    simbolo = '*';
                    resultado = operando1 * operando2;
                    salida = operando1 + " " + simbolo + operando2;
                }
            }
            if (opcion!=4) {
                resultadoUser = Integer.parseInt(JOptionPane.showInputDialog(salida));
            }
            ++contador;
        }while(opcion!=4 && resultadoUser==resultado);
        --contador;
        JOptionPane.showMessageDialog(null, contador);

    }
}
