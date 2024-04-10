package Clases;

import java.time.LocalDate;

public class Alumno extends Persona {

    static int idCont;
    private int idAlumno = 1;
    private String curso;
    private String aula;
    private String nombreTutor;
    private String telefonoTutor;
    private String direccionTutor;
    private String emailTutor;
    private String alergias;
    private boolean comedor;
    private boolean beca;

    //Constructor vacío
    public Alumno() {
        super(); //siempre en la primera línea, si no da error
        this.idAlumno = asignarID();
    }

    /**
     * Constructor con los atributos de Persona y Alumno
     * @param nombre
     * @param telefono
     * @param direccion
     * @param sexo
     * @param fechaNaciiento
     * @param nacionalidad
     * @param idAlumno
     * @param curso
     * @param aula
     * @param nombreTutor
     * @param telefonoTutor
     * @param direccionTutor
     * @param emailTutor
     * @param alergias
     * @param comedor
     * @param beca
     */
    public Alumno(String nombre, String telefono, String direccion, String sexo, LocalDate fechaNaciiento, String nacionalidad, int idAlumno, String curso, String aula, String nombreTutor, String telefonoTutor, String direccionTutor, String emailTutor, String alergias, boolean comedor, boolean beca) {
        super(nombre, telefono, direccion, sexo, fechaNaciiento, nacionalidad);
        this.idAlumno = asignarID();
        this.curso = curso;
        this.aula = aula;
        this.nombreTutor = nombreTutor;
        this.telefonoTutor = telefonoTutor;
        this.direccionTutor = direccionTutor;
        this.emailTutor = emailTutor;
        this.alergias = alergias;
        this.comedor = comedor;
        this.beca = beca;
    }

    //GETTER

    public static int getIdCont() {
        return idCont;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public String getCurso() {
        return curso;
    }

    public String getAula() {
        return aula;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public String getTelefonoTutor() {
        return telefonoTutor;
    }

    public String getDireccionTutor() {
        return direccionTutor;
    }

    public String getEmailTutor() {
        return emailTutor;
    }

    public String getAlergias() {
        return alergias;
    }

    public boolean isComedor() {
        return comedor;
    }

    public boolean isBeca() {
        return beca;
    }

    //SETTERS

    public static void setIdCont(int idCont) {
        Alumno.idCont = idCont;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
    public int asignarID() {
        return idCont++;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public void setTelefonoTutor(String telefonoTutor) {
        this.telefonoTutor = telefonoTutor;
    }

    public void setDireccionTutor(String direccionTutor) {
        this.direccionTutor = direccionTutor;
    }

    public void setEmailTutor(String emailTutor) {
        this.emailTutor = emailTutor;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setComedor(boolean comedor) {
        this.comedor = comedor;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", curso='" + curso + '\'' +
                ", aula='" + aula + '\'' +
                ", nombreTutor='" + nombreTutor + '\'' +
                ", telefonoTutor='" + telefonoTutor + '\'' +
                ", direccionTutor='" + direccionTutor + '\'' +
                ", emailTutor='" + emailTutor + '\'' +
                ", alergias='" + alergias + '\'' +
                ", comedor=" + comedor +
                ", beca=" + beca +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo='" + sexo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
