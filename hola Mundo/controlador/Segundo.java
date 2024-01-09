package controlador;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/** Los comentarios : son mensajes que me permiten
 * documentar un programa pero que no se ejecuta.
 * comentarios en linea  //
 * comentarios en bloque /*
 * */

public class Segundo {
    public static void main(String[] args) {//psvm + tab para escribir esta linea auto

        //escribe tu nombre, dar espacio después de 'es'
        String nombre = ("IRENE");
        System.out.println("mi nombre es " + nombre.toLowerCase());
        System.out.println("mi nombre es " + nombre.toUpperCase());
        LocalDate hoy = LocalDate.now();  //el ide autom te importa la api que necesites
        System.out.println(hoy);
        int a = 5;
        int b = 6;
        int c = a + b;  //c=11
        System.out.println("El valor de c es " + c);
        c = c - a;  //c=6 -> la variable puede cambiar de valor mientras se ejecuta el programa
        System.out.println("Ahora c vale " + c);
        /* CONSTANTES-> el valor una vez declarado no cambia mientras se ejecuta el programa*/
        final int mayoriaDeEdad = 18;
        LocalTime queHoraEs = LocalTime.now();
        System.out.println(LocalTime.now());
        double calculo = Math.pow(5, 3); //5 exp 3
        System.out.println("El resultado es " + calculo);
        //para calcular la raiz cuadrada de un numero es Math.sqrt(numero)
        double raizCuadrada=Math.sqrt(16); //raizCuadrada=4
        System.out.println("La raiz cuadrada de 16 es " + raizCuadrada);
        System.out.print("es una prueba ");
        System.out.print("es otra prueba ");
        System.out.println(""); //salto de linea
        System.out.print(""); //no hay salto de linea
        /* Entrada de datos por consola con la Clase Scanner */
        Scanner entrada=new Scanner(System.in); // tipo System.in indica que captura los datos del teclado
//        System.out.print("Indica tu nombre ->");
//        String nombreUsuario=entrada.nextLine();
//        // esta linea lo que indica es que lo que escriba el usuario se guardara en la variable nombreUsuario
//        System.out.println("El usuario se llama " + nombreUsuario);
//        System.out.print("Indica su edad -> ");
//        short edad=entrada.nextShort();
//        System.out.println("Y su edad es " + edad);
//        short nuevaEdad= (short) (edad+1);
//        System.out.println("El año que viene tendrá "+nuevaEdad + " años");
//        System.out.println("Indica el año de nacimiento -> ");
//        short anioNac=entrada.nextShort();
//        short edadCalculada= (short) (2024-anioNac);
//        System.out.println("Su edad calculada es " + edadCalculada + " años");
        System.out.print("Indica el precio del artículo -> ");
        Double precio=entrada.nextDouble();










    }
    }
















