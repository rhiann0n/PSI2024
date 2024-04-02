package AR7_9.Clases;

public class Bombilla {
    private boolean interruptor;
    static public boolean interruptorGeneral = true;

    //CONSTRUCTOR VACÍO
    public Bombilla() {
        this.interruptor = false;
    }

    //APAGAR/ENCENDER
    public void apagarEncender() {
        this.interruptor = !this.interruptor;
    }

    //Validamos si el Interruptor General está encendido y el interruptor de la bombilla
    public boolean estado() {
        //si interruptorG = true e interruptor = true
        return interruptorGeneral && interruptor; //el valor nuevo va a ser el contrario de lo que tenga
        //equivalente a -> return interruptorGeneral && interruptor
    }

    //Mostramos el estado
    public String mostrarEstado() {
        if (estado()) {
            return "ON";
        } else {
            return "OFF";
        }
        //equivalente a un ternario -> return estado()?"ON":"OFF";
    }
}
