package Clases;

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected String telefono;
    protected String direccion;
    protected String sexo;
    protected LocalDate fechaNacimiento;
    protected String nacionalidad;

    //Constructor vacío
    public Persona() {
    }

    /**
     * Constructor con todos los atributos
     * @param nombre
     * @param telefono
     * @param direccion
     * @param sexo
     * @param fechaNaciiento
     * @param nacionalidad
     */
    public Persona(String nombre, String telefono, String direccion, String sexo, LocalDate fechaNaciiento, String nacionalidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNaciiento;
        this.nacionalidad = nacionalidad;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
