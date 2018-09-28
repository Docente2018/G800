/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehanoi;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class TorreHanoi {

    static int movimientos = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado;
        int fichas;
        boolean salir = true;
        do {
            teclado = new Scanner(System.in);

            System.out.print("Numero de discos o Cero(0) para salir: ");
            try {
                String input = teclado.next();
                if (!input.equalsIgnoreCase("0")) {//comprueva si se desea salir
                    fichas = Integer.parseInt(input);
                    if (fichas > 0) {//comprueva si el valor igresado se puede operar(es pocitivo)
                        moverFicha("A", "B", "C", fichas);//comieza a mover las fichas
                        System.out.println("El juego se completo en " + movimientos + " Movimientos");
                        salir = true;//configura salir del proceso
                    } else {
                        System.err.println("Solo se puede ingresar numeros Enteros mayores que CERO");
                        salir = false;//configura no salir del proceso
                    }
                } else {
                    salir = true;//configura salir del proceso
                }
            } catch ( java.lang.NumberFormatException e) {//controla exepciones cuando se insertan letras 
                System.err.println("Solo se puede ingresar numeros Enteros mayores que CERO");
                salir = false;//configura no salir del proceso
            }
        } while (!salir);

    }
/**/
    public static void moverFicha(String origen, String auxiliar, String destino, int disco) {
        if (disco == 1) {
            movimientos++;
            System.out.println("mover disco #" + disco + " de " + origen + " a " + destino);
        } else {
            movimientos++;
            moverFicha(origen, destino, auxiliar, (disco - 1));//se musca mover la ficha que no es la mas pequeña al centro
            System.out.println("mover disco #" + disco + " de " + origen + " a " + destino);
            moverFicha(auxiliar, origen, destino, (disco - 1));//final muente se mueve desde el auxiliar al destino
        }
    }
}
