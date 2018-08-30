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
public class LLanta implements Rueda {
    
    int tamano = 0;
    String material = "";
    
    @Override
    public void detener(){
        System.out.println("LLantas deteniendose!");
    }
}
