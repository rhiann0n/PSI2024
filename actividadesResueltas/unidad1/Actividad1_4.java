package unidad1;
import  java.util.Scanner;

public class Actividad1_4 {
    public static void main(String[] args) {
        /* La edad puede calcularse como la diferencia entre el año actual y el de
        nacimiento. Esto puede contener un error, en el caso de que en la fecha
        actual aun no se haya celebrado el cumpleaños del año en curso.
        Supondremos que el cumpleaños del usuario ya ha tenido lugar este año. */

        int aActual; //año en curso (actual)
        int aNacimiento; // año de nacimiento
        int edad;
        Scanner sc = new Scanner(System.in);
        //leemos los datos
        System.out.print("Año de nacimiento: ");
        aNacimiento = sc.nextInt();
        System.out.print("Año actual ");
        aActual = sc.nextInt();
        edad = aActual - aNacimiento; //calculamos la edad
        System.out.println("Su edad es: " +edad + " años");


    }


}
