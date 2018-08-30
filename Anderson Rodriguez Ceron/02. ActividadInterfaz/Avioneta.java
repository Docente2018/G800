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
public class Avioneta implements Avion{
    
    LLanta llantas = new LLanta();
    
    @Override
    public void volar(){
        System.out.println("Soy una avioneta y Estoy volando");
    }
    
    @Override
    public void aterrizar(){        
        System.out.println("Estoy aterrizando en la pista");
        llantas.detener();
    }
}
