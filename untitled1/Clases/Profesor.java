package Clases;

import java.time.LocalDate;

public class Profesor extends Persona {

    static int idCont = 1;
    private int idProfesor;
    private String materia;
    private boolean tutor;
    private double sueldo;
    private LocalDate fechaAlta;
    private boolean personalFijo;
    private boolean equipoDirectivo;
    private String jornada;

    //Constructor vacío
    public Profesor() {
        super();
    }

    /**
     * Constructor con los atributos de Persona y Profesor
     * @param nombre
     * @param telefono
     * @param direccion
     * @param sexo
     * @param fechaNaciiento
     * @param nacionalidad
     * @param idProfesor
     * @param materia
     * @param tutor
     * @param sueldo
     * @param fechaAlta
     * @param personalFijo
     * @param equipoDirectivo
     * @param jornada
     */
    public Profesor(String nombre, String telefono, String direccion, String sexo, LocalDate fechaNaciiento, String nacionalidad, int idProfesor, String materia, boolean tutor, double sueldo, LocalDate fechaAlta, boolean personalFijo, boolean equipoDirectivo, String jornada) {
        super(nombre, telefono, direccion, sexo, fechaNaciiento, nacionalidad);
        this.idProfesor = asignarID();
        this.materia = materia;
        this.tutor = tutor;
        this.sueldo = sueldo;
        this.fechaAlta = fechaAlta;
        this.personalFijo = personalFijo;
        this.equipoDirectivo = equipoDirectivo;
        this.jornada = jornada;
    }

    //GETTERS
    public int getIdProfesor() {
        return idProfesor;
    }

    public String getMateria() {
        return materia;
    }

    public boolean isTutor() {
        return tutor;
    }

    public double getSueldo() {
        return sueldo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public boolean isPersonalFijo() {
        return personalFijo;
    }

    public boolean isEquipoDirectivo() {
        return equipoDirectivo;
    }

    public String getJornada() {
        return jornada;
    }

    //SETTERS
    public void setIdProfesor(int idProfesor) {
        this.idProfesor = asignarID();
    }

    public int asignarID() {
        return idCont++;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setTutor(boolean tutor) {
        this.tutor = tutor;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setPersonalFijo(boolean personalFijo) {
        this.personalFijo = personalFijo;
    }

    public void setEquipoDirectivo(boolean equipoDirectivo) {
        this.equipoDirectivo = equipoDirectivo;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo='" + sexo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nombre='" + nombre + '\'' +
                ", jornada='" + jornada + '\'' +
                ", equipoDirectivo=" + equipoDirectivo +
                ", personalFijo=" + personalFijo +
                ", fechaAlta=" + fechaAlta +
                ", sueldo=" + sueldo +
                ", tutor=" + tutor +
                ", materia='" + materia + '\'' +
                ", idProfesor=" + idProfesor +
                '}';
    }
}
