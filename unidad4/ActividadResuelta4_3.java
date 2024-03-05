package unidad4;
/*Realizar una función que calcule y muestre el área o volumen de un cilindro,
* segun se especifique. Para distinguir un caso de otro se le pasará como opción
* un número: 1 (para el área) o 2 (para el volumen). Además hay que pasarle a la
* función el radio de la base y la altura.
* área = 2pi * radio * (altura + radio)
* volumen = pi * radio al cuadrado * altura */

import java.util.Scanner;

public class ActividadResuelta4_3 {
    static void areaVolumenCilindro(double radio, double altura, int opcion) {
        double volumen, area;
        switch (opcion) {
            case 1 -> {
                volumen = Math.PI * Math.pow(radio, 2) * altura; //aplicamos la fórmula
                System.out.println("El volumen es de : " + volumen);
            }
            case 2 -> {
                area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El área es de: " + area);
            }
            default -> System.err.println("ERROR");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca radio: ");
        double radio = sc.nextDouble();
        System.out.print("Introduzca altura: ");
        double altura = sc.nextDouble();
        System.out.print("¿Qué desea calcular (1 (volumen) / 2 (área): ");
        int tipoCalculo = sc.nextInt();
        System.out.println();
        areaVolumenCilindro(radio, altura, tipoCalculo);
    }
}
