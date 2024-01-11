package unidad1;
import  java.util.*;
/*Para calcular la longitud y el área utilizaremos el valor de pi que nos brinda Math.
* Y usaremos el método de la API que eleva una base a un exponente para el cuadrado
 */
public class Actividad1_7 {
    public static void main(String[] args) {
        double radio; //el radio puede contener decimales
        double area, longitud;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //usaremos decimales con .
        //pedimos los datos
        System.out.print("Escriba el radio: ");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio; //la clase Math pertenece al paquete
        //java.lang, que se importa por defecto
        area = Math.PI * Math.pow(radio, 2); //Math.pow(base, exponente) eleva la base
        //al exponente utilizado. Math.pow(radio, 2) eleva el radio a 2 (al cuadrado)
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);



    }
}
