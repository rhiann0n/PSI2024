package unidad1;

public class Actividad1_5 {
    //Veremos como Java evita que una operación provoque un desbordamiento.
    public static void main(String[] args) {
        short num;
        num = 32767; //valor máximo dentro del rango de short
        System.out.println("Valor máximo para el tipo de short: " + num);
        num++; //incrementamos en 1. Para evitar salirse del rango, la
        //variable num tomará el valor mínimo para el tipo short
        System.out.println("Valor mínimo para el tipo de short " + num);


    }
}
