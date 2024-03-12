package unidad5;

import java.util.Arrays;
import java.util.Scanner;

/*El ayuntamiento de tu localidad te ha encargado una aplicación que ayude
a realizar encuestas estadísticas para conocer el nivel adquisitivo de los
habitantes del municipio. Para ello, tendrás que preguntar el sueldo a cada
persona encuestada. A priori, no conoces el número de encuestados. Para
finalizar la entrada de datos, introduce un sueldo con valor −1.

Una vez terminada la entrada de datos, muestra la siguiente información:
* Todos los sueldos introducidos ordenados de forma decreciente.
* El sueldo máximo y mínimo.
* La media de los sueldos.
*/
public class ActividadAplicacion5_14 {

    public static void main(String[] args) {
        double[] sueldos = altaSueldos();
        //llamamos al método mostrar decreciente
        mostrarDecreciente(sueldos);
        mostrarMaxMin(sueldos);
        mediaSueldos(sueldos);
    }

    /*Método para insertar los sueldos*/
    public static double[] altaSueldos() {
        double[] sueldos = new double[0];
        double sueldoAux = 0;
        Scanner sn = new Scanner(System.in);
        //el bucle do while (hasta que no se escribe -1 no finaliza)
       do {
           mostrarSinLn("Indique el sueldo: ");
           sueldoAux = sn.nextDouble();
           if (sueldoAux!=-1){
               sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
               sueldos[sueldos.length-1] = sueldoAux;
           }
       } while (sueldoAux!=-1);
        //enviamos el resutlado
        Arrays.sort(sueldos);
        return sueldos;
    }

    /*Método para mostrar decreciente*/
    public static void mostrarDecreciente(double[] sueldos) {
        for (int i = sueldos.length-1; i >= 0; i--) {
            mostrarSinLn(" " + sueldos[i] + "€");
        }
    }

    /*Método para indicar max. y min. de una tabla ordenada*/
    public static void mostrarMaxMin(double[] sueldos){
        mostrar("\nSueldo mayor -> " + (sueldos[sueldos.length-1] + "€"));
        mostrar("\nSueldo menor -> " + sueldos[0] + "€");
    }

    /*Método para indicar la media*/
    public static void mediaSueldos(double [] sueldos) {
        double suma = 0;
        for (int i = 0; i < sueldos.length; i++) {
            suma += sueldos[i];
        }
        double media = suma/sueldos.length;
        mostrar("\nLa media de los sueldos es: " + media + "€");
    }

    /*Métodos de impresión en pantalla*/
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
