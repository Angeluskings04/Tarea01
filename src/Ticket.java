

public class Ticket{

  public static void timer(){

  try {
    Thread.sleep(5000);
  } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
  }

}
  public static void main(String[] args) {

    /*Vehiculo c1 = new Vehiculo("CARRO", "Volkswagen","Golf", 2016, "NEGRO","AEF142");
    Vehiculo m1 = new Vehiculo("MOTOCICLETA", "Ducati","Monster", 2010, "ROJA","DFE878");*/

    Coche c1 = new Coche("Volkswagen","Golf", 2016,Vehiculo.Color.valueOf("NEGRO"),"AEF142", "HIBRIDO");
    c1.impCoche();





    Estacionamiento l1 = new Estacionamiento();
    l1.lugaresDisponibles();
    l1.guardarCarro();
  }

}
