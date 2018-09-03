/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subclases;

/**
 *
 * @author ESTUDIANTE
 */
public class Perro implements Animal{

    @Override
    public void rugir() {
        System.out.println("Guau Guau");
    }

    @Override
    public void saltar() {
        System.out.println("El perro está saltando.");
   
    }
    
}
