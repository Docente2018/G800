/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class ArranqueInterfaz {
    public static void main(String[] args) {
        Persona p = new Persona();
        hacerCantar(p);
        String texto = "texto";
        //hacerCantar(texto); 
        
        Canario c = new Canario();
        hacerCantar(c);
    }
    
    public static void hacerCantar(Cantante c){
        c.cantar();
    }
    
                  
}
