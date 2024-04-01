package ExplicacionLOCALE;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

import static java.time.LocalDate.now;

public class Main {
    public static void main(String[] args) {
        //Insertar una fecha
        LocalDate fecha = LocalDate.of(2024, 5, 4);
        //Fecha actual
        LocalDate fechaHoy= now();
        //Agregar 4 días a la fecha de hoy
        LocalDate fechaMas4 = fechaHoy.plus(4, ChronoUnit.DAYS);
        System.out.println(fechaMas4);
        //Restarle 5 días a la fecha de hoy
        LocalDate fechaMenos5 = fechaHoy.minus(5, ChronoUnit.DAYS);
        System.out.println(fechaMenos5);

        /****** Otra forma de hacer la suma o resta de valores ******/
        //También se puede utilizar plusDays, plusMonths, plusYears.../ minusDays, minusMonths, minusYears...
        fechaMenos5 = fechaHoy.minusDays(5);
        System.out.println(fechaMenos5);

        //De una fecha podemos tomar un dato, por ejemplo, solo el día, el año o el mes
        System.out.println("El día de hoy es: " + fechaHoy.getDayOfWeek()); //Monday...
        System.out.println("El día de hoy es: " + fechaHoy.getDayOfMonth()); //nº del día del mes
        System.out.println("El día de hoy es: " + fechaHoy.getDayOfYear()); //nº del día del año

        //Para el mes y el año...
        LocalDate fechaNacimiento = LocalDate.of(1998,1,12);
        System.out.println("Irene tiene " + (LocalDate.now().getYear()-fechaNacimiento.getYear()));

        //Cómo saber si el año es bisiesto
        boolean bisiesto = fechaHoy.isLeapYear();
        System.out.println("¿Este año es bisiesto? -> " + bisiesto);

        //Comparar dos fechas -> boolean
        boolean despues = fechaNacimiento.isAfter(fechaHoy); //false
        System.out.println("¿La fecha de nacimiento de Irene es después de la de hoy? -> " + despues);
        boolean  antes = fechaNacimiento.isBefore(fechaHoy); //true
        System.out.println("¿La fecha de nacimiento de Irene es antes de la de hoy? -> " + antes);

        //Si necesitamos saber el período de tiempo que ha pasado entre dos fechas -> until
        //El resultado no es de tipo LocalDate sino de tipo Period
        Period periodoF = fechaHoy.until(fechaNacimiento);
        System.out.println("Tiempo que ha pasado desde que Irene nació -> " + periodoF.getDays() + " días");
        System.out.println("Tiempo que ha pasado desde que Irene nació -> " + periodoF.getMonths() + " meses");
        System.out.println("Tiempo que ha pasado desde que Irene nació -> " + periodoF.getYears() + " años");

        //Mostrar fecha en formato español
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("La fecha en formato Español es " + fechaNacimiento.format(formato));

        //Otra forma de dar formato
        DateTimeFormatter formato2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
        System.out.println(fechaHoy.format(formato2));
        DateTimeFormatter formato3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        System.out.println(fechaHoy.format(formato3));
        DateTimeFormatter formato4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault());
        System.out.println(fechaHoy.format(formato4));
        DateTimeFormatter formato5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.getDefault());
        System.out.println(fechaHoy.format(formato5));
        System.out.println(fechaHoy.format(formato5).toUpperCase());

        /**HORAS**/
        LocalTime horaA = LocalTime.now();
        System.out.println("La hora actual es -> " + horaA);
        int hora = horaA.getHour();
        int minutos = horaA.getMinute();
        int segundos = horaA.getSecond();
        //Los mismos métodos... ejemplo, sumarle 5 horas a la hora actual ** minus o plus
        LocalTime horaMas5 = horaA.plus(5, ChronoUnit.HOURS);
        System.out.println("Dentro de cinco horas serán las " + horaMas5);

        //Calcular el período de tiempo entre dos horas
        //Duration -> se utiliza para calcular la duración entre dos horas

        Duration duracion = Duration.between(LocalTime.of(23,50,25), horaA);
        System.out.println("Tiempo transcurrido entre las dos horas -> " + duracion);
        DateTimeFormatter formato6 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("La hora actual formateada ->" + horaA.format(formato6));



    }
}
