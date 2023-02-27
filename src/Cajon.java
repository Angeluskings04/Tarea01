import java.time.LocalTime;

/**
 * Tarea 01
 * Clase Cajon.
 *
 * @author Medina Ruiz.
 * @author Castro Reyes Angel.
 * @version 1.0
 */

public class Cajon {
    /*
     * Atributos que posee el cajon de estacionamiento.
     */
    boolean ocupado; // Si esta ocupado o no.
    int horaEntrada; // Hora en la que entro.
    int horaSalida; // Hora en la que se esta saliendo
    LocalTime ltim;

    // Constructor por omision.
    public Cajon() {
        ocupado = false;
    }

    // Metodo que cambia el valor de horaEntrada usando el metodo de
    // java.time.LocalTime.
    public void registrarEntrada() {
        horaEntrada = ltim.getHour();

    }

    // Metodo que cambia el valor de horaSalida usando el metodo de
    // java.time.LocalTime.
    public void registrarSalida() {
        horaSalida = ltim.getHour();
    }
}
