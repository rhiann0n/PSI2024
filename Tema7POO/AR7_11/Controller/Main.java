package AR7_11.Controller;

import AR7_11.Clases.Lista;

public class Main {
    public static void main(String[] args) {
        Lista numeros = new Lista();
        numeros.insertarPrincipio(50);
        numeros.insertarPrincipio(60);
        numeros.insertarFinal(100);
        numeros.mostrarElementos();
        Lista listado = new Lista();
        listado.insertarPrincipio(1);
        listado.insertarFinal(2);
        listado.insertarFinal(3);
        listado.insertarFinal(4);
        listado.insertarFinal(5);
        listado.insertarFinal(6);
        listado.insertarFinal(7);
        listado.insertarConIndice(6,10);
        listado.mostrarElementos();
        numeros.insertarLista(listado);
        numeros.mostrarElementos();
        numeros.eliminarNum(2);
        numeros.eliminarNum(1);
        numeros.buscarNum(5);
        numeros.buscarNum(100);

        //Explicacion wrappers

        Double num1 = 2.0;
        Character letra = 'a';
        String letra2 = "1";
        letra = Character.toUpperCase(letra);
        Integer num = Integer.parseInt(letra2);

        System.out.println(letra);


    }
}
