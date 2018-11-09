/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orden;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Orden {

   public static void main(String[] args){
       //Se crea un Scanner
    Scanner teclado = new Scanner(System.in);
    //Se inicializa un tamaño del arreglo
    int Arreglo[]=new int [20];
    //Se cean las variables a utilizar mas adelante
        int numero,i,j,k,incremento,aux;
        //Se solicita el tamaño del arreglo
        System.out.print("Ingrese dimension del arreglo: ");
        //Se guarda el tamaño del arreglo que se va a ingresar a contnuacion
        numero=teclado.nextInt();
        //Se crea un for para solicitar n dimenciones que se ingresaron
        for(i=1;i<=numero;i++){
            //Se imprime el numero ingresado
            System.out.print("A["+"]= ");
            //Se almacena lo que esta en i y lo agreaga al teclado"Imprime"
            Arreglo[i]=teclado.nextInt();
        }
      
      
        incremento=numero/2;
        //Se almacena en la variable incremento lo que viene 
        //en numero despues de dividirlo por dos
 
        //Se realiza una validación de si el numero es mayor a cero
 while(incremento>0){
     //Se realiza un for para recorre y validar el numero que va llegando
  for(i=incremento+1;i<=numero;i++){
   //Se almacena en j el incremento des pues de restarle lo que esta en i
      j=i-incremento;
      //Se coloca otra validación donde j sea mayor a cero
   while(j>0){
    if(Arreglo[j]>=Arreglo[j+incremento]){
     aux = Arreglo[j];
     Arreglo[j] = Arreglo[j+incremento];
     Arreglo[j+incremento] = aux;
    }
    else{
      j=0;
     }
    j=j-incremento;
   }
  }
  incremento=incremento/2;
 }
      
      //Se imprime el arreglo ordenaro despues de 
      //procesar lo anterior
     System.out.println("EL ARREGLO ORDENADO");
        for(i=1;i<=numero;i++){
            System.out.print(" "+Arreglo[i]);
          
        }
  
  
  
  
}
}