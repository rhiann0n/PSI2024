package AR7_10.Clases.Maquinaria;

public class Vagon {
    private int numID;
    private int cargaMax;
    private double cargaActual;
    private String  mercancia;

    public Vagon(int numID, int cargaMax, double cargaActual, String mercancia) {
        this.numID = numID;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }

    public Vagon() {
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "numID=" + numID +
                ", cargaMax=" + cargaMax +
                ", cargaActual=" + cargaActual +
                ", mercancia='" + mercancia + '\'' +
                '}';
    }
}
