import java.time.LocalTime;

import javax.swing.text.View;

/**
 * Tarea 01
 * Clase Cajon.
 *
 * @author Medina Ruiz.
 * @author Castro Reyes Angel.
 * @version 1.0
 */

public class Estacionamiento{

  Cajon[] parking = new Cajon[8];
  int lugaresDisponibles = parkingDisponibles();

  //Metodo que nos dice y modifica los lugares disponibles que tiene el estacionamiento.
  public int parkingDisponibles(){
    int cont = 0;
    for (Cajon i : parking) {
      if (i == null) {
        cont++;
      }
    }
    return cont;
  }

  //Metodo bucar vehiculo.
  public int buscar(Vehiculo c){
    int i=0;
    for(i = 0;i<parking.length;i++){
      if(parking[i].equals(c)){
        return i;
      }else{
        return i=-1;
      }
    }
  }

  //Metodo en el que el usuario puede pagar o adquirir una pension mensual.
  public int membresia(Vehiculo c){
    int precioAPagar = 750;
    c.pension = true;
    return precioAPagar;
  }
  //Metodo que hace las cuentas y regersa el precio a pagar.
  public int pago(Vehiculo c,int extras){
    int precioAPagar=10;
    int aux;
    int hora = extras;//Hora que se le agregaran en la simulacion.
    int posicionVehiculo = buscar(c);
    if(posicionVehiculo!=-1){
      if(parking[posicionVehiculo].getBoleto()!=false){
        if(c.pension != true){
          if(hora>=2&&(hora*60)/15>0){
            precioAPagar+=((hora*60)/15)*15;
            parking[posicionVehiculo].librarEspacio();
            System.out.println("Gracias Por Su Preferencia!");
            System.out.println("Lugar Libre!");
          }
        }
      }else{
        System.out.println("Tendra que pagar $350 por perdida de boleto.");
      }
    }else{
      System.out.println("Su automovil no se encuentra en nuestro estacionamiento!");
    }
    return precioAPagar;
  }

  //Metodo que agregara un carro al arreglo (Parking).
  public void guardarCarro(Vehiculo c){
    if(lugaresDisponibles<0){
      System.out.println("Estacionamiento lleno!");
    }else{
      for (Cajon i : parking) {
        if (i == null) {
          i.asignar(c);
          i.setOcupado(true);
          i.boletoAsignado();
          i.registrarEntrada();
          break;
        }
      }
    }
  }








}
