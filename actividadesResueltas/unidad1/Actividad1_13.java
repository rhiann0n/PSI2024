package unidad1;

import java.util.Scanner;

public class Actividad1_13 {
    public static void main(String[] args) {
        /*Pediremos tres notas enteras y calcularemos la media con y sin decimales.*/
        int nota1, nota2, nota3; //variables para las notas
        int mediaBoletin; //la media es de tipo entero
        double mediaExpediente; //la media usa decimales
        Scanner sc = new Scanner(System.in);
        //leemos las notas
        System.out.print("Nota primer trimestre: ");
        nota1 = sc.nextInt();
        System.out.print("Nota segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.print("Nota tercer trimestre: ");
        nota3 = sc.nextInt();
        //calculamos la media con decimales
        mediaExpediente = (nota1 + nota2 + nota3) / 3.0; //el 3.0 fuerza una división real
        mediaBoletin = (int) mediaExpediente; //convertimos un valor double en un valor int,
                                              //truncando la parte decimal. Por tanto, hay
                                              //pérdida de información.
        System.out.println("Boletín de calificaciones: " +  mediaBoletin);
        System.out.println("Expediente académico: " + mediaExpediente);



    }


}
