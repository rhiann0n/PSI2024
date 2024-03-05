package unidad3;

import java.util.Scanner;

/*DADAS 6 NOTAS, ESCRIBIR LA CANTIDAD DE ALUMNOS APROBADOS, CONDICIONADOS (=4) Y
SUSPENSOS. */
/*Utilizaremos contadores que se incrementan cuando nos encontramos en una situación
concreta: la nota está aprobada, condicionada o suspensa. */
public class ActividadResuelta3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0, suspensos = 0; // contadores
        int condicionados = 0; // contadores
        int i;
        for (i = 1; i <= 6; i++) {
            System.out.println("Nota del alumno número " + i + ": ");
            int nota = sc.nextInt();
            if (nota == 4) { //comprobaremos en qué caso nos encontramos condicionados++;
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else if (nota < 4) { //este if es redundante, al ser el único caso posible
                suspensos++; //y podríamos poner else {...}
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Condicionados: " + condicionados);
    }
}
