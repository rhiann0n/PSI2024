package unidad3;
import java.util.Scanner;
/* Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo.
Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
la media, el número de alumnos y cuántos son mayores de edad. */

/* Desconocemos cuántas edades se van a utilizar como datos, el bucle while se ejecutará mientras la edad introducida
 * no sea negativa.
 * En cada iteración acumularemos la edad, incrementaremos un contador para llevar la cuenta de las edades introducidas
 * y, si el alumno es mayor de edad, incrementaremos el contador de alumnos mayores de edad.
 * Cuando salgamos del bucle mostraremos los datos y calcularemos la media. */
public class ActividadResuelta3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaEdades = 0; //acumulará la suma de todas las edades
        int contadorAlumnos = 0; //contador de alumnos (o de edades introducidas)
        int contadorMayorEdad = 0; //contador del número de alumnos mayores de edad
        double media; //media de las edades
        System.out.print("Introduzca edad: ");
        int edad = sc.nextInt(); //leemos la edad
        while (edad >= 0) { //repetimos mientras la edad no sea negativa
            sumaEdades += edad; //acumulamos la edad introducida
            contadorAlumnos++; //incrementamos, se ha introducido la edad de un alumno más
            if (edad >= 18) { //si la edad introducida corresponde a un mayor de edad
                contadorMayorEdad++; //incrementamos, ahora hay un mayor de edad más
            }
            System.out.print("Introduzca edad: ");
            edad = sc.nextInt(); //volvemos a leer
    }
    media = (double) sumaEdades/contadorAlumnos; //con el cast la división es real
                                                 //mostramos el informe estadístico
        System.out.println("Suma de todas las edades: " + sumaEdades);
        System.out.println("Media: " + media);
        System.out.println("Número total de alumnos: " + contadorAlumnos);
        System.out.println("Mayores de edad: " + contadorMayorEdad);

}

}
