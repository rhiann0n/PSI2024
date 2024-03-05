package unidad4;

import java.util.Scanner;

public class CalculadoraIMCa {
        static Scanner sc = new Scanner(System.in);
        static double resultado = 0;
        static double altura = 0,peso = 0;
        public static void main(String[] args) {
            menu();//llamada a la función

        }
        static void menu() { //creamos la interfaz del menú
            mostrar(" --------------------------------");
            mostrar("|          1.Calcule su IMC       |");
            mostrar("|          2.Salir                |");
            mostrar(" --------------------------------");

            int opcion=sc.nextInt();//se recoge la opción seleccionada
            operaciones(opcion);
            menuShitPeso();
        }
        static  void operaciones(int opcion) {// aqui creo las operaiones que se realizaran despues de la opcion recogida y pido los datos
            if (opcion == 1 ) {
                mostrar("Ingrese la altura");
                altura = sc.nextDouble();
                mostrar("Ingrese el peso");
                peso = sc.nextDouble();
                imc(peso,altura);
            }else{
                mostrarErr("operacion no valida");
            }

        }
        static  void  mostrar(String texto){//con esta funcion nos ahorramos estar tirando souts en cada momento
            System.out.println(texto);
        }
        static void mostrarErr(String text){//creo esta funcion para los mensajes de error y el cierre del programa
            System.err.println(text);
        }
        static void imc(double peso,double altura){
            resultado=(peso/Math.pow(altura,altura));
            mostrar("Su IMC es de : "+resultado);
            shitTabla(resultado);
        }
        static void shitTabla(double resultado){
            if (resultado<18.5){
                mostrarErr("Bajo peso");
            } else if (resultado>=18.5&& resultado<25) {
                mostrar("Normal");
            } else if (resultado>=25&&resultado<30){
                mostrar("Sobrepeso");
            }else {
                mostrarErr("Obesidad");
            }
        }
        static void menuShitPeso(){
            mostrar("---------------------------------");
            mostrar("          1.Hombre               |");
            mostrar("          2.Mujer                |");
            mostrar("---------------------------------");

            int opcionDos=sc.nextInt();//aqui recojo la opcion recogida
            operacionesDos(opcionDos);

        }
        static void operacionesDos(int opcionDos){

            if (opcionDos == 1 ) {
                double resultadoDosH=50+(((altura*100)-150)*0.92);
                mostrar("Tu peso ideal seria de: " + resultadoDosH+ " Kg");

            }else{
                double resultadoDosM=45.5+(((altura*100)-150)*0.92);
                mostrar("Tu peso ideal seria de: " + resultadoDosM+" Kg");

            }
        }
    }

