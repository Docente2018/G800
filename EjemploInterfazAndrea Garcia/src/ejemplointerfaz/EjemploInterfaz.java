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
public class EjemploInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
///       // TODO code application logic here
       /* Jose jose =new Jose();
        jose.setnombre("hola soy jose");
        jose.SetEdad(25);
        System.out.println(jose.getNombre());
        System.out.println(" jose tiene " + jose.getEdad() + " años ");
        jose.hablar();
        jose.caminar();
        jose.Estornudar();
        
        
        Paola paola =new Paola();
        paola.setnombre(" hola soy paola ");
        paola.SetEdad(21);
        System.out.println(paola.getNombre());
        System.out.println(" paola tine " + paola.getEdad() + " años ");
        paola.hablar();
        paola.caminar();
        paola.Estornudar();
        paola.Decirporque();*/
       
        /// implementacion con polimorfismo
        Hospital hospital = new Hospital();
        Jose jose = new Jose();
        Paola paola= new Paola();
        hospital.mostrarEnfermo(jose);
        hospital.mostrarEstornudo(jose);
        
        hospital.mostrarEnfermo(paola);
        hospital.mostrarEstornudo(paola);
        
        
                
  
        
   
    }
    
}
