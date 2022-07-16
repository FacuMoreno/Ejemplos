
package Procesos;


public class ClasePrincipal {
    public static void main(String[] args) {
        
        Procesos hilo1 = new Procesos(" Hilo1 ");
        Procesos hilo2 = new Procesos(" Hilo2 ");
        Procesos hilo3 = new Procesos(" Hilo3 ");
        
        hilo1.ValorDeLaCondicion(5);
        hilo2.ValorDeLaCondicion(10);
        hilo3.ValorDeLaCondicion(5);
        
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        
        
    }
    
}
