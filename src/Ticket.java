

public class Ticket{

  public static void timer(){

  try {
    Thread.sleep(2500);
  } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
  }

}
  public static void main(String[] args) {

    Estacionamiento l1 = new Estacionamiento();
    Cajon l2 = new Cajon();

    System.out.println("        RESUMEN DEL DÍA " + "\n");
    timer();

    Motocicleta m3 = new Motocicleta("Yamaha","Maisto", 2020,Vehiculo.Color.valueOf("GRIS"),"COR563",Vehiculo.Tipo.valueOf("CLASICO"));
    m3.impMoto();
    //l2.registrarEntrada();
    int aux = l1.parkingDisponibles();
    System.out.println(aux);
    l1.guardarCarro(m3,true);
    System.out.println(aux);
    l1.pago(m3,2);
    System.out.println(aux);
    timer();
    System.out.println("++++++++++++++++++++++++++++++");
    Coche c1 = new Coche("Volkswagen","Golf", 2016,Vehiculo.Color.valueOf("NEGRO"),"AEF142",Vehiculo.Tipo.valueOf("HIBRIDO"));
    c1.impCoche();
    System.out.println();
    //System.out.println(aux);
    l1.guardarCarro(c1,true);
    //System.out.println(aux);
    l1.pago(c1,4);
    //System.out.println(aux);
    timer();
    System.out.println("++++++++++++++++++++++++++++++");

    Coche c2 = new Coche("GM","Chevrolet", 2019,Vehiculo.Color.valueOf("AZUL"),"GJI458",Vehiculo.Tipo.valueOf("CLASICO"));
    c2.impCoche();
    System.out.println();
    //System.out.println(aux);
    l1.guardarCarro(c2,false);
    //System.out.println(aux);
    l1.pago(c2,1);
    //System.out.println(aux);
    timer();
    System.out.println("++++++++++++++++++++++++++++++");

    Motocicleta m2 = new Motocicleta("Harley Davison","Sportster", 2015,Vehiculo.Color.valueOf("NEGRO"),"QMO367",Vehiculo.Tipo.valueOf("CLASICO"));
    m2.impMoto();
    System.out.println();
    l1.guardarCarro(m2,true);
    //System.out.println(aux);
    l1.pago(m2,5);
    //System.out.println(aux);
    timer();
    System.out.println("++++++++++++++++++++++++++++++");

    Motocicleta m1 = new Motocicleta("Ducati","Monster", 2010,Vehiculo.Color.valueOf("ROJO"),"DFE878",Vehiculo.Tipo.valueOf("CLASICO"));
    m1.impMoto();
    System.out.println();
    l1.guardarCarro(m1,true);
    //System.out.println(aux);
    l1.pago(m1,3);
    //System.out.println(aux);
    timer();
    System.out.println("++++++++++++++++++++++++++++++");
    
    Coche c3 = new Coche("Ford","Mazda", 2020,Vehiculo.Color.valueOf("BLANCO"),"OGK785",Vehiculo.Tipo.valueOf("ELECTRICO"));
    c3.impCoche();
    System.out.println();
    l1.guardarCarro(c3,true);
    //System.out.println(aux);
    l1.pago(c3,0);
    //System.out.println(aux);
    timer();
    System.out.println("++++++++++++++++++++++++++++++");

    Coche c4 = new Coche("Toyota","Subaru", 2016,Vehiculo.Color.valueOf("GRIS"),"VJR835",Vehiculo.Tipo.valueOf("CLASICO"));
    c4.impCoche();
    System.out.println();
    l1.guardarCarro(c4,true);
    //System.out.println(aux);
    l1.pago(c4,1);
    //System.out.println(aux);
    timer();
    System.out.println("++++++++++++++++++++++++++++++");


  }

}
