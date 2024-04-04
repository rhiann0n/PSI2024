package AR7_12.Clases;

public class Pila {
    private Lista lista;

    //Método constructor
    public Pila() {
        lista = new Lista(); // se crea el array solo en el momento de llamar al constructor
    }

    public void apilar (Integer elemento) { //método para apliar
        lista.insertarPrincipio(elemento);
    }

    public void desapilar () { //método para desapilar, elimina siempre el elemento con índice 0
        lista.eliminarNum(0);
    }

    public void mostrar() { //método que invoca el método mostrar de la clase Lista
        lista.mostrarElementos();
    }

}
