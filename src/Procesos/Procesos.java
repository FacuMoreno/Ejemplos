package Procesos;

public class Procesos extends Thread {
    
    int num_int;// declaro variable global, para recibir parametros de los hilos

    public Procesos(String NombreHilo) { // creamos el constructor para enviar el string con nombre de los hilos
        super(NombreHilo);
    }

    
    
    

    @Override

    public void run() {   // este es el metodo de los hilos
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i+this.getName());
        }
        System.out.println("");  // cada vez que termina el for mete salto linea
    }
    
    public void ValorDeLaCondicion (int valor){
     this.num_int=valor;
     
    }

   
}
