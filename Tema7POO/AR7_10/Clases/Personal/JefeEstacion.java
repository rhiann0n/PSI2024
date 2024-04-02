package AR7_10.Clases.Personal;

import java.time.LocalDateTime;

public class JefeEstacion {
    private String nombre;
    private String dni;
    LocalDateTime fechaNombramiento;

    /**
     * CONSTRUCTOR
     */
    public JefeEstacion(String nombre, String dni, LocalDateTime fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }

    //CONSTRUCTOR VACÍO
    public JefeEstacion() {
    }

    //MÉTODOS GETTER & SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDateTime getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(LocalDateTime fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    //MÉTODO toString
    @Override
    public String toString() {
        return "JefeEstacion{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNombramiento=" + fechaNombramiento +
                '}';
    }
}
