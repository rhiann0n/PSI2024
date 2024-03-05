package unidad4;
/*Escribir una función a la que se le pase un número entero y devuelva el
* número de divisores primos que tiene.*/

/* Para calcular los divisores de un número solo tendremos en cuenta los números
* primos comprendidos entre 1 y el número que nos interese.
* Un ejemplo: los divisores de 24 son: 1, 2 y 3.
* Aunque 4 y 6 también dividen a 24, no se consideran al no ser primos. */

public class ActividadResuelta4_7 {
    static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;
        if (num < 2) {
            primo = false;
        }
        while (i < num && primo) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }

        return (primo);
    }

    public static void main(String[] args) {
        System.out.println("Divisores de 24: " + numDivisoresPrimos(24));
    }

    static int numDivisoresPrimos(int num) {
        int cont = 0; //contador de divisores
        for (int i = 2; i <= num; i++) {
            if (esPrimo(i) && num % i == 0) { // si i es primo y divide a num
                cont++; //incrementamos el número de divisores
            }
        }
        return (cont);
    }
}




