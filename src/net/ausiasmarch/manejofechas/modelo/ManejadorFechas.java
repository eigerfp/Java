package net.ausiasmarch.manejofechas.modelo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * ManejadorFechas.java
 *
 * @author Ariadna Igual
 */
public class ManejadorFechas {

    // Inicio --> DESGLOSE DE FECHA Y HORA a partir de una fecha y hora dadas por el usuario.
    /**
     *
     * @param LOCALE Constante para definir el idioma para el formateo de las
     * fechas.
     */
    private static final Locale LOCALE = new Locale("ES");

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @return Devuelve el dia de la semana en formato largo.
     */
    public static String getDiaSemana(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, LOCALE);
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @return Devuelve el dia de la semana en formato corto.
     */
    public static String getDiaSemanaCorto(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.SHORT, LOCALE);
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @return Devuelve el dia de la semana en formato largo.
     */
    public static String getDiaSemana(LocalDate ld) {
        return ld.getDayOfWeek().getDisplayName(TextStyle.FULL, LOCALE);
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @return Devuelve el dia de la semana en formato corto.
     */
    public static String getDiaSemanaCorto(LocalDate ld) {
        return ld.getDayOfWeek().getDisplayName(TextStyle.SHORT, LOCALE);
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @return Devuelve un int como día del mes .
     */
    public static int getDia(LocalDateTime ldt) {
        return ldt.getDayOfMonth();
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @return Devuelve un int como día del mes.
     */
    public static int getDia(LocalDate ld) {
        return ld.getDayOfMonth();
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @return Devuelve un String con el nombre del mes con formato largo.
     */
    public static String getMes(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.FULL, LOCALE);
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @return Devuelve un String con el nombre del mes con formato corto.
     */
    public static String getMesCorto(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.SHORT, LOCALE);
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @return Devuelve un String con el nombre del mes con formato largo.
     */
    public static String getMes(LocalDate ld) {
        return ld.getMonth().getDisplayName(TextStyle.FULL, LOCALE);
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @return Devuelve un String con el nombre del mes con formato corto.
     */
    public static String getMesCorto(LocalDate ld) {
        return ld.getMonth().getDisplayName(TextStyle.SHORT, LOCALE);
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @return Devuelve un int como número del año.
     */
    public static int getAnyo(LocalDateTime ldt) {
        return ldt.getYear();
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @return Devuelve un int como número del año.
     */
    public static int getAnyo(LocalDate ld) {
        return ld.getYear();
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @return devuelve un int con la hora.
     */
    public static int getHora(LocalDateTime ldt) {
        return ldt.getHour();
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora que introduce el usuario.)
     * @return Devuelve un int con los minutos.
     */
    public static int getMinuto(LocalDateTime ldt) {
        return ldt.getMinute();
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora que introduce el usuario.)
     * @return Devuelve un int con los segundos.
     */
    public static int getSegundo(LocalDateTime ldt) {
        return ldt.getSecond();
    }
    // DESGLOSE DE FECHA Y HORA <-- Fin

    // Inicio --> CALCULO DE FECHAS suma y resta de días, meses y años respecto a una fecha introducida por el usuario.
    /**
     *
     * @param ldt LocalDateTime (Fecha y hora que introduce el usuario.)
     * @param suma int (Cantidad que el usuario inserta para sumarle a la fecha
     * y hora anterior)
     * @param ddmmaa String (Refiere a qué parte de la fecha y hora queremos
     * incrementar, es decir, día, mes año, hora, minuto, segundo.)
     * @return LocalDateTime (Devuelve la fecha y hora incrementada.)
     */
    public static LocalDateTime sumaFecha(LocalDateTime ldt, int suma, String ddmmaa) {

        switch (ddmmaa) {
            case "Días":
                ldt = getSumaDias(ldt, suma);
                break;
            case "Meses":
                ldt = getSumaMeses(ldt, suma);
                break;
            case "Años":
                ldt = getSumaAnyos(ldt, suma);
                break;
        }
        return ldt;
    }

    /**
     *
     * @param ld
     * @param suma
     * @param ddmmaa
     * @return
     */
    public static LocalDate sumaFecha(LocalDate ld, int suma, String ddmmaa) {

        switch (ddmmaa) {
            case "Días":
                ld = getSumaDias(ld, suma);
                break;
            case "Meses":
                ld = getSumaMeses(ld, suma);
                break;
            case "Años":
                ld = getSumaAnyos(ld, suma);
                break;
        }
        return ld;
    }

    /**
     *
     * @param ldt
     * @param resta
     * @param ddmmaa
     * @return
     */
    public static LocalDateTime restaFecha(LocalDateTime ldt, int resta, String ddmmaa) {

        switch (ddmmaa) {
            case "Días":
                ldt = getRestaDias(ldt, resta);
                break;
            case "Meses":
                ldt = getRestaMeses(ldt, resta);
                break;
            case "Años":
                ldt = getRestaAnyos(ldt, resta);
                break;
        }
        return ldt;
    }

    /**
     *
     * @param ld
     * @param resta
     * @param ddmmaa
     * @return
     */
    public static LocalDate restaFecha(LocalDate ld, int resta, String ddmmaa) {

        switch (ddmmaa) {
            case "Días":
                ld = getRestaDias(ld, resta);
                break;
            case "Meses":
                ld = getRestaMeses(ld, resta);
                break;
            case "Años":
                ld = getRestaAnyos(ld, resta);
                break;
        }
        return ld;
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @param suma Número de días que se le suman a la fecha introducida.
     * @return
     */
    public static LocalDateTime getSumaDias(LocalDateTime ldt, int suma) {
        return ldt.plusDays(suma);
    }

    /**
     *
     * @param ld LocalDate(Fecha)
     * @param suma Número de días que se le suman a la fecha introducida.
     * @return
     */
    public static LocalDate getSumaDias(LocalDate ld, int suma) {
        return ld.plusDays(suma);
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @param suma Númreo de Meses que se le suman a la fecha introducida.
     * @return
     */
    public static LocalDateTime getSumaMeses(LocalDateTime ldt, int suma) {
        return ldt.plusMonths(suma);
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @param suma Númreo de Meses que se le suman a la fecha introducida.
     * @return
     */
    public static LocalDate getSumaMeses(LocalDate ld, int suma) {
        return ld.plusMonths(suma);
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @param suma Número de años que se le suman a la fecha introducida.
     * @return
     */
    public static LocalDateTime getSumaAnyos(LocalDateTime ldt, int suma) {
        return ldt.plusYears(suma);
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @param suma Número de años que se le suman a la fecha introducida.
     * @return
     */
    public static LocalDate getSumaAnyos(LocalDate ld, int suma) {
        return ld.plusYears(suma);
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @param resta Número de días que se le restan a la fecha introducida.
     * @return
     */
    public static LocalDateTime getRestaDias(LocalDateTime ldt, int resta) {
        return ldt.minusDays(resta);
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @param resta Número de días que se le restan a la fecha introducida.
     * @return
     */
    public static LocalDate getRestaDias(LocalDate ld, int resta) {
        return ld.minusDays(resta);
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @param resta Número de meses que se le restan a la fecha introducida.
     * @return
     */
    public static LocalDateTime getRestaMeses(LocalDateTime ldt, int resta) {
        return ldt.minusMonths(resta);
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @param resta Número de meses que se le restan a la fecha introducida.
     * @return
     */
    public static LocalDate getRestaMeses(LocalDate ld, int resta) {
        return ld.minusMonths(resta);
    }

    /**
     *
     * @param ldt LocalDateTime (Fecha y hora)
     * @param resta Número de años que se le restan a la fecha introducida.
     * @return
     */
    public static LocalDateTime getRestaAnyos(LocalDateTime ldt, int resta) {
        return ldt.minusYears(resta);
    }

    /**
     *
     * @param ld LocalDate (Fecha)
     * @param resta Número de años que se le restan a la fecha introducida.
     * @return
     */
    public static LocalDate getRestaAnyos(LocalDate ld, int resta) {
        return ld.minusYears(resta);
    }
    // CALCULO DE FECHAS <-- Fin

    // Inicio --> AHORA Muestra la fecha y la hora del momento preciso en que se presiona el botón "Ahora".
    public static String fechaAhora() {
        DateTimeFormatter zonaHoraria = DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
        return ZonedDateTime.now().format(zonaHoraria);
    }
    // AHORA <-- Fin
}
