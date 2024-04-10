package Controller;

import Clases.Alumno;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.setNombre("María Pérez");
        a1.setTelefono(""); // si no se lo pasamos por parámetro será null
        a1.setDireccion("Calle Tal, nº 3");
        a1.setNacionalidad("Española");
        //LocalDate f = LocalDate.of(2010, 05, 13);
        //a1.setFechaNacimiento(f)
        a1.setFechaNacimiento(LocalDate.of(2010, 5, 13));
        a1.setCurso("3º");
        a1.setAula("A13");
        a1.setComedor(true);
        a1.setNombreTutor("Manuel Pérez");
        a1.setTelefonoTutor("678978564");
        a1.setDireccionTutor("Calle Tal, nº 3");

        System.out.println(a1.toString());
        Alumno a2 = new Alumno();
        a2.setNombre("Amelia Ortiz");
        Alumno a3 = new Alumno();
        a3.setNombre("Nadia Morales");
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}
