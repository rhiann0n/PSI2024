package unidad3;

import java.util.Scanner;

public class SalidasAnticipadasContinue {
    /*
    * Hacer una lista 14 personas de la clase, y saltar los que se llamen "Manuel".
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String nombresInp="";
        String todosNombres="";
        for (byte i = 1; i <= 14; i++) {
            System.out.print("Indica tu nombre ->");
            nombresInp+=sn.nextLine();
            if (nombresInp.equals("Manuel") || nombresInp.equals("manuel")) {
                continue;
            }
            todosNombres+=nombresInp+"\n";
        }
        System.out.println("*** ALUMNOS ***\n" + todosNombres);
    }
}
