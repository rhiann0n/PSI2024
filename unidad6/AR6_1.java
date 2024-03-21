/* Escribir un programa que muestre todos los caracteres Unicode junto a su code point,
* cuyo valor esté comprendido entre \u0000 y \uFFFF. */
package unidad6;
public class AR6_1 {
   /* Aprovechando la aritmética de caracteres mostraremos todos los símbolos
   * disponibles en la codificación Unicode, comprendidos entre \u0000 y \uFFFF. */
   public static void main(String[] args) {
       //usamos números en base hexadecimal, lo que se indica anteponiendo 0x
       //internamente la variable codePoint contiene valores decimales
       for(int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
           String xxxx = Integer.toHexString(codePoint); //convierte un número
           //en su representación hexadecimal
           mostrar("\\u" + xxxx + ": " + (char)codePoint);
       }
   }
   public static void mostrar (String texto) {
           System.out.println("\t" + texto);
       }
       public static void mostrarSinLn (String texto) {
           System.out.print("\t" + texto);
       }
}
