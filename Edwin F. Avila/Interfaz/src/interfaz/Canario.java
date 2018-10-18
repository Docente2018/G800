/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author ESTUDIANTE
 */
public class Canario implements Cantante2{
    private int peso;
    public int tamaño;
    public String color;
    
    public void cantar(){
        System.err.println("pio, pio");
    }
    public void reir (){
        System.err.println("jajaja");
    }
    public void comer(){
        System.out.println("estoy comiendo granos");
    }
    
}
