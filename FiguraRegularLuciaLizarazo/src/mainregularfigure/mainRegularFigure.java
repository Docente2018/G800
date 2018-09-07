/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainregularfigure;

import javax.swing.JOptionPane;

/**
 * 
 * @author lucia
 */
public class mainRegularFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numberSides = 0;     
       String Nombre;
       int Base;
       int Altura;
       int area = 0; 
       int Lado1;
       int calculo;
        try {
             Nombre =(JOptionPane.showInputDialog("Ingrese el nombre de la figura: \n"));                     
       
            if (Nombre.equals("triangulo")) {
                
                      
 Base =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo: \n"));   
 
 Altura =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo: \n"));
 
 area =(Base*Altura)/2;
       
   JOptionPane.showMessageDialog(null, "El area de la figura es: "+ area + "\n"+"Numero de lados: " + numberSides);
                          
 
       
}if   (Nombre.equals("cuadrado")) {
                   
 Lado1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor del lado : \n")); 

 
 calculo =(Lado1*4);
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+ calculo + "\n"+"Numero de lados: " + numberSides);
                      
         }
        
        {


}if 
      (Nombre.equals("rectangualo")) {
                   
 Base =Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de la base : \n"));

 Altura =Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de un lado : \n"));  

 
 calculo =(Base*Altura);
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+ calculo + "");
                      
         }
        
        {
       
           
          
            
      
        }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Nombre de figura erroneo ");
        }
                       
    }
    
}
