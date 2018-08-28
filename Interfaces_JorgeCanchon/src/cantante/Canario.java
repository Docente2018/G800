/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantante;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Canario implements Cantante {
    private int peso;
    @Override
    public void cantar(){
        JOptionPane.showMessageDialog(null,"Pio canario");
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
