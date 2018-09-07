/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetro;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class EjecutaFigura4 {

    private static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean end = true;
        boolean noRepetir = true;

        do {
            System.out.println("AREAS Y PERIMETROS DE\n"
                    + "FIGURAS GEOMETRICAS");
            System.out.println("1.  TRIANGULO");
            System.out.println("2.  CUADRADO");
            System.out.println("3.  RECTANGULO");
            System.out.println("4.  CIRCULO");
            System.out.println("5.  FIN");
            System.out.print("ESCOGER OPCION: ");

            switch (teclado.next()) {
                case "1": {
                    Triangulo4 triangulo4 = new Triangulo4();
                    triangulo4.establecerNomFigura(leerString("Digite nombre del triangulo"));
                    triangulo4.establecerAlturaTria(leerNumeroFloat("Digire la altura del triangulo"));
                    triangulo4.establecerBaseTria(leerNumeroFloat("Digite la base del triangulo"));
                    triangulo4.establecerLadoA(leerNumeroFloat("Digote el lado A"));
                    triangulo4.establecerLadoB(leerNumeroFloat("Digote el lado B"));
                    triangulo4.establecerLadoC(leerNumeroFloat("Digote el lado C"));
                    imprimirFigura(triangulo4);

                    end = noRepetir;
                    break;
                }
                case "2": {
                    Cuadrado4 cuadrado4 = new Cuadrado4();
                    cuadrado4.establecerNomFigura(leerString("Digite Nombre del Cuadrado"));
                    cuadrado4.establecerLadoCuad(leerNumeroFloat("Digite el lado del cuadrado"));
                    imprimirFigura(cuadrado4);
                    end = noRepetir;
                    break;
                }
                case "3": {
                    Rectangulo4 rectangulo4 = new Rectangulo4();
                    rectangulo4.establecerNomFigura(leerString("Digire el nombre del triangulo"));
                    rectangulo4.establecerAlturaRecta(leerNumeroFloat("Digite la altuda del rectangulo"));
                    rectangulo4.establecerBaseRecta(leerNumeroFloat("Digite la base del rectangulo"));
                    imprimirFigura(rectangulo4);
                    end = noRepetir;
                    break;
                }
                case "4": {
                    Circulo4 circulo4 = new Circulo4();
                    circulo4.establecerNomFigura(leerString("Digire el nombre del circulo"));
                    circulo4.establecerRadioCirc(leerNumeroFloat("Digite el radio del circulo"));
                    imprimirFigura(circulo4);
                    end = noRepetir;
                    break;
                }
                case "5": {
                    end = noRepetir;
                    break;
                }
                default:
                    System.err.println("\nOpcion Incorrecta\n");
                    end = false;
            }
        } while (!end);
        System.out.println("Gracias por usar este programa.");

    }

    public static float leerNumeroFloat(String mensage) {
        do {
            try {
                System.out.print(mensage + ":\t");
                return teclado.nextFloat();
            } catch (NoSuchElementException e) {
                System.err.println("No se reconoce como un numero valido");
                teclado = new Scanner(System.in);
            }
        } while (true);
    }

    public static String leerString(String mensage) {
        do {
            try {
                System.out.print(mensage + ":\t");
                return teclado.next();
            } catch (NoSuchElementException e) {
                System.err.println("No se reconoce como valido");
                teclado = new Scanner(System.in);
            }
        } while (true);
    }

    public static void imprimirFigura(Figura4 figura4) {
        figura4.calcularArea();
        figura4.calcularPerim();
        System.out.println("\nEl nombre de la figura es:\t" + figura4.nomFigura);
        System.out.println("El area de la figura es:\t" + figura4.area);
        System.out.println("El perimetro de la figura es:\t" + figura4.perim);
    }
}
