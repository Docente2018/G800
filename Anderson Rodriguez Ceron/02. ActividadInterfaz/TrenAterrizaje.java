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
public class TrenAterrizaje implements Rueda {
    
    @Override
    public void detener(){
        System.out.println("Estoy frenando las ruedas!");
    }
    
    public void bajarTren(){
        System.out.println("Estoy bajando el tren de aterrizaje!");
    }
}
