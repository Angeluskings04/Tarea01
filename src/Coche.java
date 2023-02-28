
public class Coche extends Vehiculo{


  public Coche(String marca, String modelo, int año, Color color, String placas,  Tipo tipo){
    super(marca, modelo, año, color, placas, tipo);
  }

  public void impCoche(){
    super.ilustracion();
    System.out.println("Marca:" + marca + "\n" + "Modelo:" + modelo + "\n" + "Año:" + año + "\n" + "Placas:" + placas + "\n" + "Tipo de coche:" + tipo);
  }
}
