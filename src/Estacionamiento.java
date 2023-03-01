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
    for (int i=0 ;i<parking.length;i++) {
      if (parking[i]==null){
        cont++;
      }
    }
    return cont;
  }

  //Metodo bucar vehiculo.
  public int buscar(Vehiculo c){
    int i=0;
    for(i = 0;i<parking.length;i++){
      Vehiculo aux = parking[i].getVehiculo();
      if(aux.equals(c)){
        return i;
      }else{
        return i=-1;
      }
    }
    return i;
  }

  //Metodo en el que el usuario puede pagar o adquirir una pension mensual.
  public int membresia(Vehiculo c){
    int precioAPagar = 750;
    c.setPension(true);
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
        if(parking[posicionVehiculo].getVehiculo().getPension() != true){
          if(hora>2){
            precioAPagar+=(((hora-2)*60)/15)*15;
            librarEspacio(posicionVehiculo);
            System.out.println("Pagar: "+ precioAPagar);
            System.out.println("Gracias Por Su Preferencia!");
            parking[posicionVehiculo].registrarSalida(hora);
            parking[posicionVehiculo].registrarSalidaMinuto();
            int hS = parking[posicionVehiculo].getHoraSalida();
            int mS = parking[posicionVehiculo].getMinutoSalida();
            System.out.println("Hora de Salida:" + hS +":"+mS);
            System.out.println("Lugar Libre!");
          }else{
            System.out.println("Pagar: "+ precioAPagar);
            System.out.println("Gracias Por Su Preferencia!");
            parking[posicionVehiculo].registrarSalida(hora);
            parking[posicionVehiculo].registrarSalidaMinuto();
            int hS = parking[posicionVehiculo].getHoraSalida();
            int mS = parking[posicionVehiculo].getMinutoSalida();
            System.out.println("Hora de Salida:" + hS +":"+mS);
            System.out.println("Lugar Libre!");
            return precioAPagar;
          }
        } else if(parking[posicionVehiculo].getVehiculo().getPension() == true) {
          precioAPagar = 0;
          librarEspacio(posicionVehiculo);
          System.out.println("No pagas.");
        }
      }else{
        precioAPagar = 350;
        System.out.println("Tendra que pagar $350 por perdida de boleto.");
      }
    }else if(posicionVehiculo==-1){
      System.out.println("Su automovil no se encuentra en nuestro estacionamiento!");
    }
    return precioAPagar;
  }

  public void librarEspacio(int posicion){
    parking[posicion]=null;
  }

  //Metodo que agregara un carro al arreglo (Parking).
  public void guardarCarro(Vehiculo c,boolean b){
    Vehiculo aux = c;
    if(lugaresDisponibles<0){
      System.out.println("Estacionamiento lleno!");
    }else{
      for (int i =0;i<parking.length;i++) {
        if (parking[i] == null) {
          int check = 0;
          Cajon newAux = new Cajon(true,aux,check,b);
          parking[i] = newAux;
          parking[i].registrarEntrada();
          parking[i].registrarEntradaMinuto();
          int hE = parking[i].getHoraEntrada();
          int mE = parking[i].getMinutoEntrada();
          System.out.println("Hora de entrada:" + hE +":"+mE);
          System.out.println("Se ha guardado con exito!");
          break;
        }
      }
    }
  }








}
