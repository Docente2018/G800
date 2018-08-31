/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupomusical;

/**
 *
 * @author ESTUDIANTE
 */
public class GrupoMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Persona p = new Persona();

        System.out.println("Persona: ");
        hacerCantar(p);
    
    Canario c = new Canario();
    System.out.println("Canario: ");
    hacerCantar(c);    

    }
    
    public static void hacerCantar(Cantante c) {

        c.cantar();

}
    
}
