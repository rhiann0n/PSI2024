package Explicaciones;

import java.util.Arrays;

public class ExplicacionMetodos {
    public static void main(String[] args) {
        String frase = "En un lugar de la mancha";
        String frase2= "En un lugar de madrid";
        /*Método CharAt → Devuelve el caracter del índice especificado*/
        char letra = frase2.charAt(0);
        mostrar("" + letra);
        /*Método CompareTo → Compara dos cadenas entre sí. Da como resultado un entero, donde:
        * 0 → son iguales
        * <0 → la cadena es mayor
        * >0 → la cadena es menor*/
        int resultado = frase2.compareTo(frase);
        mostrar("El resultado de la comparación -> " + resultado);
        //pueden dar resultados distintos dependiendo del uso de mayúsculas y minúsculas
        String nombre1 = "José";
        String nombre2 = "José";
        mostrar("El nombre1 y el nombre2 da como resultado al compararlos -> " + nombre1.compareTo(nombre2));
        /*Método Concat → Une la cadena especificada al final de nuestra cadena*/
        String nombreCompleto = nombre1.concat(" Ruiz");
        mostrar("Nombre completo: " + nombreCompleto);
        /*contentEquals() -> Devuelve true solo si la secuencia de caracteres es igual a la cada
        * informada*/
        boolean resultadoB = nombre1.contentEquals(nombre2);
        mostrar("Booleano de resultado: " + resultadoB);
        /*copyValueOf(char[]) -> Devuelve una cadena que representa la secuencia de caracteres
        * en el Array informado*/
        char[] arrayChar = { 'H','o','l','a',' ','M','u','n','d','o'};
        String letraV = " "; //los char van con las comillas simples
        mostrar("" + letraV.copyValueOf(arrayChar));
        String cadena = letraV.copyValueOf(arrayChar);
        mostrar(cadena);

        //Podemos indicar el índice a partir del cual se quiere extraer el array para convertirlo en una cadena
        mostrar("" + letraV.copyValueOf(arrayChar,5,5));

        /*Método endsWith(String sufijo) -> Chequea si la cadena termina con el sufijo especificado*/
        resultadoB = frase.endsWith("Mancha");
        mostrar("La frase 1 termina con Mancha? -> " + resultadoB);
        /*Método startsWith -> Chequea si la cadena comienza con el sufijo especificado*/
        resultadoB = frase2.startsWith("Hola");
        mostrar("La frase 1 comienza con Hola -> " + resultadoB);
        /*Se puede especificar el índice inicial para utilizar el startsWith*/
        resultadoB = frase2.startsWith("un", 3);
        mostrar("La frase 2 comienza con 'un' en el índice 3 -> " + resultadoB);
        /*compara dos cadenas*/
        if (frase2.equals(frase))
            mostrar("Las cadenas son iguales");
        else
            mostrar("Las cadenas son diferentes");
        /*comparar dos cadenas ignorando las mayúsculas y minúsculas*/
        String nombre3 = "josé";
        mostrar("El nombre 1 " + nombre1 + " es igual al nombre 3 " + nombre3 + " -> " + nombre1.equalsIgnoreCase(nombre1));
        /* hash Code -> codificación para hacer contraseñas y encriptar */
        mostrar("HashCode de la frase \"En un lugar de La Mancha\" -> " + frase.hashCode());
        /*indexOf(int ch) -> devuelve el índice dentro de la cadena de la primera coincidencia del caracter especificado*/
        mostrar("" + frase2.indexOf('a'));
        //Devuelve el índice dentro de la cadena de la primera coincidencia del caracter especificado a partir del indice especificado
        mostrar("" + frase2.indexOf('m', 5));
        /*indexOf puede devolver el índice dentro de la cadena de la primera coindicendia de la subcadena
        * especificada */
        mostrar("indexOf indicando indice -> " + frase2.indexOf("lugar")); //resultado 6
        /*le puedes indicar el índice a partir del cual buscas la cadena*/
        mostrar("indexOf indicando indice -> " + frase2.indexOf("lugar",11)); //-1 pq no lo encuentra
        /*lastIndexOf devuelve el índice de la última coincidencia del caracter especificado */
        mostrar(""+frase2+" - índice de la última coincidencia de 'a' ->"+frase2.lastIndexOf('a'));
        /*lastIndexOf funciona igual que indexOf, pero siempre devolviendo la última coincidencia*/

        /*length -> nos devuelve la longitud de una cadena, o sea, el nº de caracteres incluyendo espacios*/
        int longitudF1=frase.length();
        mostrar("La frase 1 tiene " + longitudF1 + " caracteres");
        /*replace permite reemplazar un caracter por otro en una cadena*/
        mostrar(""+frase2.replace(" ","_"));
        //también podemos reemplazar cadenas
        mostrar(""+frase2.replaceAll("madrid","Tomelloso")); //expresiones regulares. no visto

        //reemplazar la primera coincidencia
        String frase3 = "Esta es una frase de otra frase que tenemos en la clase";
        mostrar(""+frase3.replaceFirst("ase","oto"));
        mostrar(""+frase3.replaceAll("ase","oto"));
        /*split -> devolver una array de una cadena dividida por un caracter indicado*/
        String[] arrayCadena= frase2.split("n");
        mostrar(Arrays.toString(arrayCadena));
        String listaNombres = "Jose,Pedro,Juan,Manuel,Lucia,Susana,Ana,Belen";
        String[] arraysNombres =listaNombres.split(",");
        for (String elemento:arraysNombres) {
            mostrar("· "+ elemento);
        }
        nombreCompleto="irene ramírez marquina";
        /*subString (indice) devuelve una nueva cadena a partir de otra*/
        //toUpperCase convierte el caracter o cadena a mayúsculas
        String nombreMayuscula = nombreCompleto.substring(0,1).toUpperCase()+nombreCompleto.substring(1);
        mostrar(nombreMayuscula);
        /*¿Cómo convertirías todo el nombre y apellidos la inicial en mayuscula con lo que hemos visto hasta ahora? */
        String [] arrayMayus = nombreCompleto.split(" ");
        String nombreConv = "";
        for(String nom:arrayMayus) {
            nombreConv+=nom.substring(0,1).toUpperCase()+nom.substring(1)+" ";
        }
        mostrar(nombreConv);
        /*Hacer este ejemplo:
        * escribe 3 nº de tlf e indica si son válidos en España 926510052 456987741 325985233*/
       String [] phone = {"926515005","456987741","325985233","609639798"};
       for (String ph:phone) {
           if (ph.length()==9) {
               if (ph. length() == 9 && ph.substring(0,1).equals("9") || ph.substring(0,1).equals("8") || ph.substring(0,1).equals("7") || ph.substring(0,1).equals("6"));
               mostrar("El teléfono " + ph + " es correcto");
               }
           else {
               mostrar("El teléfono " + ph + " no es correcto, porque no tiene la longitud correcta (9 dígitos) o " +
                       "no comienza por 6, 7, 8 o 9");
           }
           }
       /*toCharArray -> convierte una cadena en array de char*/
        char [] cadenaToChar=frase2.toCharArray();
        mostrar(""+Arrays.toString(cadenaToChar));
        //toLowerCase convierte una cadena a minúsculas
        String nombre4= "IRENE RAMIREZ MARQUINA";
        mostrar("" + nombre4.toLowerCase());
        String nombreAcento= "JOSÉ MARÍA NUÑEZ";
        mostrar("" + nombreAcento.toLowerCase());
        /* trim -> elimina los espacios en blanco del principio y del final*/
        nombreAcento = " "+nombreAcento+" ";
        mostrar("" + nombreAcento);
        mostrar("" + nombreAcento.trim());

        /*Valores primitivos*/
        /*String.valeuOf convierte un dato primitivo en una cadena de caracteres*/
        String cad;
        cad = String.valueOf(560); // "560"
        cad = String.valueOf(57.85); // "57.85"
        cad = String.valueOf(true); // "true"

        //Clase Character -> char
        //a través de métodos, identificar si es dígito, si es letra, si es un espacio en blanco
        //y si es otro caracter
        letra = frase.charAt(2);
        mostrar("El índice 2 de la frase \n "+ frase2 + "\n ¿Es un dígito?: " + Character.isDigit(letra));
        mostrar("El índice 2 de la frase \n "+ frase2 + "\n ¿Es un espacio en blanco?: " + Character.isWhitespace(letra));
        mostrar("El índice 2 de la frase \n "+ frase2 + "\n ¿Es una letra?: " + Character.isLetter(letra));
        mostrar("El índice 2 de la frase \n "+ frase2 + "\n ¿Es una letra o dígito?: " + Character.isLetterOrDigit(letra));
        letra=frase.charAt(0);
        mostrar("El índice 0 de la frase \n " + frase + "\n ¿Está en mayúscula?: " + Character.isUpperCase(letra));
        mostrar("El índice 0 de la frase \n " + frase + "\n ¿Está en minúscula?: " + Character.isLowerCase(letra));








       }


       public static void mostrar (String texto) {
               System.out.println("\t" + texto);
           }
           public static void mostrarSinLn (String texto) {
               System.out.print("\t" + texto);
           }
    }




