/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

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
        
        String Valor = JOptionPane.showInputDialog("1 = Cuadrado \n"
                + "2 = Circulo \n"
                + "3 = Rectangulo \n"
                + "4 = Triangulo \n"
                + "5 = Fin \n"
                + "Seleccione una opción", null);
        int numero = Integer.parseInt(Valor);

        if (numero == 1) {
            //solicitar numeros para el cuadrado
            
         String cuad = JOptionPane.showInputDialog(" Ingrese el lado del cuadrado ");
         int cuadr = Integer.parseInt(cuad);
            //probar clases cálculo áreas figuras geométricas        
            Cuadrado cuadrado = new Cuadrado(cuadr);
            cuadrado.area();
            System.out.println("Área del cuadrado de lado: "
                    + cuadrado.getareaCuadrado());
        }
        if (numero == 2) {
            
             String circ = JOptionPane.showInputDialog(" Ingrese el area del ciculo - radio ");
         int cir = Integer.parseInt(circ);
         
            Circulo circulo = new Circulo(cir);
            circulo.area();
            System.out.println("Área del círculo de radio: "
                    + circulo.getAreaRadio());
        }
        if (numero == 3) {
            
             String bas = JOptionPane.showInputDialog(" Ingrese el lado del cuadrado ");
             String alt = JOptionPane.showInputDialog(" Ingrese el lado del cuadrado ");
         int base = Integer.parseInt(bas);
         int altura = Integer.parseInt(alt);
         
         
            Rectangulo rectangulo = new Rectangulo(base, altura);
            rectangulo.area();
            System.out.println("Área del rectángulo de base y altura: "
                    + rectangulo.getAreaRectangulo());
        }
        if (numero == 4) {
            
             String bas1 = JOptionPane.showInputDialog(" Ingrese la base del triangulo ");
             String alt1 = JOptionPane.showInputDialog(" Ingrese la base del triangulo");
         int base1 = Integer.parseInt(bas1);
         int altura1 = Integer.parseInt(alt1);
         
            Triangulo triangulo = new Triangulo(base1, altura1);
            triangulo.area();
            System.out.println("Área del triángulo de base  y altura : "
                    + triangulo.getareaTriangulo());
        }
        if (numero == 5) {
            JOptionPane.showMessageDialog(null, "La ejecución finalizo");
        }

    }

}

