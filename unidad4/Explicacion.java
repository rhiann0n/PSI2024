package unidad4;
//función simple
public class Explicacion {
    //Las funciones o métodos en Java
    //Permiten la reutilización de código y el fácil mantenimiento del mismo
    public static void main(String[] args) {
        sumar(); //invocando la ejecución de la función
        sumarDosNumeros(45, 88);
        int resultado = sumarDosNumerosYdevolver(34, 67);
        System.out.println("El resultado de 34+67= " + resultado);
        sumar(45, 65);

    }
    public static void sumar(){
        int a = 45;
        int b = 62;
        int suma = a + b;
        System.out.println("El resultado de " + a + " + " + b + " = " + suma);
        // se regresa a la siguiente línea de la función donde es llamada
        int resultado = sumarDosNumerosYdevolver(a, b);
    }
    //Envío de datos o parámetros
    public static void sumarDosNumeros(int a, int b) {
        System.out.println("El resultado de " + a + " + " + b + " = " + (a+b));
    }
    // devolver valores de una función: para ello utilizamos la instrucción return

    public static int sumarDosNumerosYdevolver(int a, int b) {
        return a+b;
    }
    /* SOBRECARGA DE FUNCIONES */
    public static String sumar (int a, int b) {
        int resultado = a + b;

        System.out.println("El resultado es " + resultado + " ***Sobrecarga***");
        return "Listo";
    }
}


