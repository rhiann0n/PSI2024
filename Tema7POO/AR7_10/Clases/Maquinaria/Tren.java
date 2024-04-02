package AR7_10.Clases.Maquinaria;

import AR7_10.Clases.Personal.Maquinista;

import java.util.Arrays;

public class Tren {
    Locomotora locomotora;
    Vagon[] vagones; //Array de vagones, no puede haber más de 5
    Maquinista maquinistaResp;

    private int numVagones;

    /**
     *
     */
    public Tren(Locomotora locomotora, Maquinista maquinistaResp) {
        this.locomotora = locomotora;
        this.maquinistaResp = maquinistaResp;
        //crear el array con un máximo de 5 vagones
        vagones = new Vagon[5];
        numVagones = 0; // se inicializa el número de vagones
    }

    /**
     *
     */
    public void enganchaVagon(int cargaMax, double cargaActual, String mercancia) {
        if (numVagones > 5 ) {
            System.err.println("No es posible enganchar más vagones");
        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia); //creamos el objeto vagón
            vagones[numVagones] = v; //lo asignamos
            numVagones++; //lo incrementamos
        }
    }

    /**
     *
     */
    public void engancharVagon(Vagon vagonListo) {
        if(numVagones > 5) {
            System.err.println("No es posible enganchar más vagones");
        } else {
            vagones[numVagones] = vagonListo;
            numVagones++;
        }
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", vagones=" + Arrays.toString(vagones) +
                ", maquinistaResp=" + maquinistaResp +
                ", numVagones=" + numVagones +
                '}';
    }
}
