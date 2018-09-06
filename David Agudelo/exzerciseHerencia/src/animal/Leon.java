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
public class Leon extends Animal{
    
    public Leon(){
        super();
        System.out.println("Ha nacido un leon");
    }

    @Override
    public void rugir() {
        super.rugir(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("GRRRRRRRRRRRRRRRRRRRRRR");
    }
    
    
}
