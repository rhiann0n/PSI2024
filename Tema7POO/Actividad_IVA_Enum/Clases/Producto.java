package Actividad_IVA_Enum.Clases;

public class Producto {
    private String nombre;
    private double  precioBase;
    TipoIVA iva;

    //CONSTRUCTOR VACÍO
    public Producto() {
    }

    //CONSTRUCTOR CON TODOS LOS ATRIBUTOS
    public Producto(String nombre, double precioBase, TipoIVA iva) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.iva = iva;
    }

    //MÉTODOS GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public TipoIVA getIva() {
        return iva;
    }

    public void setIva(TipoIVA iva) {
        this.iva = iva;
    }

    //MÉTODO PARA CALCULAR EL IVA
    public double calcularIVA(double base, double porcentaje) {
        double totalMasIva = (base*(porcentaje/100))+base;
        return totalMasIva;
    }

    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioBase=" + precioBase +
                ", iva=" + iva +
                '}';
    }
}
