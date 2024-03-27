package AR7_5.Clases;

/**
 * Modificadores de acceso
 */
public class CuentaCorriente {
    public String nombreCliente; //público para cualquier clase vecina o externa
    String dni; //solo visible para la clase del paquete
    private double saldo; //solo visible en su propia clase
    Gestor elGestorCta; //hacemos la referencia al objeto tipo Gestor
    static String nombreBanco = "Banco PSI";

    /**
     * Método constructor
     * @param nombreCliente
     * @param dni
     */

    public CuentaCorriente(String nombreCliente, String dni, Gestor gestor) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.saldo = 0;
        this.elGestorCta = gestor;
    }

    /**
     * CONSTRUCTOR VACÍO
     */
    public CuentaCorriente() {
    }

    /**
     * Constructor con todos los atributos de la clase
     * @param nombreCliente
     * @param dni
     * @param saldo
     */
    public CuentaCorriente(String nombreCliente, String dni, double saldo, Gestor gestor) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.saldo = saldo;
        this.elGestorCta = gestor;
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

    public void mostrarInfo() {
        //tenemos que validar que exista un gestor para mostrar la información del toString
        //de la clase Gestor
        if (elGestorCta == null) {
            System.out.println("Cuenta sin gestor asignado");
        } else {
            System.out.println(elGestorCta.toString());
            System.out.println("Nombre del Cliente -> " + this.nombreCliente +
                "\n DNI -> " + this.dni +
                "\n Saldo actual -> " + this.saldo +
                "\n Nombre del banco -> " + nombreBanco);
        }
    }

    public Gestor getElGestorCta() {
        return elGestorCta;
    }

    public void setElGestorCta(Gestor elGestorCta) {
        this.elGestorCta = elGestorCta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }

    /*Método que muestra los valores de una clase y se hace automáticamente
    * que es el método toString()*/

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", dni='" + dni + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
