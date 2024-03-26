/*Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre
comienzan sus frases con «Javalín, javalón», para después hacer una pausa más
o menos larga (la pausa se representa mediante espacios en blanco o tabuladores)
y a continuación expresan el mensaje. Existe un dialecto que no comienza sus
frases con la muletilla anterior, pero siempre las terminan con un silencio,
más o menos prolongado y la coletilla «javalén, len, len». Se pide diseñar un
traductor que, en primer lugar, nos diga si la frase introducida está escrita
en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo,
nos muestre solo el mensaje sin muletillas.*/
package unidad6;
import java.util.Scanner;
/* Para ver si la frase está escrita en javalandés, miramos si empieza o termina por
* el prefijo o el sufijo de sus dialectos. Para ello, usamos los métodos startsWith()
* y endsWith() de la clase String. Para extraer el mensaje, utilizamos dos versiones
* sobrecargadas de substring(). */
public class AR6_8 {
    public static void main(String[] args) {
        final String prefijo = "Javalín, javalón"; //constantes con el comienzo y la
        final String sufijo = "javalén, len, len"; //terminación en javalandés
        Scanner sn = new Scanner (System.in);
        mostrarSinLn("Escriba una frase: ");
        String entrada = sn.nextLine(); //texto de entrada al traductor
        boolean idiomaJavalandia = false; //suponemos que entrada no está em javalandés
        //Vamos a comprobar si el texto de entrada empieza o termina con alguna muletilla
        if (entrada.startsWith(prefijo)) { //si la entrada comienza con prefijo
            idiomaJavalandia = true; //el idioma es javalandés
            entrada = entrada.substring(prefijo.length()); //quitamos el prefijo
            //nos quedamos con los carácteres de entrada a partir del siguiente al prefijo
        }else if (entrada.endsWith(sufijo)) { //si la entrada termina con sufijo
            idiomaJavalandia = true; //es javalandés
            entrada = entrada.substring(0, entrada.length() - sufijo.length()); //quitamos el sufijo
            //Nos interesa desde el primer carácter de la entrada (0) hasta el caracter antes del sufijo
        }
        if (idiomaJavalandia) {
            entrada = entrada.strip(); // quitamos los espacios antes y después
            mostrar(entrada); //mostramos
        } else {
            mostrar("No está escrito en el idioma de Javalandia");
        }
    }
    public static void mostrar (String texto) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto) {
            System.out.print("\t" + texto);
        }
}
