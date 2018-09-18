package fibonacci;

/**
 *
 * @author Anderson Rodriguez
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class Fibonacci {
    
    //Función recursiva para calcular fibonacci.
    public static int fibonacci( int last_number, int now_number, int max_number, int iteraciones ){        
                
        //Si el número calculado es mayor al defindo de entrada se termina la recursión.
        if( now_number >= max_number+1 ){            
            return last_number;        
        }
        //Usamos una variable auxiliar        
        int aux = now_number;
        
        //Sumamos al numero actual el número anterior.
        now_number += last_number;
        
        //Cuenta la iteración.
        iteraciones++;
        
        //Imprimimos los valores.
        System.out.println(iteraciones + ") => " + aux);                
        
        //Si el condicional del número máximo no se cumple se vuelve a llamar la función.
        return fibonacci(aux, now_number, max_number, iteraciones);        
    }
    
    public static void main(String[] args) {
        
        //Syso Entrada
        Scanner sc = new Scanner(System.in);
        int max_number = 0;      
        int counter = 3;
        int iteraciones = 0;
        //Recibimos el número máximo.
        do {
            try {
                System.out.println("Ingrese el número máximo de la serie: ");
                max_number = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Por favor ingrese el número máximo de la serie(Debe ser positivo!). ");
            }
            sc.nextLine(); // clears the buffer
            //Ejectuamos la serie...
            System.out.printf("----------------- Serie fibonacci hasta: %d -----------------\n", max_number);        
            //System.out.println(iteraciones + ") => 0");            
            //Iteramos la función.
            fibonacci(1, 0, max_number, iteraciones);
            counter--;
            System.out.printf("\n\n\n\nTe quedan %d intentos", counter);
        } while (max_number > 0 && counter > 0);
        System.out.println("Intentos completos...");
    }
}