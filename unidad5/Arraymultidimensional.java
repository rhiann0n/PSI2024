package unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Arraymultidimensional {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        mostrarLn("Nombre  Apellidos   Profesion  Email ");
        mostrarAlumnos(alumnosDatos());
    }
    static String[][]alumnosDatos() {
        mostrarLn("Inserte el dato requerido ");
        String alumnos[][] = new String[3][4];
        //LEEMOS LOS DATOS DE LOS ALUMNOS Y LOS GUARDAMOS EN EL ARRAY
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                ;
                if (j == 0) {
                    mostrar("Indica tu nombre-> "+(i+1));
                    alumnos[i][j] = sc.next();sc.nextLine();
                }if (j==1){
                    mostrar("indica el apellido->"+(i+1));
                    alumnos[i][j]=sc.next();sc.nextLine();
                }if (j==2){
                    mostrar("Indica la profesion->"+(i+1));
                    alumnos[i][j]= sc.next();sc.nextLine();
                }if (j==3){
                    mostrar("Indica el e-mail->"+(i+1));
                    alumnos[i][j]=sc.next();;sc.nextLine();
                }
            }
        }
        mostrarAlumnos(alumnos);

        return alumnos;
    }
    /**FUNCION QUE MUESTRA LA INFORMACION ORDENADA POR EL NOMBRE DE LOS ALUMNOS Y EN FORMA DE TABLA
     * FOREACH **/
    static void mostrarAlumnos (String alumnos[][]){
        int x=alumnos.length;
        String auxNombre,auxApellido,auxProf,auxEmail;
        for (int i=0;i<x;i++){
            for (int j=0;j<x;j++){
                if (alumnos[i][0].compareToIgnoreCase(alumnos[j][0])>0){
                    auxNombre=alumnos[j][0];
                    auxApellido=alumnos[j][1];
                    auxProf=alumnos[j][3];
                    auxEmail=alumnos[j][3];
                    alumnos[j][0]=alumnos[i][0];
                    alumnos[j][1]=alumnos[i][1];
                    alumnos[j][2]=alumnos[i][2];
                    alumnos[j][3]=alumnos[i][3];
                    alumnos[i][0]=auxNombre;
                    alumnos[i][3]=auxApellido;
                    alumnos[i][3]=auxProf;
                    alumnos[i][4]=auxEmail;
                }
            }
        }
        mostrarLn("Nombre, Apellidos, Profesion, Email");
        for (String[]  alumnos1: alumnos){
            mostrar(Arrays.toString(alumnos1));
        }
    }
    static void mostrar (String texto){
        System.out.print(texto);
    }
    static void mostrarLn (String texto){
        System.out.println(texto);
    }
}

