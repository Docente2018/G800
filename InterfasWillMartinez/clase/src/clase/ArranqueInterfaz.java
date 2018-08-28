/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author ESTUDIANTE
 */
public class ArranqueInterfaz {
    
   public static void main (String arg[]) {
   
       Persona p = new Persona();
       hacerCantar(p);
       Canario c =  new Canario ();
        hacerCantar(c);
       
   }

    private static void hacerCantar(Cantante c) {
      
        c.cantar();
        

    }
    
}
