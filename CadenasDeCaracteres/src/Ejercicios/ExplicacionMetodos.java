package Ejercicios;

public class ExplicacionMetodos {
    /*Métodos de d salida de mensajes en consola con internlinado
     * @param texto*/
    public static void main(String[] args) {
        String frase = "En un lugar de La Mancha";
        String frase2 = "En un lugar de Madrid";
    }


   public static void mostrar (String texto) {
           System.out.println("\t" + texto);
       }
       public static void mostrarSinLn (String texto) {
           System.out.print("\t" + texto);
       }
}
