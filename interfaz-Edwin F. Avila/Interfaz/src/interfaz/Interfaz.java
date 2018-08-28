
package interfaz;

/**
 *
 * @author ESTUDIANTE
 */
public class Interfaz {

    public static void main(String[] args) {
        Persona p = new Persona();
        hacerCantar(p);
        Canario a = new Canario();
        hacerCantar(a);
        
        
        
        // TODO code application logic here
    }
    public static void hacerCantar(Cantante2 c){
        c.cantar();
        c.reir();
        c.comer();
        
    
    }
    
}
