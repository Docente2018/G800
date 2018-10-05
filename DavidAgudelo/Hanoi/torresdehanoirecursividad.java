/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresdehanoirecursividad;

/**
 *
 * @author ESTUDIANTE
 */
public class TorresDeHanoiRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadDiscos = 5;
        ordenarTorres(cantidadDiscos, 'A', 'B', 'C');
    }
    
      public static void ordenarTorres(int topN, char origen, char inter, char to) {
        if (topN == 1){
            System.out.println("Disco 1 desde " + origen + " a " + to);
        }else {
            ordenarTorres(topN - 1, origen, to, inter);
            System.out.println("Disco " + topN + " desde " + origen + " hacia " + to);
            // llamada recursiva
            ordenarTorres(topN - 1, inter, origen, to);
        }
    }
    
}
