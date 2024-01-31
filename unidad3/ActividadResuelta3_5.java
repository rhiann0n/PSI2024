package unidad3;
import java.util.Scanner;
/* Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá
que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100.
Mientras la solución introducida sea correcta, el juego continuará. En caso contrario, el
programa terminará y mostrará el número de operaciones realizadas correctamente. */

/*Al menos hay que calcular una suma, por este motivo vamos a utilizar un bucle
* do-while. Los operandos estarán comprendidos entre 1 y 100.*/
public class ActividadResuelta3_5 {
    public static void main(String[] args) {
        int resultado, operando1, operando2; //variables
        int numOperaciones = 0;
        do {
            operando1 = (int) (Math.random()*100+1);
            operando2 = (int) (Math.random()*100+1);
            System.out.print(operando1 +" + " + operando2 + " = ");
            resultado = new Scanner (System.in) .nextInt();
            numOperaciones++;
        }while (resultado == operando1 + operando2);
        //numOperaciones contabiliza cuántas operaciones se han mostrado. De ellas
        //(numOperaciones -1) son correctas y la última es errónea (si no, no hubiera termiando el do-while).
        System.out.println("Ha conseguido realizar: " + (numOperaciones -1) + " sumas consecutivas");

    }
}
