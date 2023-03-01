

public class Ticket1{

  public static void timer(){

  try {
    Thread.sleep(1000);
  } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
   }
  }

  public static void main(String[] args) {
    Estacionamiento l1 = new Estacionamiento();
    Cajon l2 = new Cajon();

    System.out.println("          RESUMEN DEL DIA  " + "\n");
    timer();
    System.out.println("     Entradas al estacionamiento" + "\n");
    Motocicleta m3 = new Motocicleta("Yamaha","Maisto", 2020,Vehiculo.Color.valueOf("GRIS"),"COR563",Vehiculo.Tipo.valueOf("CLASICO"));
    m3.impMoto();
    System.out.println("Lugares en el estacionamiento: " + l1.parkingDisponibles());
    l1.guardarCarro(m3,true);
    System.out.println("Lugares en el estacionamiento: " +l1.parkingDisponibles());
    timer();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

    Coche c1 = new Coche("Volkswagen","Golf", 2016,Vehiculo.Color.valueOf("NEGRO"),"AEF142",Vehiculo.Tipo.valueOf("HIBRIDO"));
    c1.impCoche();
    l1.guardarCarro(c1,true);
    System.out.println("Lugares en el estacionamiento: " +l1.parkingDisponibles());
    timer();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");


    System.out.println("Pagos de boletos" + "\n");
    l1.pago(m3,2);



  }







}
