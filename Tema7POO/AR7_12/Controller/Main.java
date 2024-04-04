package AR7_12.Controller;

import AR7_12.Clases.Lista;
import AR7_12.Clases.Pila;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Pila p = new Pila();
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }
        p.mostrar();
        p.desapilar();
        p.desapilar();
        p.desapilar();
        p.mostrar();
    }
}
