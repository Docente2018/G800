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
public class Gato implements Animal{

    @Override
    public void rugir() {
        System.out.println("miauuu");
   
    }

    @Override
    public void saltar() {
        System.out.println("El gato está saltando.");
   
    }

}
