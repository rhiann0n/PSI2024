package unidad4;
/*Crear una función que, mediante un booleano, indique si el carácter que se
* pasa como parámetro de entrada corresponde con una vocal.*/
/*La función tendrá en cuenta las vocales minúsculas y mayúsculas. No
* consideraremos las vocales acentuadas o con diéresis.*/
public class ActividadResuelta4_5 {
    //programa principal para probar la función
    public static void main(String[] args) {
        System.out.println("La i es una vocal: " + esVocal('i'));
        System.out.println("La E es una vocal: " + esVocal('E'));
        System.err.println("La f es una vocal: " + esVocal('f'));
    }

    //comparamos el parámetro de entrada c, con cada posible valor de una vocal.
    //Por simplicidad, obviamos las vocales acentuadas y con diéresis.
    static boolean esVocal(char c) {
        boolean resultado ; //true si es una vocal y false en caso contrario
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||
                c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
