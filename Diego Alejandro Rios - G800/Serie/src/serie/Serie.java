/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static int numero1, numero2, numero3;
    public static int contador =1;
        
    public static void main(String[] args) {
        do {            
            try {
                String nu = JOptionPane.showInputDialog("Ingrese un número mayor a 1" );
                numero1 = Integer.parseInt(nu);
                if (numero1 <= 0) {
                    System.out.println("Número incorrecto");
                }
            } catch (NumberFormatException e) {
                System.out.println("Los valores ingresados no son validos");
            }
            contador++;
        } 
        while (numero1 < 1 && contador <=3);
        
        if (numero1 > 1) {           
        
        System.out.println("Los " + numero1 + " de la serie ");
        
        numero2 = 1;
        numero3 = 1;
        
        System.out.println("--->" + numero2);
        
        for (int i = 1; i < numero1; i++) {
        
            System.out.println("--->" + numero3);    
            
            numero3 = numero2 + numero3;
            numero2 = numero3 - numero2;
            
        }
        System.out.println("Finalizo");
        }else{
            System.out.println("Finalizo por intentos fallidos");
        }
    }
    
}
