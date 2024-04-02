package AR7_10.Clases.Maquinaria;

import AR7_10.Clases.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potencia;
    private int anyoFabricacion;
    Mecanico mecanicoAsignado; //Dentro de la clase locomotora,
    //se crea una instancia de la clase Mecánico

    /**
     * MÉTODO CONSTRUCTOR CON TODOS LOS ATRIBUTOS
     */
    public Locomotora(String matricula, int potencia, int anyoFabricacion, Mecanico mecanicoAsignado) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anyoFabricacion = anyoFabricacion;
        this.mecanicoAsignado = mecanicoAsignado;
    }

    /**
     * CONSTRUCTOR SOLO CON MATRÍCULA
     */
    public Locomotora(String matricula) {
        this.matricula = matricula;
    }

    /**
     * CONSTRUCTOR VACÍO
     */
    public Locomotora() {
    }

    /**
     * MÉTODO GETTER MATRÍCULA
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * MÉTODO SETTER MATRÍCULA
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * MÉTODO GETTER POTENCIA
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * MÉTODO SETTER POTENCIA
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * MÉTODO GETTER AÑO DE FABRICACIÓN
     */
    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    /**
     * MÉTODO SETTER AÑO DE FABRICACIÓN
     */
    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    /**
     * MÉTODO GETTER MECÁNICO ASIGNADO
     */
    public Mecanico getMecanicoAsignado() {
        return mecanicoAsignado;
    }

    /**
     * MÉTODO SETTER MECÁNICO ASIGNADO
     */
    public void setMecanicoAsignado(Mecanico mecanicoAsignado) {
        this.mecanicoAsignado = mecanicoAsignado;
    }

    /**
     * MÉTODO toString
     */
    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", anyoFabricacion=" + anyoFabricacion +
                ", mecanicoAsignado=" + mecanicoAsignado +
                '}';
    }
}
