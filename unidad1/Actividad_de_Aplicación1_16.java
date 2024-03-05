package unidad1;
import java.util.Scanner;

/*Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos
introducidos por el usuario.*/
public class Actividad_de_Aplicación1_16 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int seg, min, hor, total;
        System.out.println("Indica una cantidad de segundos: ");
        seg=sn.nextInt();
        min=seg/60;
        seg%=60;
        hor=min/60;
        min%=60;
        System.out.println(hor+":"+min+":"+seg);



    }
}
