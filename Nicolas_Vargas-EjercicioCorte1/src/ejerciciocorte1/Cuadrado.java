/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocorte1;

/**
 *
 * @author ESTUDIANTE
 */
public class Cuadrado {
    private int ladoCuad = 0;

    public Cuadrado(int ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    public int getLadoCuad() {
        return ladoCuad;
    }

    public void setLadoCuad(int ladoCuad) {
        this.ladoCuad = ladoCuad;
    }
    
    public int CalcularArea(){
        return ladoCuad * ladoCuad;
    }
    public int CalcularPerimetro(){
        return 4 * ladoCuad;
    }
}
