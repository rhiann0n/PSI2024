package unidad3;
import javax.swing.*;
public class ActividadResuelta3_5c {
    public static void main(String[] args) {
        String menu = "";
        byte opcion = 0;
        char simbolo = ' ';
        String salida = " ";
        int operando1, operando2, resultado = 0, resultadoUser = 0, contador = 0;
        do {
            menu = " ";
            menu+="  Menú  \n";
            menu+="1. Sumar \n";
            menu+="2. Restar \n";
            menu+="3. Multiplicar\n";
            menu+="4. Salir \n";
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
