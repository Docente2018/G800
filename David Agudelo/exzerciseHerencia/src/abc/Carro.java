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
public class Carro extends Transporte{

    @Override
    public void avanzar(String frase) {
        System.out.println("avanzando desde carro: " + frase);
    }
    
    
}
