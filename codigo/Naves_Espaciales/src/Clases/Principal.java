

//hecho por: JORGE ANDRES CAICEDO ARIZA  9/02/2023
//PROYECTO SOFKA

//LOGIN: usuario y contraseña: sofka2023

package Clases;

import Frames.Ventana;


public class Principal {
    

    //metodo para llamar el frame de inicio, en este caso login, de esta manera
    //se inicia el programa.
    private void EjecutarPrograma(){
        Ventana M = new Ventana();
        M.setVisible(true);
        M.setResizable(false);
        M.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        
        //se crea un objeto y se llama la funcion.
        Principal objeto = new Principal();
        objeto.EjecutarPrograma();   
    }
}
