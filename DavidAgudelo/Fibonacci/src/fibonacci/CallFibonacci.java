/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author ESTUDIANTE
 */
public class CallFibonacci {
    /**
     * Escribe la secuencia de fibonacci recursivamente.
     * @param numeroMax
     * @return 
     */
    public static int writeFibonacci(int numeroMax){
        if(numeroMax == 0 || numeroMax == 1){
            return numeroMax;
        }else{
            return writeFibonacci(numeroMax-1) + writeFibonacci(numeroMax-2);
        }
        
    }
    
}
