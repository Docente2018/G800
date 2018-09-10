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
            cuadrado.perimetro();
            System.out.println("Área del cuadrado de lado: "
                    + cuadrado.getareaCuadrado());
            System.out.println("Perimetro del cuadrado de lado: "
                    + cuadrado.getperimetroCuadrado());
        }
        if (numero == 2) {
            
             String circ = JOptionPane.showInputDialog(" Ingrese el radio del circulo ");
         int cir = Integer.parseInt(circ);
         
            Circulo circulo = new Circulo(cir);
            circulo.area();
            circulo.perimetro();
            System.out.println("Área del círculo es: "
                    + circulo.getAreaRadio());
            System.out.println("Perimetro del círculo es: "
                    + circulo.getperimetroradio());
        }
        if (numero == 3) {
            
             String bas = JOptionPane.showInputDialog(" Ingrese la altura del rectangulo ");
             String alt = JOptionPane.showInputDialog(" Ingrese la base del rectangulo ");
         int base = Integer.parseInt(bas);
         int altura = Integer.parseInt(alt);
         
         
            Rectangulo rectangulo = new Rectangulo(base, altura);
            rectangulo.area();
            rectangulo.perimetro();
            System.out.println("Área del rectángulo es: "
                    + rectangulo.getAreaRectangulo());
            System.out.println("Perimetro del rectangulo es: "
                    + rectangulo.getperimetroRectangulo());

        }
        if (numero == 4) {
            
             String bas1 = JOptionPane.showInputDialog(" Ingrese la base del triangulo ");
             String alt1 = JOptionPane.showInputDialog(" Ingrese la altura del triangulo ");
             String lado1 = JOptionPane.showInputDialog(" Ingrese el lado A del triangulo ");
             String lado2 = JOptionPane.showInputDialog(" Ingrese el lado b del triangulo ");
             String lado3 = JOptionPane.showInputDialog(" Ingrese el lado c del triangulo ");
         int base1 = Integer.parseInt(bas1);
         int altura1 = Integer.parseInt(alt1);
         int ladoa = Integer.parseInt(lado1);
         int ladob = Integer.parseInt(lado2);
         int ladoc = Integer.parseInt(lado3);
         
            Triangulo triangulo = new Triangulo(base1, altura1, ladoa, ladob, ladoc);
            triangulo.area();
            triangulo.perimetro();
            System.out.println("Área del triángulo es : "
                    + triangulo.getareaTriangulo());
            System.out.println("Perimetro del triángulo es : "
                    + triangulo.getperimetroTriangulo());
        }
        if (numero == 5) {
            JOptionPane.showMessageDialog(null, "La ejecución finalizo");
        }

    }

}

