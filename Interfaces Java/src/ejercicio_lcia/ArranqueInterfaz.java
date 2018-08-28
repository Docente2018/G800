/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_lcia;

/**
 *
 * @author ESTUDIANTE
 */
public class ArranqueInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Persona p = new Persona();
         hacerCantar(p);
         
         Canario c = new Canario();
            hacerCantar(c);

    }
   
    public static void hacerCantar(Cantante_ c) {
        c.cantar();
        
    }

            


  //  hacerCantar(c);

}
