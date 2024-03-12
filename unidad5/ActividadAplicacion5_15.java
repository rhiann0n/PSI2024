package unidad5;

import java.util.Scanner;

/* Debes desarrollar una aplicación que ayude a gestionar las notas de un
centro educativo. Los alumnos se organizan en grupos compuestos por 5
personas. Leer las notas (números enteros) del primer, segundo y tercer
trimestre de un grupo. Debes mostrar al final la nota media del grupo en
cada trimestre y la media del alumno que se encuentra en una posición
dada (que el usuario introduce por teclado). */
public class ActividadAplicacion5_15 {
    static Scanner sn = new Scanner(System.in);
    static int[][] notas = new int[3][5]; //3 trimestres (filas), 5 alumnos (columnas)
    public static void main(String[] args) {
        altaNotas();
        mediaAlumno();
    }

    //MÉTODO PARA INSERTAR NOTAS
    public static int[][] altaNotas() {
        //solicitamos los trimestres
        for (int trimestre = 0; trimestre < 3; trimestre++) {
            mostrar("Notas del trimestre " + (trimestre + 1) + ": ");
            leerNotas(notas, trimestre);
        }
        return notas;
    }

    //MÉTODO PARA LEER LAS NOTAS
    public static void leerNotas(int[][] notas, int trimestre) {
        for (int i = 0; i < notas[trimestre].length; i++) {
            mostrarSinLn("Alumno (" + (i + 1) + ") ");
            notas[trimestre][i] = sn.nextInt();
        }
        //Después de leer las notas, nos piden la media x trimestre
        int[] media = new int[3];
        for (int alum = 0; alum < 5; alum++) {
            for (int trim = 0; trim < 3; trim++) {
                media[trim] += notas[trim][alum];
            }
        }
        mostrar("La media del 1º Trimestre es: " + (media[0] / 5));
        mostrar("La media del 2º Trimestre es: " + (media[1] / 5));
        mostrar("La media del 3º Trimestre es: " + (media[2] / 5));
    }
    
    //MÉTODO MEDIA X ALUMNO
    public static void mediaAlumno() {
        mostrarSinLn("Indique la posición del alumno -> ");
        int pos = sn.nextInt();
        double mediaA= (notas[0][pos-1]+notas[1][pos-1]+notas[2][pos-1])/3.0;
        mostrarSinLn("La media del alumno " + pos + " es: ");
        System.out.printf("%2f", mediaA);
    }

    //MÉTODOS DE IMPRESIÓN EN PANTALLA
    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto){
        System.out.print("\t" + texto);
        }
    }