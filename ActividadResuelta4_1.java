package unidad4;

import java.util.Scanner;

public class ActividadResuelta4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n = sc.nextInt();
        System.out.println("--Antes de llamar a la función");
        eco(n);
        eco2(n);
    }
    static void eco(int n) {
        System.out.println("--Después de llamar a la función");
    }
    static void eco2(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Eco...");
        }
    }
}
/*Las funciones no pueden tener el mismo nombre.
* En esta función se mostrará n veces el mensaje, según el número que hayamos introducido.*/