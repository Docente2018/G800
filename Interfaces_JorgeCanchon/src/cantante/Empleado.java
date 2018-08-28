/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantante;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Empleado {
    private String trabajo;
    public Empleado(String trabajo){
        this.trabajo = trabajo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    public abstract void Trabajar();
}
