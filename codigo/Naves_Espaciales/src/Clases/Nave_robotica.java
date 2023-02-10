
package Clases;

//hereda de la clase abstrata Nave
public class Nave_robotica extends Nave{
  
  //abastecedora, investigadora, telescopica
  private String tipoNave;

  //constructor
  public Nave_robotica(String nombre, int velocidadMaxima, int capacidadCarga,String sistemaDePropulsion, String tipoNave) {
    super(nombre, velocidadMaxima, capacidadCarga, sistemaDePropulsion);
    this.tipoNave = tipoNave;
  }
  
  
  public void realizarTarea(String tarea) {
    System.out.println("La nave robótica " + nombre + " está realizando la tarea: " + tarea);
  }
  
  //sobrecarga de metodos
  public void realizarTarea(String tarea, String objetivo) {
    System.out.println("La nave robótica " + nombre + " está realizando la tarea: " + tarea + " en " + objetivo);
  }

  
  //sobrescritura de los metodos de la clase padre
  @Override
  public void despegar() {
    System.out.println("La nave robótica " + nombre + " de tipo " + tipoNave + " ha despegado.");
  }
  
   @Override
  public void aterrizar() {
    System.out.println("La nave robótica " + nombre + " de tipo " + tipoNave + " ha aterrizado Exitosamente.");
  }
  
  
}
    

