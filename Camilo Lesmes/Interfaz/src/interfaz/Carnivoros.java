/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author ESTUDIANTES
 */
public class Carnivoros  implements ReinoAnimalInterface{

    @Override
    public String alimentarse() {
       return "Carne"; //
    }

    @Override
    public String dientes() {
       return "Diente afilados y colmillo grandes";
    }
    
    public String metodoDummy() {
       return "afsafasf";
    }
  
}
