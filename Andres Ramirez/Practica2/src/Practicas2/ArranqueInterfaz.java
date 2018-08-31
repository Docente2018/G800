
package Practicas2;


public class ArranqueInterfaz {
    
    public static void main( String[]args)
    {
        Persona p = new Persona();
        
        hacerCantar(p);
       
        
        Canario c= new Canario();
       
        c.setcolor("verde");
        c.setnombre("Margarot");
        c.volar();
         hacerCantar(c);
        
    }
    
   public static void hacerCantar(Cantante c)
   {
       c.cantar();
   }
    
}
