package unidad1;
import  java.util.*;

public class Actividad1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18; //ser mayor de edad implica que
        //edad sea mayor o igual que 18
        System.out.println("Mayoría de edad: " + mayorEdad);

    }
}
