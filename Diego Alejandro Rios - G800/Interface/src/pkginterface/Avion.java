/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author ESTUDIANTE
 */
public class Avion implements Interface {

    public Avion() {
    }

    

    @Override
    public String Acelerar(int ace, String velocidad) {
        
        if (ace == 3) {
            System.out.println("Ya es hora de salir");
            return ("Hora de usar la llave");
                    }
        else {
            System.out.println("Aun no es hora de despegar");
            return ("No usar la llave");
        }
        
    }

    @Override
    public String Elevarse(int volar) {
        if (volar == 3) {
            System.out.println("Estamos a 5000 pies de altura");
            return ("Volando");
                    }
        else {
            System.out.println("Aun no es hora de despegar");
            return ("No usar la llave");
    }
    }
    @Override
    public String descender(String des, String aterrizar) {
        
        if ("Bogota".equals(des) && "Dorado".equals(aterrizar)){
        System.out.println("Estamos proximos a aterrizar");
            return ("");
                    }
        else {
            System.out.println("Aun no es hora de aterrizar");
            return ("");
    }
    }
    
}
