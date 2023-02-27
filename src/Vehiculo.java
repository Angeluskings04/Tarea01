
public class Vehiculo{

  private String color;
  private String tipo;
  private String marca;
  private String modelo;
  private String placas;
  private int año;


  public Vehiculo(){

  }

  public Vehiculo(String tipo, String marca, String modelo, int año, String color, String placas){
    this.color = color;
    this.tipo = tipo;
    this.marca = marca;
    this.modelo = modelo;
    this.placas = placas;
    this.año = año;
  }

  public String toString(){
    return "Vehiculo:" + tipo + "\n" + "Marca:" + marca + "\n" + "Modelo:" + modelo + "\n" + "Año:" + año + "\n" + "Placas:" + placas;
  }





}
