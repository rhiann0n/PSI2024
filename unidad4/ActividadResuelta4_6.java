package unidad4;
/* Diseñar una función con el siguiente prototipo:
*       boolean esPrimo(int n)
* que devolverá true si n es primo y false en caso contrario. */

/* La función esPrimo() indica con un booleano si el número pasado como parámetro
* es primo. Un número n es primo si no es divisible por ningún número entero entre 2 y n-1
* Recordemos que un número primo es solo divisible por él mismo y por 1. */
public class ActividadResuelta4_6 {
    static boolean esPrimo(int num) {
        boolean primo = true; //suponemos que el número es primo
        int i = 2; //primero número por el que veremos si es divisible
        if (num < 2) { // el primer primo es 2
            primo = false;
        }
        while (i < num && primo) { //se detiene si encuentra un divisor de num
            if (num % i == 0) { //si num es divisible por i
                primo = false; //entonces no es un número primo
            }
            i++;
        }

        //este algoritmo puede mejorar sabiendo que si un número no es divisible por
        //ningún entero comprendido entre 2 y su raíz cuadrada, entonces ya no será
        //divisible por ningún otro número y será primo. Quedaría:
        // while (i <= (int) Math.sqrt(num) && primo == true ) {
        //      ...
        // }
        //lo cual ahorra muchas vueltas para números primos grandes
        return (primo);
    }

    public static void main(String[] args) {
        for (int i= 1; i <= 15; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " es compuesto");
            }
        }
    }
}
