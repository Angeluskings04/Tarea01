

public class Estacionamiento{

  Cajon[] lugares = new Cajon[6];

  public void lugaresDisponibles(){
    int cont = 0;
    for (int i =0; i < lugares.length; i++) {
      if (lugares[i] != null) {
        cont++;
      System.out.println(cont);
    }else {
      System.out.println("");
    }
    }
  }

  public void guardarCarro(){
    boolean espacio = true;
    int cont = 0;
    for (int i = 0; i < lugares.length; i++) {
      if (lugares[i] == null) {
        cont++;
      }
    }

    if (cont != 0) {
      espacio = true;
    }else {
      espacio = false;
    }
    System.out.println(espacio);
  }








}
