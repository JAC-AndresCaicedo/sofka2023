
package Clases;

//hereda de la clase nave
public class Nave_tripulada extends Nave {
    
  //atributos 
  private int numeroTripulantes;
  private String tarea;
  
  //constructor
  public Nave_tripulada(String nombre, int velocidadMaxima, int capacidadCarga,String sistemaDepropulsion, int numeroTripulantes, String tarea) {
    super(nombre, velocidadMaxima, capacidadCarga,sistemaDepropulsion);
    this.numeroTripulantes = numeroTripulantes;
    this.tarea = tarea;
  }
  
  //se realiza la sobrescritura del metodo de la clase padre naves
  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Número de tripulantes: " + numeroTripulantes);
  }

  
  //sobrescritura de los metodos de la clase padre
  @Override
  public void despegar() {
    System.out.println("La nave tripulada " + nombre + " ha despegado con " + numeroTripulantes + " tripulantes a bordo, con finalidad de " + tarea);
  }
  
   @Override
  public void aterrizar() {
    System.out.println("La nave tripulada " + nombre + " ha aterrizado con " + numeroTripulantes + " tripulantes a bordo, con finalidad de " + tarea);
  }
  
}
