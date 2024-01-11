package unidad1;
import java.util.Scanner;
/*En el ejerecicio realizamos las 3 fases típicas de cualquier app:
    * - Entrada de datos: pedimos la edad
    * - Procesado: en este caso incrementar la edad en 1
    *  -Salida de datos: mostrar los resultados */
public class Actividad1_3 {
    public static void main(String[] args) {
        int edad; //aquí guardaremos la edad del usuario//
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba su edad ");
        edad = sc.nextInt();
        edad = edad+1; //el año que viene tendrá un año más//
        //la línea anterior puede sustituirse por: edad++//
        //ahora mostraremo el valor de la variable edad//
        System.out.print("El próximo año su edad será: " + edad + " años");










    }

}
