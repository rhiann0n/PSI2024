package unidad1;

import java.util.Scanner;
public class Enunciado3 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in); //declaramos el scanner
        System.out.println("Indica cuántas NIÑAS hay matriculadas"); //solicitamos num niñas matriculadas
        short ninas=sn.nextShort(); //guardamos la variable
        System.out.println("Indica cuántos NIÑOS hay matriculados"); //solicitamos num niños matriculados
        short ninos=sn.nextShort(); //guardamos la variable
        double totalMatriculados=ninas+ninos; //
        double porcentajeNinas= ninas*100/totalMatriculados; //regla de 3
        double porcentajeNinos= ninos*100/totalMatriculados; //regla de 3
        System.out.println("El porcentaje de niñas matriculadas es " +porcentajeNinas);
        System.out.println("El porcentaje de niños matriculados es " +porcentajeNinos);

        /* Enunciado: Teniendo como base, que el 100% de un colegio está formado por todos
        los alumnos, solicita cuántas niñas y cuántos niños hay, e indica el porcentaje
        de cada uno. */




    }
}
