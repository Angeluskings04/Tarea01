
public class Coche extends Vehiculo{

  public static enum TipoCoche {
    HIBRIDO, ELECTRICO, CLASICO;
  }
   TipoCoche tipoCoche;


  public Coche(String marca, String modelo, int año, Color color, String placas,  String st){
    super();
    switch (st){
      case "HIBRIDO":
        tipoCoche = TipoCoche.HIBRIDO;
        break;
      case "ELECTRICO":
        tipoCoche = TipoCoche.ELECTRICO;
        break;
      case "CLASICO":
        tipoCoche = TipoCoche.CLASICO;
        break;
      default:
        tipoCoche = TipoCoche.CLASICO;
        break;
    }
  }

  public String impCoche(){
    if(pension == false){
    return "Marca:" + marca + "\n" + "Modelo:" + modelo + "\n" + "Año:" + año + "\n" + "Placas:" + placas;
  }else {return "Marca:" + marca + "\n" + "Modelo:" + modelo + "\n" + "Año:" + año + "\n" + "Placas:" + placas + "\n" + "Tipo de coche:" + tipoCoche;
    }
  }
}
