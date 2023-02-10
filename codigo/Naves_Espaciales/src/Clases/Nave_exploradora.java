
package Clases;

//hereda de la clase Nave_robotica
public class Nave_exploradora extends Nave_robotica{
    
    private int numeroHerramientas;

    
    //constructor
    public Nave_exploradora( String nombre, int velocidadMaxima, int capacidadCarga, String sistemaDePropulsion, String tipoNave, int numeroHerramientas) {
        super(nombre, velocidadMaxima, capacidadCarga, sistemaDePropulsion, tipoNave);
        this.numeroHerramientas = numeroHerramientas;
    }

  //metodo unico de la clase
  public void explorar(String planeta) {
    System.out.println("La nave exploradora " + nombre + " está explorando el planeta " + planeta + " con " + numeroHerramientas + " herramientas.");
  }

  //sobrescritura de los metodos heredados de la clase padre
  @Override
  public void despegar() {
    System.out.println("La nave exploradora " + nombre + " ha despegado.");
  }

  @Override
  public void aterrizar() {
    System.out.println("La nave exploradora " + nombre + " ha aterrizado.");
  }
}
    

