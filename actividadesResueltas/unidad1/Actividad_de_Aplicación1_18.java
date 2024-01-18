package unidad1;

import java.util.Scanner;

/*Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita
una aplicación que le ayude a contabilizar el número de patas que tienen en total todos
los animales capturados durante una jornada de trabajo. Para ello, te ha solicitado que
escribras una aplicación a la que hay que proporcionar:
* El número de hormigas capturadas (6 patas).
* El número de arañas capturadas (8 patas).
* El número de cochinillas capturadas (14 patas).
La aplicación debe mostrar el número total de patas.*/
public class Actividad_de_Aplicación1_18 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int hormigas, aranias, cochinillas, patas, totalPatas;
        System.out.println("Introduzca el número de hormigas capturadas: ");
        hormigas = sn.nextInt();
        System.out.println("Introduzca el número de arañas capturadas: ");
        aranias = sn.nextInt();
        System.out.println("Introduzca el número de cochinillas capturadas: ");
        cochinillas = sn.nextInt();
        totalPatas = ((hormigas*6)+(aranias*8)+(cochinillas*14));
        System.out.println("Número total de patas de las capturas: " + totalPatas);

    }

}
