package AR7_2.Clases;

public class CuentaCorriente {
    public String nombreCliente;
    public String dni;
    public double saldo;

    /**
     * Método constructor
     * @param nombreCliente
     * @param dni
     */

    public CuentaCorriente(String nombreCliente, String dni) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.saldo = 0;
    }

    public CuentaCorriente() {
    }

    /**
     * CONSTRUCTOR VACÍO
     * @param nombreCliente
     * @param dni
     * @param saldo
     */
    public CuentaCorriente(String nombreCliente, String dni, double saldo) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.saldo = saldo;
    }

    /**
     * Método para egresar dinero en la cuenta corriente. También validará si hay saldo suficiente.
     * @param importe
     * @return operacionPosible
     */
    public boolean egreso(double importe) {
        boolean operacionPosible;
        if (this.saldo >= importe){
            saldo -= importe;
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible);
    }

    /**
     * Método para ingresar dinero a la cuenta corriente y sumarlo al saldo.
     * @param ingreso
     */
    public void ingresar(double ingreso){
        this.saldo += ingreso;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del Cliente -> " + this.nombreCliente +
                "\n DNI -> " + this.dni +
                "\n Saldo actual -> " + this.saldo);
    }

}
