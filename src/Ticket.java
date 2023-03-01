

public class Ticket{

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
    l1.guardarCarro(c1,false);
    System.out.println("Lugares en el estacionamiento: " +l1.parkingDisponibles());
    timer();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

    Coche c2 = new Coche("GM","Chevrolet", 2019,Vehiculo.Color.valueOf("AZUL"),"GJI458",Vehiculo.Tipo.valueOf("CLASICO"));
    c2.impCoche();
    l1.guardarCarro(c2,false);
    System.out.println("Lugares en el estacionamiento: " +l1.parkingDisponibles());
    timer();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");


    System.out.println("Pagos de boletos" + "\n");
    System.out.println("****** Ticket 1******");
    l1.pago(m3,2);

    System.out.println();

    System.out.println("****** Ticket 2******");
    l1.pago(c1,4);

    System.out.println();

    System.out.println("****** Ticket 3******");
    l1.membresia(c2);

    System.out.println();

    //l1.pago(c2,1);



  }







}
