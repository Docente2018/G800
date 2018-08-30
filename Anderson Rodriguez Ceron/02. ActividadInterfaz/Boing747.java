/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Anderson Rodriguez
 */
public class Boing747 implements Avion {
    
    TrenAterrizaje tren = new TrenAterrizaje();
    
    @Override
    public void volar(){
        System.out.println("Soy un Boing y Estoy volando");
    }
    
    @Override
    public void aterrizar(){
        tren.bajarTren();        
        System.out.println("Estoy aterrizando en la pista");
        tren.detener();
    }
}
