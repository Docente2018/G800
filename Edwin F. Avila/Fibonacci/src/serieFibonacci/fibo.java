
package serieFibonacci;

public class fibo {
    
     // Secuencia de fibonacci recursiva.
  
     
    public static int fibonacci(int numeroMax){
        if(numeroMax == 0 || numeroMax == 1){
            return numeroMax;
        }else{
            return fibonacci(numeroMax-1) + fibonacci(numeroMax-2);
        }
        
    }
    
}
