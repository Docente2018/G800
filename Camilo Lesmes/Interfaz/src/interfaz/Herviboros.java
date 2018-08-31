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
public class Herviboros implements ReinoAnimalInterface {

    @Override
    public String alimentarse() {
        return "Frutas y Vegetales";
    }

    @Override
    public String dientes() {
       return "Diente en la parte posterior grandes para cortas";
    }
    
}
