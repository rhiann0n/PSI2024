package unidad3;
import java.util.Scanner;
/*Diseña una app que muestre la edad máx. y mín. de un grupo de alumnos. El
usuario introducirá las edades y terminará escribiendo un -1.*/
public class ActividadPropuesta3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte edad, edadMin, edadMax;
        System.out.println("Indica la edad -> "); //Esta línea se tiene que repetir
        edad = sc.nextByte();
        edadMin = edad;
        edadMax = edad;
        while (edad != -1) { //se repetirá mientras el usuario no escriba -1
            //condicionales if
            if (edadMin > edad) {
                edadMin = edad;

            }
            if (edadMax < edad){
                edadMax=edad;
            }
            System.out.println("Indica la edad -> ");
            edad = sc.nextByte();

        }
        System.out.println("La edad mínima ingresada es: " + edadMin);
        System.out.println("La edad máxima ingresada es: " + edadMax);
    }
}
