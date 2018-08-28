/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayan Catellanos
 */
public class InterfaceMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona p = new Persona();
      p.nombre = "Juan";
        hacerCantar(p);
      Canario c = new Canario();      
        hacerCantar(c);
    }
    public static void hacerCantar(Cantante c){
    c.cantar();
    }
}
