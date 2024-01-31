package unidad3;

import java.util.Scanner;

/*PEDIR 5 CALIFICACIONES DE ALUMNOS Y DECIDIR SI HAY ALGÚN SUSPENSO*/
/* Utilizamos una bandera para controlar si entre los alumnos existe al menos uno
* con una asignatura suspensa (nota menor que 5). Una bandera es una variable,
* normalmente booleana, que indica, mediante sus valores, alguna situación o
* estado. En este caso:
* -suspenso = false, significa que no existe ninguna nota suspensa
* -suspenso = true, significa que existe, al menos, una nota suspensa
* Hay que tener cuidado cuando se activa una bandera, en no volver a desactivarla,
* ya que entonces no refleja lo que intentamos evaluar, sino la última situación
* ocurrida. */
public class ActividadResuelta3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean suspensos = false; // suponemos que en principio no hay ningún suspenso
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca nota (de 0 a 10): ");
            int notas = sc.nextInt();
            if (notas < 5) { //si la nota corresponde a un suspenso
                suspensos = true; // activamos la bandera a true
            }
        }
        if (suspensos) {
            System.out.println("Hay alumnos suspensos");
        } else {
            System.out.println("No hay suspensos");
        }
    }
}
