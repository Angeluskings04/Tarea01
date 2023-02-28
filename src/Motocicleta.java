
public class Motocicleta extends Vehiculo{


  public Motocicleta(String marca, String modelo, int año, Color color, String placas,  Tipo tipo){
    super(marca, modelo, año, color, placas, tipo);
  }

  public void impMoto(){
    super.ilustracion();
    System.out.println("Marca:" + marca + "\n" + "Modelo:" + modelo + "\n" + "Año:" + año + "\n" + "Placas:" + placas + "\n" + "Tipo de moto:" + tipo);
  }
}
