/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

/**
 * @param args the command line arguments
 */
import javax.swing.JOptionPane;

public class Hanoi {

    public static void main(String args[]) {
        //Numero de discos
        int discos;
        
        //Se declara la variable numero que almacenara el numero de discos a utilizar
        String Discos;
        //Se solcita el numero de de discos
        Discos = JOptionPane.showInputDialog("Por favor Ingrese un Numero de Discos: ");
        //Conversión de numero String a entero
        discos = Integer.parseInt(Discos);
        
        //Se especifica las torres a utilizar con el numero de discos
        movi(discos, "Torre 1", "Torre 2", "Torre 3");

    }

    public static void movi(int discos, String columnaIni, String columnaAux, String columnaFin) {

        if (discos == 0) {
            return;
        } else;
        
        String salida;
        //Se especifican los movimientos a realizar
        movi(discos - 1, columnaIni, columnaFin, columnaAux);
        //Se le asigna valor a la variable que se creo anteriormente "Salida"
        salida = ("Mover Disco #" + discos + " de " + columnaIni + " a " + columnaFin);
        //Se imprimen los movimientos a realizar
        System.out.println("Torres de Hanoi:: "+salida +"\n");
        movi(discos - 1, columnaAux, columnaIni, columnaFin);
    }
}
