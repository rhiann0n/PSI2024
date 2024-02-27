package Controller;

import java.util.Scanner;
public class Repaso1 {
    public static void main(String[] args) {
        //tipos de datos -> las declaraciones de las variables tienen que ser llamadas con su tipo de dato
        //ej: int total;
        int total = 0; //se puede inicializar en el momento de la declaración o luego dentro de la ejecución del programa
        String nombreUsuario;
        String poblacion;
        int habitantes;
        //luego tenemos las declaracioens de la clase Scanner que nos permite leer la información que solicitamos,
        //siempre relacionado con el tipo de dato que se va a escribir
        //declaración
        Scanner sn = new Scanner(System.in);
        //Ej: solicita el nombre, la población y el número de habitantes, y acumúlalo hasta que se las 5 capitales
        // de provincia de CLM
        //sumar el total de habitantes de las 5 capitales
        //condicionales
        //bucles
        //utilizamos un bucle desde 1 hasta 5 y lee los datos
        for (int i=1;i<=5;i++) {
            System.out.println("Indica la provinicia: ");
            poblacion = sn.nextLine();
            System.out.println("Indica el número de habitantes: ");
            habitantes=sn.nextInt();sn.nextLine();
            System.out.println("Indica tu nombre: ");
            nombreUsuario = sn.nextLine();
            //condicional: si el num de habitantes es menor que 20000, indicar que hay un error y restar 1 a i
            //para que vuelva a solicitar la inf
            total+=habitantes;
            if (habitantes<20000){
                i--;
                System.out.println("Los habitantes de " + poblacion + " son más de " + habitantes + ". Vuelve a introducir la información.");
            } else {
                total += habitantes;
            }
        }
        System.out.println("El número de habitantes de las provincias de CLM es " + total);
    }

}
