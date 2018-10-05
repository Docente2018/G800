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
     * en este caso el número de fibonacci para la posición(párametro) dada, es la suma de los dos números anteriores, por lo que el método
     * se llama recursivamente así mismo ubicando los dos números anteriores consecutivos.
     * @param numeroMax: la posición del número que se trae.
     * @return 
     */
    public static int writeFibonacci(int numeroMax){
        if(numeroMax == 0 || numeroMax == 1){//si el numero que entra como parámetro es igual a uno o a cero debe retornar el número
            return numeroMax;
        }else{
            //si es diferente de cero o de uno debe llamar de nuevo el método (fibonacci-1) + (fibonacci-2)
            return writeFibonacci(numeroMax-1) + writeFibonacci(numeroMax-2);
        }
        
    }
    
}
