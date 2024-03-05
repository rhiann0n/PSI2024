package unidad4;
/*Repetir la Actividad Resuelta 4.4 con una versión que calcule el máximo de 3 números.*/
/* Vamos a sobrecargar la función para que tenga 3 parámetros: maximo(a,b,c).
Para implementar la función podemos escribir el algoritmo desde cero o basarnos en
la función maximo() de la Act. resuelta 4.4. En este caso vamos a reutilizar
el código existente.*/
public class ActividadResuelta4_9 {
    //función máximo para tres números
    static int maximo(int a, int b, int c) {
        int aux = maximo(a, b); //la variable auxiliar contiene el mayor entre a y b
        return (maximo(aux, c)); //devuelve el mayor entre aux y c

    }
    //función máximo para dos números, necesaria para la definición anterior
    static int maximo (int a, int b) {
        int max;
        if (a > b) { //si a es mayor que b
            max = a;
        } else { //si son iguales o b mayor que a
            max = b;
        }
        return (max); //devuelve el valor de la variable max
    }

    //main para probar la función
    public static void main(String[] args) {
        int max = maximo(2, 9 , 7);
        System.out.println("El mayor es " + max);
    }
}
