package controlador;

/**
 * Los comentarios: son mensjaes que me permiten documentar un programa
 * pero que no se ejecuta.
 * comentarios de linea//
 * comentarios de bloque /*
 * */

public class main {
    public static void main(String[] args) {  // pvsm + tab se escribe auto

        System.out.println("hola Mundo");  // sout + tab se escribe auto
        System.out.println("Mi nombre es IRENE");
        int primerNumero=10; //int indica que el tipo de dato es entero
        String nombreUsuario="Iris Ñañez";  //String indica que el dato es un texto
        System.out.println(primerNumero);  //muestra en pantalla lo que esta dentro de las comillas
        System.out.println("El nombre del usuario es " + nombreUsuario);
        /* ****Tipos de datos primitivos **** * */
        float precio= 566855.55f;
        double otroPrecio=465465465456.54656;
        int codigoPostal=35550, codigoMesa;
        boolean capa=true,  encendido=false;
        /*
        comentario en bloque
        */

        System.out.println(precio);
        System.out.println(encendido);
        char letras='a';
        byte    aniversarioCentro=127;
        System.out.println("Los años del Centro son " + aniversarioCentro + " años. ");
        int a=5;
        int b=6;
        int c=a+b;  //c=11
        System.out.println("El valor de c es "+ c);
        c=c-a;  //c=6 -> la variable puede cambiar de valor mientras se ejecuta el programa
        System.out.println("Ahora c vale "+c);
        /* CONSTANTES-> el valor una vez declarado no cambia mientras se ejecuta el programa*/
        final int mayoriaDeEdad=18;


    }
}
