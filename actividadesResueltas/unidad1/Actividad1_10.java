package unidad1;
import java.util.*;
//Tras solicitar la información requerida usaremos operadores lógicos para conseguir
//saber si es posible salir a la calle.
public class Actividad1_10 {
    public static void main(String[] args) {
        boolean llueve, finalizadoTareas, irBiblioteca;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Está lloviendo? (true/false)");
        llueve = sc.nextBoolean();
        System.out.println("¿Has finalizado tus tareas? (true/false)");
        finalizadoTareas = sc.nextBoolean();
        System.out.println("¿Tienes que salir a la biblioteca? (true/false)");
        irBiblioteca = sc.nextBoolean();
        boolean salir = !llueve && finalizadoTareas || irBiblioteca;
        System.out.println("Puedes salir: " + salir);





    }
}
