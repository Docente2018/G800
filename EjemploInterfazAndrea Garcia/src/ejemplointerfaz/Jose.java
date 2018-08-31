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
public class Jose extends Persona implements Enfermo,Feliz{
    
    public void hablar(){
        System.out.println("hola soy jose.... y estoy hablando..");      
    }
    
    public void caminar(){
        System.out.println("hola soy jose.... y estoy caminando..");      
    }

    @Override
    public void Estornudar() {
       System.out.println("achuuu.... soy jose");
    }

    @Override
   public void Decirporque(){
        
     System.out.println("hola soy jose.... y SOY FELIZ POR ESTOY VIVO ..");    
    
    }
   
}
