/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibunachi;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Fibunachi {

    /**
     * @param args the command line arguments
     */
    public static int contador = 1;
  public static int numero1, num, num2;
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
      
            //Creación del ciclo para validar 
            //que el numero a ingresar sea mayor a 1
            do {
                  try {
                //Solicitud de numero en panalla
                String numb = JOptionPane.showInputDialog("Ingrese un numero mayor a 1");
                //Conversion de variable String a int
                numero1 = Integer.parseInt(numb);
                //finalización del do while donde se establece la condicion
                 } catch (NumberFormatException e) {
            System.out.println("Usted no ingreso un numero valido");
            contador++;
        }
            } while (numero1 < 1 && contador <=3);
            
            //Se imprime los numero s de la serie
            System.out.println("Los " + numero1 + " de la serie son");
            //Se inicializan las variables
            num = 1;
            //Se inicializan las variables
            num2 = 1;
            //Se imprime el numero 1
            System.out.println(num2 + "---");
            //Creación del un for para recorrer
            //las veces que se solicito el numero
            for (int i = 1; i < numero1; i++) {
                System.out.println(num2 + " ---- ");
                num2 = num + num2;
                num = num2 - num;
            }
            System.out.println("La serie ha finalizado");
            
        System.out.println("La serie ha finalizado por intyentos fallidos");
    }

}
