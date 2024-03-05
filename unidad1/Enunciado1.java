package unidad1;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
public class Enunciado1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sn=new Scanner(System.in);
        System.out.println("Ingrese un número tipo entero ");
        a= sn.nextInt(); // declarar varibale, solicitar al usuario, almacenar variable
        System.out.println("Ingrese otro número tipo entero ");
        b= sn.nextInt();
        c=a+b;
        System.out.println("El resultado de la suma de los dos números es igual a " + c);

        /* Código Optimizado */
        int cc; // solo declaro la variable c
        cc = sn.nextInt(); //leemos y guardamos el valor en cc
        System.out.println("Ingrese un número tipo Entero");
        cc=cc+sn.nextInt(); //leemos el segundo numero y se lo sumamos al valor de cc
        System.out.println("El resultado de la suma de los dos números es igual a " + cc);

        /*Enunciado: Solicita al usuario que ingrese dos números enteros
        y luego muestra la suma de esos dos números con un mensaje:
        "El resultado de la suma de a+b es " */






    }
}
