package unidad3;
/* ESCRIBIR TODOS LOS MÚLTIPLOS DE 7 MENORES QUE 100. */
/* Vamos a utilizar un bucle for, inicializando la i a 0, e iterando hasta
* que el valor supere 100. Los múltiplos de 7 se caracterizan porque se
* diferencian en 7. */
public class ActividadResuelta3_7 {
    public static void main(String[] args) {
        for (int i =0; i < 100; i += 7) {
            System.out.println(i);
        }
        //Cuando el bloque de instrucciones de for, while o do-while está formado
        //por una sola instrucción, no precisa de llaves {}.
        //Aunque, por claridad en el código, se aconseja ponerlas.
    }
}
