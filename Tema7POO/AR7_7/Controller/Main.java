package AR7_7.Controller;

import AR7_7.Clases.Texto;

//Creamos un objeto Texto para probar su funcionamiento.
public class Main {
    public static void main(String[] args) {
        Texto t = new Texto(5);
        t.addPrincipio("HO");
        t.addPrincipio(';');
        t.addFinal("Lá");
        t.addFinal('X'); //este carácter no cabe en el texto. No se añade
        t.mostrar();
        System.out.println("Número de vocales: " + t.numVocales());
    }
}
