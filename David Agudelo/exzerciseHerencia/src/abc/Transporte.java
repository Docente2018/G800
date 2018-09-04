/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Transporte {
   
    public abstract void avanzar(String frase);
    
    
    public void girarIzquierda(){
        System.out.println("Gira a la Izquierda");
    }
    
    
    public void girarDerecha(){
        System.out.println("Gira a la Derecha");
    }
}
