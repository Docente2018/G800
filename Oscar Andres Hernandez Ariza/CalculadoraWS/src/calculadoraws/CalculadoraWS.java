/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraws;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class CalculadoraWS {

    private static Scanner teclado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        teclado = new Scanner(System.in);
        int numA;
        int numB;

        System.out.println("Ingrese dos numeros");
        numA = leerNumero("Ingrese Numero A:");
        numB = leerNumero("Ingrese Numero B:");
        System.out.println("");
        System.out.println("\nLa suma de A y B es:\t" + add(numA, numB));
        System.out.println("\nLa resta de A y B es:\t" + subtract(numA, numB));
        System.out.println("\nLa multiplicacion de A y B es:\t" + multiply(numA, numB));
        System.out.println("\nLa divicion de A y B es:\t" + divide(numA, numB));

    }

    private static int leerNumero(String mensage) {
        teclado = new Scanner(System.in);
        do {
            try {
                System.out.print(mensage);
                return teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("No se reconoce el valor como entero");
            }

        } while (true);
    }

    private static int add(int intA, int intB) {
        org.tempuri.Calculator service = new org.tempuri.Calculator();
        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
        return port.add(intA, intB);
    }

    private static int divide(int intA, int intB) {
        org.tempuri.Calculator service = new org.tempuri.Calculator();
        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
        return port.divide(intA, intB);
    }

    private static int multiply(int intA, int intB) {
        org.tempuri.Calculator service = new org.tempuri.Calculator();
        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
        return port.multiply(intA, intB);
    }

    private static int subtract(int intA, int intB) {
        org.tempuri.Calculator service = new org.tempuri.Calculator();
        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
        return port.subtract(intA, intB);
    }

}
