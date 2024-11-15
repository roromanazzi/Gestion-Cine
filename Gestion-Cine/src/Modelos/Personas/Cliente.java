package Modelos.Personas;

import Interfaces.IVisualizable;
import Modelos.Cine.Entrada;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Persona implements IVisualizable {

     private ArrayList<Entrada> entradasCompradas;
     private ArrayList<TarjetaBanco> tarjetasRegistradas;
     private ArrayList<Direccion> direcciones;

     public Cliente(String nombre, String apellido, String dni, String email, LocalDate fechaNacimiento) {
          super(nombre, apellido, dni, email, fechaNacimiento);
     }

     public ArrayList<Entrada> getEntradasCompradas() {
          return entradasCompradas;
     }

     public ArrayList<TarjetaBanco> getTarjetasRegistradas() {
          return tarjetasRegistradas;
     }

     public ArrayList<Direccion> getDirecciones() {
          return direcciones;
     }

     public void agregarTarjeta(TarjetaBanco tarjetaBanco) {
          this.tarjetasRegistradas.add(tarjetaBanco);
     }

     public void agregarEntrada(Entrada entrada) {
          this.entradasCompradas.add(entrada);
     }

     public void agregarDireccion(Direccion direccion) {
          this.direcciones.add(direccion);
     }

     @Override
     public void verCartelera() {

     }

     @Override
     public void verReservas() {

     }

     @Override
     public void verFunciones() {

     }
}
