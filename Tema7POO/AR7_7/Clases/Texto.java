package AR7_7.Clases;
import java.time.LocalDate;
import java.time.LocalDateTime;
/* La clase texto contendrá:
*   - un String (donde guardaremos la cadena de caracteres)
*   - un número entero que indicará la longitud máxima del texto
*   - fecha de creación del texto
*   - la fecha y la hora de la última modificación. */
public class Texto {
    private String cad; //cadena de caracteres
    LocalDate creacion;
    LocalDateTime ultimaModificacion;
    private final int LONGITUD_MAX; //del tetxto, Una vez asignado no varía
    static final String VOCALES = "aeiouáéíóúü"; //cadena constante y estática que
    //contine todas las posibles vocales en minúsculas

     public Texto (int longitudMax) {
         cad = ""; // cad referencia un objeto Sting con valor "", no se puede usar
         // cad = null, en este caso cad no referencia ningún objeto y no es posible
         //usar sus métodos
         this.LONGITUD_MAX = longitudMax;
         creacion = LocalDate.now();
         ultimaModificacion = null; //aún no se ha modificado nada
     }

     //Añade un carácter al final del texto, siempre y cuando quede sitio
    public void addFinal(char c) {
         if (LONGITUD_MAX > cad.length()) {
             cad = cad + c; //concatena el carácter al final
             ultimaModificacion = LocalDateTime.now();
         }
    }

    //Añade una cadena al final del texto, siempre y cuando quede sitio
    public void addFinal(String c) {
         if (LONGITUD_MAX >= cad.length() + c.length()) {
             cad = cad + c;
             ultimaModificacion = LocalDateTime.now();
         }
    }

    //Añade un carácter al comienzo del texto, siempre y cuando quede sitio
    public void addPrincipio(char c) {
         if (LONGITUD_MAX > cad.length()) {
             cad = c + cad;
             ultimaModificacion = LocalDateTime.now();
         }
    }

    //Añade una cadena al comienzo del texto, siempre y cuando quede sitio
    public void addPrincipio(String c) {
         if (LONGITUD_MAX >= cad.length() + c.length()) {
             cad = c + cad;
             ultimaModificacion = LocalDateTime.now();
         }
    }

    public void mostrar() {
        System.out.println("Texto creado el: " + creacion);
        System.out.println("Última modificación: " + ultimaModificacion);
        System.out.println(cad);
    }

    //Devuelve el número de vocales presentes en el texto
    public int numVocales() {
         int voc = 0; //num de vocales del texto
        for (int i = 0; i < cad.length(); i++) {
            if (esVocal(cad.charAt(i))) {
                voc++;
            }
        }
        return (voc);
    }

    //Comprueba si el carácter pasado es una vocal: mayúscula/minúscula/acentuada
    private boolean esVocal(char c) {
         boolean vocal = false;
         c = Character.toLowerCase(c); //convertimos el carácter a minúscula
        if (VOCALES.indexOf(c) != -1) { //buscamos el carácter (en minúscula) en las posibles vocales
            vocal = true;
        }
        return (vocal);
    }
}
