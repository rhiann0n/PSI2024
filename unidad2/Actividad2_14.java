package unidad2;
import java.util.Scanner;

/*Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha
correspondiente al día siguiente.*/
/*Similar al anterior. En este caso la dificultad es que no todos los meses
tienn el mismo número de días. Por eso, lo primero que haremos es ver cuántos días
tiene el mes de la fecha.
No tendremos en cuenta los años bisiestos y suponemos correcta la fecha introducida.
 */
public class Actividad2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasDelMes=0; //Aquí guardaremos el número de días que tiene el mes
        System.out.println("Introduzca el día: ");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduzca el año: ");
        int anio = sc.nextInt();
        //suponemos que la fecha introducida es correcta
        diasDelMes = switch(mes) {
            case 2 -> 28; //si hay una sola instrucción se puede obviar yield y {}
            case 4, 6, 9, 11 -> 30;
            default -> 31;

        };
        dia++; //incrementamos el día
        if (dia > diasDelMes) { //si el día supera el número de días del mes
            dia = 1; //reiniciamos a día 1
            mes++;
            if (mes > 12) { //si mes supera 12
                mes = 1; //lo reiniciamos a 1
                anio++; //e incrementamos el año
    }
}
        //El año -1 pasó al año +1. El año 0 nunca existió.
        //Para evitar que el año pase del -1 al 0
        if (anio == 0) {
            anio = 1;
        }
        System.out.println(dia + "/" + mes + "/" + anio);
    }
}

