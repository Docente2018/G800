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
        int cantidadDiscos = 5;//numero de discos a ordenar
        ordenarTorres(cantidadDiscos, 'A', 'B', 'C');
    }
    /**
    *metodo recursivo que ordena las torres
    *@param int topN: disco superior
    *@param char origen: torre origen
    *@param char inter: torre intermedia
    *@param char to: torre destino
    **/
      public static void ordenarTorres(int topN, char origen, char inter, char to) {
        if (topN == 1){// si es el ultimo disco
            System.out.println("Disco 1 desde " + origen + " a " + to);
        }else {//si no es el ultimo ordenar disco y volver a llamarse
            ordenarTorres(topN - 1, origen, to, inter);
            System.out.println("Disco " + topN + " desde " + origen + " hacia " + to);
            // llamada recursiva
            ordenarTorres(topN - 1, inter, origen, to);
        }
    }
    
}
