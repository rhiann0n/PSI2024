package CALENDARIO_Irene.Clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calendario {
    private LocalDate fecha;
    private DateTimeFormatter formato;

    //CONSTRUCTOR VACÍO
    public Calendario() {
    }

    //CONSTRUCTOR CON LOS ATRIBUTOS
    //validamos al tiempo si se ha introducido la fecha correctamente
    public Calendario(int anyo, int mes, int dia) {
        if(validarFecha(anyo, mes, dia)) {
            this.fecha = LocalDate.of(anyo, mes, dia);
        } else {
            //este será el mensaje de error si se introducen un año, día o mes igual a 0
            System.err.print("Fecha no válida.");
        }
    }

    //MÉTODO PARA INCREMENTAR DÍA (con LocalDate)
    public void incrementarDia() {
        this.fecha = this.fecha.plusDays(1);
    }

    //MÉTODO PARA INCREMENTAR MES (con LocalDate)
    public void incrementarMes() {
        this.fecha = this.fecha.plusMonths(1);
    }

    //MÉTODO PARA INCREMENTAR AÑOS (con LocalDate)
    public void incrementarAnyo(int cantidad) {
        this.fecha = this.fecha.plusYears(cantidad);
    }

    //MÉTODO PARA DECREMENTAR DÍA
    public void decrementarDia() {
        this.fecha = this.fecha.minusDays(1); }

    //MÉTODO PARA DECREMENTAR MES
    public void decrementarMes() {
        this.fecha = this.fecha.minusMonths(1);
    }

    //MÉTODO PARA DECREMENTAR AÑO
    public void decrementarAnyo(int cantidad) {
        this.fecha = this.fecha.minusYears(cantidad);
    }

    //MÉTODO PARA MOSTRAR LA FECHA EN CONSOLA
    public void mostrar() {
        //cambiamos el formato de la fecha del inglés americano (mm/dd/aa) al español (dd/mm/aa)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Fecha: " + fecha.format(formato));
    }

    //MÉTODO PARA VALIDAR SI LA FECHA ORIGINAL (introducida primero) Y LA QUE SE PASA COMO PARÁMETRO SON
    // IGUALES O DISTINTAS
    public boolean iguales(Calendario otraFecha){
        return this.fecha.equals(otraFecha.fecha);
    }

    //MÉTODO PARA VALIDAR SI EL AÑO ES BISIESTO
    public boolean esBisiesto(int anyo) {
        return LocalDate.ofYearDay(anyo, 1).isLeapYear();
    }

    //MÉTODO PARA COMPROBAR Y VALIDAR QUE LA FECHA SE INTRODUJO DE FORMA CORRECTA
    private boolean validarFecha(int anyo, int mes, int dia) {
        //nos aseguramos de que año, día o mes 0 no será una fecha válida, por lo que nos mostrará un
        //mensaje de error, pero la ejecución del programa continuará sin fallos
        if (anyo < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && esBisiesto(anyo)) { //si el año es bisiesto e introducimos el mes 2 (febrero)
            return dia <= 29; // la introducción del día 29 será válida
        }
        return dia <= diasPorMes[mes - 1];
    }

    //GETTERS (fecha y formato)
    public LocalDate getFecha() {
        return fecha;
    }
    public DateTimeFormatter getFormato() {
        return formato;
    }

    //SETTERS (fecha y formato)
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setFormato(DateTimeFormatter formato) {
        this.formato = formato;
    }

    //MÉTODO toString
    @Override
    public String toString() {
        return "Calendario{" +
                "fecha=" + fecha +
                '}';
    }
}