
package hanoi;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Hanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println(" Numero de discos: ");
        n = s.nextInt();
        Hanoi(n,1,2,3);  //1:Posicion de origen  2:Posicion auxiliar 3:Torre de destino destino
    }
    
    //Método
    public static void Hanoi(int m, int origen,  int auxiliar, int destino){
    if(m==1)
    System.out.println("Se mueve disco de" + origen + " a " + destino);
    else{
     Hanoi(m-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(m-1, auxiliar, origen, destino);
   }
 }
}
