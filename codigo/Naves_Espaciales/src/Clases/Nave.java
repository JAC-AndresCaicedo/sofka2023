
package Clases;

//clase padre abstracta
abstract class Nave {
    
    protected String nombre;
    protected int velocidadMaxima;
    protected int capacidadCarga;
    protected String sistemaDePropulsion;
    
  //constructor
  public Nave(String nombre, int velocidadMaxima, int capacidadCarga, String sistemaDePropulsion) {
    this.nombre = nombre;
    this.velocidadMaxima = velocidadMaxima;
    this.capacidadCarga = capacidadCarga;
    this.sistemaDePropulsion=sistemaDePropulsion;
  }

  //metodos abstractos
  public abstract void despegar();
  public abstract void aterrizar();
  
  //metodo creado para realizar sobrescritura en la clase hija nave_tripulada
   public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Velocidad máxima: " + velocidadMaxima);
    System.out.println("Capacidad de carga: " + capacidadCarga);
  }
  
  
}






    

