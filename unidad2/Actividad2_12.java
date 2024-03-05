package unidad2;
import java.util.Scanner;
//Hay que considerar que no todos los meses tienen el mismo número de días.
public class Actividad2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        boolean fechaCorrecta; //variable que indica si la fecha es correcta.
        System.out.println("Introduzca día: ");
        dia = sc.nextInt();
        System.out.println("Introduzca mes: ");
        mes = sc.nextInt();
        System.out.println("Introduzca año: ");
        anio = sc.nextInt();
        if (anio == 0) {
            fechaCorrecta = false;
        } else {
            //primero comprobaremos febrero (mes=2)
            if (mes == 2 && (1 <= dia && dia <= 28)) {
                fechaCorrecta = true;
            } else //veremos si es un mes de 30 días
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia <= 30)) {
                fechaCorrecta = true;
            } else { // comprobaremos si es un mes de 31 días
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1 <= dia && dia <= 31)) {
                    fechaCorrecta = true;
                } else { //en cualquier otro caso
                    fechaCorrecta = false;
                }
            }
            if (fechaCorrecta) {
                System.out.println("Fecha OK: " + dia + "/" + mes + "/" + anio);
            } else {
                System.out.println("Fecha incorrecta");

                }
            }
        }
    }

