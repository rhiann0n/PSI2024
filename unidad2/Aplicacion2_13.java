package unidad2;

import java.util.Scanner;

/*En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
El número de animales que alimentar (todos de la misma especie) es numAnimales,
y sabemos que cada animal come una media de kilosPorAnimal.
Diseña un programa que solicite al usuario los valores anteriores y determine si
disponemos de alimento suficiente para cada animal. En caso negativo, ha de calcular
cuál es la ración que corresponde a cada uno de los animales.
Nota: evitar que la aplicación realice divisiones por cero.*/
public class Aplicacion2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAnimales;
        double comidaDiaria, kilosPorAnimal, racion;
        System.out.println("Indica el número de animales en la granja: ");
        numAnimales = sc.nextInt();
        System.out.println("Indica la cantidad de comida disponible: ");
        comidaDiaria = sc.nextDouble();
        System.out.println("Indica cuántos kilos de comida come cada animal: ");
        kilosPorAnimal = sc.nextDouble();
        /*Analizamos los datos: si la comidaDiaria > numAnimales * kilosPorAnimal,
        entones tendrían suficiente comida */
        if (comidaDiaria>=numAnimales*kilosPorAnimal){
            System.out.println("Hay suficiente comida");
        }else{
            System.out.println("Falta comida en la granja, hay que ajustar la ración");
            //si esta condición se cumple, solicitan que calcule la ración necesaria
            //y evitemos la división entre 0
            if (numAnimales!=0){
                racion = comidaDiaria/numAnimales;
                System.out.println("Ajustando a lo que hay, los animales comerán " + racion + " kgs " +
                        "y no tendrán los kgs iniciales (" +kilosPorAnimal + "kg)");
            }

        }


    }
}
