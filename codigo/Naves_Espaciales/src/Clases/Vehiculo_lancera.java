
package Clases;


  //hereda de la clase abstracta Nave
  public class Vehiculo_lancera extends Nave {
  private int numeroMisilesPropulsores;
  private String tipoDeCarga;

  //constructor
  public Vehiculo_lancera(String nombre, int velocidadMaxima, int capacidadCarga, String sistemaDePropulsion, int numeroMisilesPropulsores, String tipoDeCarga) {
    super(nombre, velocidadMaxima, capacidadCarga,sistemaDePropulsion);
    this.numeroMisilesPropulsores = numeroMisilesPropulsores;
    this.tipoDeCarga = tipoDeCarga;
  }
  
  
  //sobrescritura de los metodos de la clase padre
  @Override
  public void despegar() {
    System.out.println("El vehículo lanzador " + nombre + " ha despegado con " + numeroMisilesPropulsores + " misiles a bordo " +" con una carga de " + tipoDeCarga);
  }
  
  @Override
  public void aterrizar() {
    System.out.println("El vehículo lanzador " + nombre + " ha aterrizado exitosamente con " + numeroMisilesPropulsores + " misiles a bordo " +" con una carga de " + tipoDeCarga);
  }
}
