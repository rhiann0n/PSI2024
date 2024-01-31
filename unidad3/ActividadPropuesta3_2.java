package unidad3;
import java.util.Scanner;
public class ActividadPropuesta3_2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Indica cuántas veces quieres que se repita el eco: ");
        int veces = sn.nextInt();
        for (int i = 1;  i<=veces; i++) {
            System.out.println("Eco...");
        }
    }
}
