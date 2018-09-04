/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import javax.swing.JOptionPane;
/**
 *
 * @author ESTUDIANTE
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            String nombre;
            float lado;
            float base;
            float altura;
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Menú\n1.Triángulo\n2.Cuadrado\n"
                + "3.rectángulo\n4.círculo\n5.Salir"));
            if(menu == 5){
                return ;
            }
            nombre = JOptionPane.showInputDialog(null, "Ingrese nombre figura");
            switch(menu){
                case 1:
                    base =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese base Triángulo"));
                    altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese altura Triángulo"));
                    lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese altura1 Triángulo"));
                    Triangulo triangulo = new Triangulo(nombre, base,  altura,  lado);
                    JOptionPane.showMessageDialog(null, triangulo.showData());
                    break;
                case 2:
                    lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado Cuadrado"));
                    Cuadrado cuadrado = new Cuadrado(nombre, lado);
                    JOptionPane.showMessageDialog(null, cuadrado.showData());
                    break;
                case 3:
                    base =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese base Triángulo"));
                    altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese altura Triángulo"));
                    Rectangulo rectangulo= new Rectangulo(nombre, base, altura);
                    JOptionPane.showMessageDialog(null, rectangulo.showData());
                    break;
                case 4:
                    float radio =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese radio circulo"));
                    Circulo circulo= new Circulo(nombre, radio);
                     JOptionPane.showMessageDialog(null, circulo.showData());
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no valida");
                    break;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }
    
}
