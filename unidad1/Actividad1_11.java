package unidad1;

import java.util.Scanner;

public class Actividad1_11 {
    public static void main(String[] args) {
        /*Los datos de entrada que necesiamos son:
        - cantidad vendida en el semestre 1 (de peras y manzanas)
        - cantidad vendida en el semestre 2 (ídem) */
        final double PRECIO_MANZANAS = 2.35; //valores constantes, no varían durante el programa
        final double PRECIO_PERAS = 1.95; //los identificadores constantes los escribimos en mayúsuculas
        int vManz1Sem, vManz2Sem; //ventas (en kgs) por semestre
        int vPeras1Sem, vPeras2Sem; //igual para las peras
        double  impTotal; //importe total
        Scanner sc = new Scanner(System.in);
        //pedimos los datos
        System.out.println("Para las manzanas: ");
        System.out.print("Ventas (en kilos) del primer semestre");
        vManz1Sem = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo semestre");
        vManz2Sem = sc.nextInt();
        System.out.println("Para las peras: ");
        System.out.print("Ventas (en kilos) del primer semestre");
        vPeras1Sem = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo semestre");
        vPeras2Sem = sc.nextInt();
        //calculamos el importe total obtenido
        impTotal = (vManz1Sem + vManz2Sem) * PRECIO_MANZANAS;
        impTotal += (vPeras1Sem + vPeras2Sem) * PRECIO_PERAS;
        System.out.println("El importe total es de :" + impTotal + " euros");




    }
}
;