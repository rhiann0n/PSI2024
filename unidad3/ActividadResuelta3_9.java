package unidad3;
import java.util.Scanner;
/*IMPLEMENTAR UNA APP QUE PIDA AL USUARIO UN NÚMERO COMPRENDIDO ENTRE 1 Y 10. HAY
QUE MOSTRAR LA TABLA DE MULTIPLICAR DE DICHO NÚMERO, ASEGURÁNDOSE DE QUE EL NÚMERO
INTRODUCIDO SE ENCUENTRA EN EL RANGO ESTABLECIDO.*/
/*Las tablas de multiplicar nos traen recuerdos de nuestros tiempos escolares,
* cuando intentábamos aprenderlas (recitándolas una y otra vez).*/
public class ActividadResuelta3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; //del que mostraremos la tabla de multiplicar
        //nos aseguramos de que el número está entre 1 y 10
        do {
            System.out.print("Introduzca un número (de 1 a 10): ");
            num = sc.nextInt();
        } while (!(1 <= num && num <= 10));
        System.out.println("\n\nTabla del " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
