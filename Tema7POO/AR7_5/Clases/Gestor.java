package AR7_5.Clases;

public class Gestor {
    public String nombreGestor;
    private String telefono;
    double importeMax;

    /**
     * MÉTODO CONSTRUCTOR
     * @param nombreGestor
     * @param telefono
     * @param importeMax
     */
    public Gestor(String nombreGestor, String telefono, double importeMax) {
        this.nombreGestor = nombreGestor;
        this.telefono = telefono;
        this.importeMax = importeMax;
    }

    public Gestor(String nombreGestor, String telefono) {
        this.nombreGestor = nombreGestor;
        this.telefono = telefono;
        this.importeMax = 10000;
    }

    //CONSTRUCTOR VACIO
    public Gestor() {
    }

    public String getNombreGestor() {
        return nombreGestor;
    }

    public void setNombreGestor(String nombreGestor) {
        this.nombreGestor = nombreGestor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getImporteMax() {
        return importeMax;
    }

    public void setImporteMax(double importeMax) {
        this.importeMax = importeMax;
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombreGestor='" + nombreGestor + '\'' +
                ", telefono='" + telefono + '\'' +
                ", importeMax=" + importeMax +
                '}';
    }
}
