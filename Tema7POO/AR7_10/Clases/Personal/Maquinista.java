package AR7_10.Clases.Personal;

public class Maquinista {
    private String nombre;
    private double sueldo;
    private String rango;
    private String dni;

    //CONSTRUCTOR CON TODOS LOS ATRIBUTOS
    public Maquinista(String nombre, double sueldo, String rango, String dni) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.rango = rango;
        this.dni = dni;
    }

    //CONSTRUCTOR VACÍO
    public Maquinista() {
    }

    //MÉTODOS GETTER & SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //MÉTODO toString
    @Override
    public String toString() {
        return "Maquinista{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", rango='" + rango + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
