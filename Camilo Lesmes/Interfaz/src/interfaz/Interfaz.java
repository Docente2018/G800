/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author ESTUDIANTES
 */
public class Interfaz {

    //metodo main principal
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Herviboros animalHerviboros = new Herviboros();
        Carnivoros animalCarnivoro = new Carnivoros();      
        
        ImprimirAlimento(animalHerviboros);
        ImprimirAlimento(animalCarnivoro);
        
        ImprimirDiente(animalHerviboros);
        ImprimirDiente(animalCarnivoro);
        System.out.println(ReinoAnimalInterface.ALGO);
    }
    
    public static void ImprimirAlimento(ReinoAnimalInterface llamadoAlimento) {
        // TODO code application logic here
        System.out.println(llamadoAlimento.alimentarse());
        
    }
    
    public static void ImprimirDiente(ReinoAnimalInterface llamadoDiente) {
        // TODO code application logic here
        System.out.println(llamadoDiente.dientes());
       
        
    }
}
