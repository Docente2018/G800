/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author ESTUDIANTE
 */
public class Perro extends Animal{
    
    public Perro(){
        System.out.println("Ha nacido un Perro");
    }

    @Override
    public void rugir() {
        System.out.println(" HUAWFFF");
    }
    
    
}
