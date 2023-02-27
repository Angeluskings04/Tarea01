

public class Motocicleta extends Vehiculo{

  public static enum TipoMotocicleta {
    ELECTRICO, CLASICO;
  }

  TipoMotocicleta tipoMotocicleta;

  public Motocicleta(String marca, String modelo, int año, Color color, String placas, String st){
    super();
    switch (st){
      case "ELECTRICO":
        tipoMotocicleta = TipoMotocicleta.ELECTRICO;
        break;
      case "CLASICO":
        tipoMotocicleta = TipoMotocicleta.CLASICO;
        break;
      default:
        tipoMotocicleta = TipoMotocicleta.CLASICO;
        break;
    }
  }

  public String impMoto(){

    return "Marca:" + marca + "\n" + "Modelo:" + modelo + "\n" + "Año:" + año + "\n" + "Placas:" + placas;
}

}
