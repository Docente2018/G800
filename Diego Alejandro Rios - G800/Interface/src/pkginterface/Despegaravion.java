/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Despegaravion {
    
    public static void main (String [] args){
        
        Avion a = new Avion();
        
        String b = JOptionPane.showInputDialog("Ingrese el codigo de despegue: ");
        System.out.println("Código valido " + b);
        int c = Integer.parseInt(b);
        String g = JOptionPane.showInputDialog("Ingrese la ciudad de destino: ");
        String h = JOptionPane.showInputDialog("Ingrese el nombre del aeropuerto: ");
        a.Acelerar(c, b);
        a.Elevarse(c);
        System.out.println("Ciudad de destino es: " + g);
        a.descender(g, h);
    }
}


