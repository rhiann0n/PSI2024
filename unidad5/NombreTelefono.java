package unidad5;

import java.util.Scanner;
/*Insertar 10 nombres y número de teléfonos y luego mostrarlos*/
public class NombreTelefono {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String [] nombre = new String [3];
        int [] telefono = new int [3];
        for (int i = 0; i < nombre.length; i++) {
            mostrarSinLn("Indique el Nombre nº " + (i+1));
            nombre [i] = sn.next(); sn.nextLine();
            mostrarSinLn("Indique el Teléfono nº " + (i+1));
            telefono [i] = sn.nextInt();
        }
        /*Mostrar los nombres y número insertados*/
        mostrarerr("------------------------");
        mostrar("Lista de teléfonos");
        mostrar("Nombre\tTeléfono");
        for (int i = 0; i < nombre.length; i++) {
            mostrar(nombre[i] + "\t" + telefono[i]);
        }
        mostrarSinLn("Indica el nombre para mostrar el número? -> ");
        String nombreBuscar = sn. next(); sn.nextLine();
        //envio el nombre, la funcion buscar nombre y recibo el indice donde esta ubicado
        //luego muestro el número del índice recibido
        int indiceNumero = buscarTexto(nombre, nombreBuscar);
        if (indiceNumero < nombre.length) {
            mostrar("*** ENCONTRADO ***");
            mostrar(nombre[indiceNumero] + "Teléfono: " + telefono[indiceNumero]);
        } else {
            mostrarerr("No se encuentra" + nombreBuscar + " en la tabla actual.");
        }
        mostrar("Quieres cambiar algún número telefónico? Dime de quién: ");
        nombreBuscar= sn.next(); sn.nextLine();
        indiceNumero=buscarTexto(nombre,nombreBuscar);
        if (indiceNumero < nombre.length) {
            mostrar("Indica el nuevo número de teléfono: ");
            telefono[indiceNumero] = sn.nextInt();
        }
    }

    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);
    }
    public static void mostrarerr(String texto) {System.err.println("\t" + texto);}
    public static int buscarTexto(String[] texto, String buscar) {
        int indice = 0;
        while (indice < texto.length && !texto[indice].equals(buscar)) {
            indice++;
        }
        return indice;
    }
}
