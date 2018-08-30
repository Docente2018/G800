/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Anderson Rodriguez
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Boing747 b = new Boing747();
        
        Avioneta av = new Avioneta();
        
        aterrizar( b );
        
        //aterrizar( av );
        
    }
    
    public static void aterrizar( Avion a ){
        a.volar();
        a.aterrizar();
    }
}
