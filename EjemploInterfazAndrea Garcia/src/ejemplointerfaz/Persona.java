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
public class Persona {
    
    
    private String nombre;
    private int edad;
    
    public void setnombre(String nombre){
    
        this.nombre =nombre;
           
    }
    public void SetEdad (int edad){
    
        this.edad =edad;
    
    }
    public String getNombre(){
       return this.nombre;
    
    }
    public int getEdad(){
    
        return this.edad;
    }
    
    public void hablar(){
    }
    public void caminar(){
    }
    


}
    

