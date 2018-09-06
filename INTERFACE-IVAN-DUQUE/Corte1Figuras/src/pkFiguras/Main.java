/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkFiguras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Diseñe un programa (en consola) que encuentre el área y perímetro de un
 * rectángulo o un círculo mostrando un menú para que seleccione, cuadrado o
 * circulo luego pida los datos necesarios para das solución y muestre en
 * pantalla el nombre de la figura su área en unidades cuadradas y su perímetro
 * en unidades simples, recuerde que no existen áreas o perímetros menores o
 * iguales a cero.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        String num0="",figura= "",paso="";
        int num=0,radio=0, altura=0, base=0, lado=0;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("\n:::::::::::::::::::::::::::::::::::::::::");
            System.out.println("( *** AREA Y PERIMETRO DE FIGURAS ***)\n");
            System.out.println("Digite el nombre de la figura, que desea calcular el area y perimetro: \n::::::::::");
            System.out.println("1.Triangulo");
            System.out.println("2.Cuadrado");
            System.out.println("3.Rectangulo");
            System.out.println("4.Circulo\n:::::::::::");
            figura = leer.nextLine();
     
                switch (figura) {
                    case "triangulo":
                    case "TRIANGULO":
                    case "Triangulo":    
                        // Triangulo
                        Triangulo tria = new Triangulo();
                        System.out.println("\nBIENVENIDO AL AREA Y PERIMETRO DEL TRIANGULO\n");
                        System.out.println("*Por favor ingrese el valor de la base:");
                        base = leer.nextInt();
                        System.out.println("*Por favor ingrese el valor de la altura:");
                        altura = leer.nextInt();
                        System.out.println("*Por favor ingrese el valor del lado:");
                        lado = leer.nextInt();

                        tria.setBase(base);
                        tria.setAltura(altura);
                        tria.setLado(lado);
                        tria.setNomFigura(figura);
                        tria.calcularArea();
                        tria.calcularPerim();
                        System.out.println("................................\n");

                        break;
                    case "cuadrado":
                    case "CUADRADO":
                    case "Cuadrado":
                        // Cuadrado
                        Cuadrado cuad = new Cuadrado();
                        System.out.println("\nBIENVENIDO AL AREA Y PERIMETRO DEL CUADRADO\n");
                        System.out.println("*Por favor ingrese el valor del lado:");
                        lado = leer.nextInt();
                        
                        cuad.setNomFigura(figura);                        
                        cuad.setLado(lado);
                        cuad.calcularArea();
                        cuad.calcularPerim();
                        System.out.println("...................................\n");
                        break;
                    case "rectangulo":
                    case "RECTANGULO":
                    case "Rectangulo":
                        // Rectangulo
                        Rectangulo rectan = new Rectangulo();
                        System.out.println("\nBIENVENIDO AL AREA Y PERIMETRO DEL RECTANGULO\n");
                        System.out.println("*Por favor ingrese el valor de la altura:");
                        altura = leer.nextInt();
                        System.out.println("");
                        System.out.println("*Por favor ingrese el valor de la base: ");
                        base = leer.nextInt();
                        
                        rectan.setNomFigura(figura);   
                        rectan.setBaseRect(base);
                        rectan.setAltura(altura);
                        rectan.calcularArea();
                        rectan.calcularPerim();
                        System.out.println("...................................\n");
                        break;
                    case "Circulo":
                    case "circulo":
                    case "CIRCULO":
                        // Circulo
                        Circulo circu = new Circulo();
                        System.out.println("\nBIENVENIDO AL AREA Y PERIMETRO DEL CIRCULO\n");                        
                        System.out.println("*Por favor ingrese el valor del radio: ");
                        radio=leer.nextInt();
                        
                        circu.setNomFigura(figura); 
                        circu.setRadioCirculo(radio);
                        circu.calcularArea();
                        circu.calcularPerim();
                        System.out.println("...................................\n");
                        break;
                  default:
                      System.out.println("!!Error opción fuera de rango!!\n");
                      // throw new AssertionError();
                }
            num = 0;
            System.out.println("*Para repetir Menú digite (1) de lo contrario cualquier tecla.");
            num = leer.nextInt();

        } while (num == 1);
    }

}
