

public class Vehiculo{

  public static enum Color{
    NEGRO, BLANCO, GRIS, ROJO, AZUL
  }
  public static enum Tipo {
    HIBRIDO, ELECTRICO, CLASICO;
  }
  Tipo tipo;
  Color color;
  String marca;
  String modelo;
  String placas;
  int año;
  boolean pension;
  int vigencia;

  public Vehiculo(){

  }

  public Vehiculo(String marca, String modelo, int año, Color color, String placas, Tipo tipo){
    this.marca = marca;
    this.modelo = modelo;
    this.placas = placas;
    this.año = año;
    this.color = color;
    this.tipo = tipo;
    pension = false;
    vigencia = 0;
  }

  public boolean getPension(){
    return  pension;
  }
  public void setPension(boolean p){
    pension=p;
  }

  public String getPlacas(){
    return placas;
  }

  public void ilustracion(){
    if(this instanceof Coche){
      System.out.println("El vehiculo es: Coche " );
      System.out.println("  ______");
      System.out.println(" /|_||_\\`.__");
      System.out.println("(   _    _ _\\");
      System.out.println("=`-(_)--(_)-' ");
    }else if (this instanceof Motocicleta) {
      System.out.println("El vehiculo es: Motocicleta");
      System.out.println("  ,");
      System.out.println(".-/c-.,:: ");
      System.out.println("(_)'==(_)");
    }
    System.out.println();

  }









}
