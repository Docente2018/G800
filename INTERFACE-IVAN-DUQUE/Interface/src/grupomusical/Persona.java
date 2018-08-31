/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupomusical;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona implements Cantante{
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void cantar() {
        System.out.println("La laa la raa laaa!");
    }

    @Override
    public void bailar() {
       System.out.println("ZZZZZZ!");
    }
    
    
}
