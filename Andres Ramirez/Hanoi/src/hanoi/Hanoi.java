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
        int nDiscos;
        //Se declara la variable numero que almacenara el numero
        //de discos a utilizar
        String Discos;
        //Se solcita el numero de de diiscos
        Discos = JOptionPane.showInputDialog("Por favor Ingrese un Numero de Discos: ");
        //Conversión de numero String a entero
        nDiscos = Integer.parseInt(Discos);
        
        //Se especifica las torres a utilizar con el numero de discos
        movimiento(nDiscos, "Torre 1", "Torre 2", "Torre 3");

    }

    public static void movimiento(int nDiscos, String columnaInicio, String columnaAuxiliar, String columnaFin) {

        if (nDiscos == 0) {
            return;
        } else;

        String salida;
        //Se especifican los movimientos a realizar
        movimiento(nDiscos - 1, columnaInicio, columnaFin, columnaAuxiliar);
        //Se le asigna valor a la variable que se creo anteriormente "Salida"
        salida = ("Mover Disco #" + nDiscos + " de " + columnaInicio + " a " + columnaFin);
        //Se imprimen los movimientos a realizar
        System.out.println("Torres de Hanoi:: "+salida +"\n");
    //    JOptionPane.showMessageDialog(null, salida+"\n");
      //  JOptionPane.showMessageDialog(null, salida, "Torres de Hanoi", JOptionPane.INFORMATION_MESSAGE);

        movimiento(nDiscos - 1, columnaAuxiliar, columnaInicio, columnaFin);
    }
}