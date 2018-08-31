/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Triangulo extends claseAbstracta {

 
    

    public void baseTriangulo() {

        String baseT = JOptionPane.showInputDialog("Ingrese la base", null);

        int baseI = Integer.parseInt(baseT);

        System.out.println(baseI);
        this.altura = baseI * altura;
        System.out.println("------->" + altura);

    }

    public void alturaTriangulo() {

        this.resultado = altura / 2;
        System.out.println("----->" + resultado);

    }

   
       
        
    }
    

