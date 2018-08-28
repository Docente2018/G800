/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayan Catellanos
 */
public class Persona implements Cantante{
    
    public String nombre;
    public String apellido; 
    
    @Override
    public void cantar() {
        System.out.println("Esta persona esta cantando LA LALALALAL LAAAAA");
    }
}
