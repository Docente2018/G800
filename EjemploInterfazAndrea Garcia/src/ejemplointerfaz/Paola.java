/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;

/**
 *
 * @author Administrador
 */
public class Paola extends Persona implements Enfermo,Feliz{
    
    public void caminar(){
        System.out.println("hola soy paola... y estoy caminado");
        
    }
      public void hablar(){
        System.out.println("hola soy paola... y estoy hablando");
        
    }

    @Override
    public void Estornudar() {
        System.out.println("achuuuu... soy paola");
    }
    public void Decirporque(){
        
     System.out.println("hola soy paola.... y SOY FELIZ POR ESTOY VIVO ..");    
    
    }
}
