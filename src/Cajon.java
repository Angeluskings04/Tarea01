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
    private boolean ocupado; // Si esta ocupado o no.
    private int horaEntrada; // Hora en la que entro.
    int minutoEntrada;
    int horaSalida; // Hora en la que se esta saliendo
    LocalTime ltim;
    int precio;
    private boolean boleto; // ATRIBUTO que dice si tiene el boleto o no.
    private Vehiculo auto;

    // Constructor por omision.
    public Cajon() {
        ocupado = false;
        auto = null;
    }

    public Cajon(boolean ocupado, Vehiculo nuevo, int entrada,boolean t){
      this.auto = nuevo;
      this.boleto = t;
      this.ocupado = ocupado;
      this.horaEntrada = entrada;
    }

    // Metodo que cambia el valor de horaEntrada usando el metodo de
    // java.time.LocalTime.
    public void registrarEntrada() {
        horaEntrada = ltim.getHour();

    }

    public Vehiculo getVehiculo(){
      return auto;
    }

    // Metodo que cambia el valor de horaSalida usando el metodo de
    // java.time.LocalTime.
    public void registrarSalida() {
        horaSalida = ltim.getHour();
    }

    public void asignar(Vehiculo c){
        auto = c;
    }

    public void boletoAsignado(){
        boleto = true;
    }

    public boolean getBoleto(){
        return boleto;
    }

    public int getHoraEntrada(){
        return horaEntrada;
    }

    public boolean getOcupado(){
        return ocupado;
    }

    public void setOcupado(boolean b){
        ocupado = b;
    }
}
