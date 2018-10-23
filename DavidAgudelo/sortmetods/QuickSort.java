/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortmetods;

/**
 *
 * @author ESTUDIANTES
 */
public class QuickSort {
    public static void Rapido(int matrix[], int a, int b){
    matrix = new int[matrix.length];
    int buf;
    int from = a;
    int to = b;
    int pivot = matrix[(from+to)/2];
        //Se ejecuta el siguiente codigo hasta
    do{
        // el codigo se divide en dos
        while(matrix[from] < pivot){
            from++;
        }
        while(matrix[to] > pivot){
            to--;
        }
        if(from <= to){
            buf = matrix[from];
            matrix[from] = matrix[to];
            matrix[to] = buf;
            from++; to--;
        }
    }while(from <= to);//Se repite siempre que from sea menor o igual que destino
    if(a < to){
        Rapido(matrix, a, to);
    }
    if(from < b){
        Rapido(matrix, from, b);
    }
} 
    
    public static void main(String[] args) {
        // Variable entera que guarda la longitud del arreglo
        int longitud;
        // Declaración de scanner
        Scanner oscanner = new Scanner(System.in);
        System.out.println("Ordenamiento Quick Sort");
        System.out.println("Ingrese el tamaño de la cadena");
        longitud = oscanner.nextInt();
        int[] numeros = new int[longitud];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(50);
            System.out.print(numeros[i] + " ");
        }   
        // Envia los parametros al metodo para ordenarlos
        QuickSortClass.quickSort(numeros, 0, numeros.length - 1);
        for (int n : numeros) {
            System.out.print(n + " ");
        }

    }
}
