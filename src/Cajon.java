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
    int minutoSalida;
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

    public Vehiculo getVehiculo(){
        return auto;
      }

    // Metodo que cambia el valor de horaEntrada usando el metodo de
    // java.time.LocalTime.
    public void registrarEntrada() {
        LocalTime ltim=LocalTime.now();
        horaEntrada = ltim.getHour();
    }

    public void registrarEntradaMinuto(){
        LocalTime ltim=LocalTime.now();
        minutoEntrada = ltim.getMinute();
    }

    public void registrarSalida(int horas) {
        int suma = horaEntrada+horas;
        if(suma>24){
            horaSalida = suma - 24;
        }else{
            horaSalida = horaEntrada+horas;
        }
    }

    public void registrarSalidaMinuto(){
        minutoSalida = minutoEntrada;
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

    public int getHoraSalida(){
        return horaSalida;
    }   
    
    public int getMinutoSalida(){
        return minutoSalida;
    }

    public int getMinutoEntrada(){
        return minutoEntrada;
    }

    public boolean getOcupado(){
        return ocupado;
    }

    public void setOcupado(boolean b){
        ocupado = b;
    }
}
