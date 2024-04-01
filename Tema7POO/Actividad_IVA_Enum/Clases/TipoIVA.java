package Actividad_IVA_Enum.Clases;

public enum TipoIVA {
    GENERAL(21), REDUCIDO(10), SUPERREDUCIDO(4), EXENTO(0);


    //CONSTRUCTOR
    private TipoIVA(int porcentaje){
        this.porcentaje = porcentaje;
    }
    int porcentaje;

    //MÉTODO GETTER
    public double getPorcentaje() {
        return this.porcentaje;
    }
}
