package unidad4;
/*Diseñar la función calculadora(), a la que se le pasan 2 números reales (operandos)
* y qué operación se desea realizar con ellos. Las operaciones disponibles son: sumar,
* restar, multiplicar o dividir. Estas se especifican mediante un número: 1 para la suma,
* 2 para la resta, 3 para la multiplicación y 4 para la división. La función devolverá el
* resultado de la operación mediante un número real.*/
public class ActividadResuelta4_8 {
    //programa para probar
    public static void main(String[] args) {
        for (int operacion = 1; operacion <=4; operacion++) { //todas las operaciones
            double resultado = calculadora(3.0, 4.0, operacion); //operamos con 3.0 y 4.0
            System.out.println(resultado);
        }
    }
    //Realiza la operación indicada:
    //1- suma
    //2- resta
    //3- multiplicación
    //4- división
    static double calculadora(double a, double b, int operacion) {
        double result; //resultado de la operación
        result = switch (operacion) {
            case 1 -> //suma
                a + b; //si solo existe una instrucción no hace falta escribir yield
            case 2 -> //resta
                a - b;
            case 3 -> //multiplicación
                a * b;
            case 4 -> //división
                (double) a / b;
            //falta comprobar que no es una división por 0
            //el cast fuerza que la división sea real
            default -> {
                System.err.println("Operación no válida");
                yield 0; //si la operación no tiene sentido devolveremos 0
            }
        };
        return (result);
    }
}
