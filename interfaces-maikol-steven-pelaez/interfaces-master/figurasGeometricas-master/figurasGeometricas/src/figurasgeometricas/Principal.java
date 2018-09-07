/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import javax.swing.*;

/**
 *
 * @author ESTUDIANTE
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 0;
        do {

            //menu
            try {
                String texto = JOptionPane.showInputDialog(null,
                        "Areas y figuras geometricas \n"
                        + "=========================== \n"
                        + "1. triangulo \n"
                        + "2. cuadrado \n"
                        + "3. rectangulo \n"
                        + "4. circulo \n"
                        + "5. salir "
                );
                a = Integer.parseInt(texto);

                switch (a) {
                    case 1:
                        Figura triFigura = new Triangulo(4, 3, 4, 4, 6);
                        triFigura.setNombreFigura("Triangulo");

                        JOptionPane.showMessageDialog(null, ""
                                + "Figura: " + triFigura.getNombreFigura() + "\n"
                                + "Area : " + triFigura.calcularArea() + "\n"
                                + "Perimetro : " + triFigura.calcularPerimetro() + "\n");
                        break;
                    case 2:
                        Figura cuFigura = new Cuadrado(4);
                        cuFigura.setNombreFigura("Cuadrado");

                        JOptionPane.showMessageDialog(null, ""
                                + "Figura: " + cuFigura.getNombreFigura() + "\n"
                                + "Area : " + cuFigura.calcularArea() + "\n"
                                + "Perimetro : " + cuFigura.calcularPerimetro() + "\n");
                        break;
                    case 3:
                        Figura reFigura = new Rectangulo(4, 5);
                        reFigura.setNombreFigura("Rectangulo");

                        JOptionPane.showMessageDialog(null, ""
                                + "Figura: " + reFigura.getNombreFigura() + "\n"
                                + "Area : " + reFigura.calcularArea() + "\n"
                                + "Perimetro : " + reFigura.calcularPerimetro() + "\n");
                        break;
                    case 4:
                        Figura cFigura = new Circulo(6);
                        cFigura.setNombreFigura("Circulo");

                        JOptionPane.showMessageDialog(null, ""
                                + "Figura: " + cFigura.getNombreFigura() + "\n"
                                + "Area : " + cFigura.calcularArea() + "\n"
                                + "Perimetro : " + cFigura.calcularPerimetro() + "\n");
                        break;
                    default:

                        break;

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
            }

        } while (a != 5);
    }

}
