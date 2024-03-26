package Explicacion.Clases;
/*Clase Persona, que se crea con sus atributos o características (variables)
* y sus métodos o comportamientos (funciones)*/
public class Persona {
    public String nombre;
    public byte edad = 0;
    public double estatura = 0;
    public double peso = 0;
    public String dni = null;
    public boolean extranjero;
    public static String hoy;
    //Método Constructor: crear una instancia de una clase mediante el paso de valores
    //Métodos constructores pueden ser sobrecargados? -> se pueden crear varios con el mismo
    //nombre y lo que los diferencia es el paso de valores o atributos

    public Persona(){
        //vacío
    }

    public Persona (String nombre) {
        this.nombre = nombre;
    }
    public Persona (String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(String nombre, byte edad, double estatura, double peso, String dni, boolean extranjero) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.dni = dni;
        this.extranjero = extranjero;
    }

    //Métodos o comportamientos

    public void cumplirAnio() {
        System.out.println("Feliz Cumpleaños " + nombre + ".");
        System.out.println("Tu edad ahora es: " + (edad + 1) + " años.");
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void crecer(double incremento) {
        estatura += incremento; //reemplazamos el dato inicial de estatura
    }
}

