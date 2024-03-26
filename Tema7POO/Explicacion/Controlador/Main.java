package Explicacion.Controlador;
import Explicacion.Clases.Persona;
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona(); //Declaro que 'p' es un objeto de tipo Persona
        p.nombre = "Fran";
        p.edad = 32;
        p.peso = 65;
        p.estatura = 1.78;
        p.dni = "06521487G";

        mostrarPersona(p);

        Persona x = new Persona();
        x.nombre = "Isabel";
        x.edad = 35;
        x.peso = 65;
        x.estatura = 1.65;
        x.dni = "06852145B";
        mostrarPersona(x);
        x.cumplirAnio();
        p.crecer(-0.05);
        System.out.println(p.nombre + " ahora mide: " + p.estatura);

        x.saludar();
        Persona j = new Persona();
        System.out.println(j.nombre);
        System.out.println(j.edad);
        mostrarPersona(j);

        Persona h = new Persona("Enrique", (byte) 21, 1.83, 65, "06584562N",true);
        mostrarPersona(h);

    }


    public static void mostrarPersona(Persona per) {
        System.out.println("Nombre -> " + per.nombre
                + "\n Edad -> " + per.edad
                + "\n Peso -> " + per.peso
                + "\n Estatura -> " + per.estatura
                + "\n DNI -> " + per.dni
                + "\n ¿Extranjero? -> " + per.extranjero);
    }
}
