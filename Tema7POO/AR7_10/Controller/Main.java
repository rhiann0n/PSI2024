package AR7_10.Controller;

import AR7_10.Clases.Maquinaria.Locomotora;
import AR7_10.Clases.Maquinaria.Tren;
import AR7_10.Clases.Maquinaria.Vagon;
import AR7_10.Clases.Personal.Especialidad;
import AR7_10.Clases.Personal.JefeEstacion;
import AR7_10.Clases.Personal.Maquinista;
import AR7_10.Clases.Personal.Mecanico;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*Creamos y mostramos al personal de la plantilla*/
        Mecanico m1 = new Mecanico("José", "625789412", Especialidad.MOTOR);
        JefeEstacion jE = new JefeEstacion("Manuel", "06252874N", LocalDateTime.now());
        Maquinista mq = new Maquinista("Pedro", 2500.00, "Junior", "06587921Z");
        System.out.println("***Nuestra plantilla***");
        System.out.println(m1);
        System.out.println(jE);
        System.out.println(mq);

        /*Creamos nuestras Maquinarias*/
        Locomotora lm = new Locomotora("888WQD", 15000, 2010, m1);
        Vagon vagon = new Vagon(15, 1500, 200, "SHEIN");
        Tren tren = new Tren(lm, mq);
        tren.enganchaVagon(1800, 500, "AMAZON");
        tren.engancharVagon(vagon);
        System.out.println("***La maquinaria***");
        System.out.println(lm);
        System.out.println(vagon);
        System.out.println(tren);

        //Coleciones: agrupar una serie de datos tipo ARRAY pero con más facilidades

        ArrayList<Mecanico> losMecanicos = new ArrayList<>();
        Mecanico m2 = new Mecanico("Luis", "7254496135", Especialidad.HIDRAULICA);
        losMecanicos.add(m1);
        losMecanicos.add(m2);
        System.out.println(losMecanicos);


    }
}
