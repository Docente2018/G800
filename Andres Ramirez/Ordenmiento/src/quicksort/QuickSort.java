package quicksort;

import java.util.Random;
import javax.swing.JOptionPane;

public class QuickSort 
{
    //Se crea una variable publica y estatica y se solicita la cantida de numeros a ordenar
    public static int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    public static int[] sequence = new int[N];
 
    public static void QuickSort(int left, int right)     {
        //Se utiliza un if para validar que los valores sean mayores o oguiaales a cero
        if (right - left <= 0) {
        } else 
            //Se crean las variables aleatorioas que se ingresaron anteriormente.
        {
            Random rand = new Random();
            //Aqui se realiza el intercambio de valores con el metodo swap Interest Rate Swap
            int pivotIndex = left + rand.nextInt(right - left + 1);
            swap(pivotIndex, right);
             //se separa una secuencia por la derecha para realziar una particion
            int pivot = sequence[right];
            //Se crea la particion donde se sepa para numros de la dechea, numeros de la izquierda e iguales
            int partition = partitionIt(left, right, pivot);
           // Se utiliz el metodo creado anteriormente que es Quicksort para el ordenamiento
            QuickSort(left, partition - 1);
            QuickSort(partition + 1, right);
        }
    }
    //Esta etiqueta se utiliza para poder realizar la compilación del programa sin ningun problema 
    //Ya que omite las advertencias locaolmente
    @SuppressWarnings("empty-statement")
    //Aqui se crea el metodo artition que se esta utilizando anteriormente para el ordenamiento
    public static int partitionIt(int left, int right, long pivot) 
    {
            //Aqui se resta por el lado derecho 1 para que realice el ordenamiento por derecha
        int leftPtr = left - 1;
        //Aqui se imprime el valor capturado por derecha que se tiene actualmente
        int rightPtr = right;
        //Aqui se crea un ciclo para que la secuencia que se tiene y que se esta ulitizaqndo en el metodo de arriba
        //adicionalmente se comienza a validar los valores que se tienen por derechda 
        while (true) 
        {
            while (sequence[++leftPtr] < pivot)
                ;
            while (rightPtr > 0 && sequence[--rightPtr] > pivot)
                ;
            //Aqui se realiza una validación de los valores que se estan recorriendo por izquierda
            //Y se comparan con los de la derecha
            if (leftPtr >= rightPtr)
                //Una ves terminada la validación se rompe el ciclo
                break;
            else
                //Aqui se utiliza nuevamente el swap para realizar el intercambio correspindiente entre
                //los derechos con los izquierdos
                swap(leftPtr, rightPtr);
        }
        //Aqui vuelve y se intercambian los valores una vez mas y me retorna los valores que tiene por la derecha 
        swap(leftPtr, right);
        return leftPtr;
    }
 
    public static void swap(int dex1, int dex2) 
    {
        //Aqui se utilizan los valores almacenados en los metodos anteriores y se utiliza el el swap
        int temp = sequence[dex1];
       //Aqui se valida la secuencia1 y se le asigna a la secuencia del numero dos
        sequence[dex1] = sequence[dex2];
        //la secuencia dos es almacenada en una variable temporal
        sequence[dex2] = temp;
        //En este caso las tres variables con los valores iguales
    }
 
    static void printSequence(int[] sorted_sequence) 
    {
        //Aqui se crea un metodo el cual me va arecorrer las secuencias del metodo anterior 
        //y me las imprime con el valor que tienen siempre y cuando me cumplan la condicion establecida
        //que sea mayor a 0
        for (int i = 0; i < sorted_sequence.length; i++)
            System.out.print(sorted_sequence[i] + " ");
    }
 
    public static void main(String args[]) 
    {
        System.out
                .println("Sorting of randomly generated numbers using RANDOMIZED QUICK SORT");
        Random random = new Random();
 
        for (int i = 0; i < N; i++)
            sequence[i] = Math.abs(random.nextInt(100));
 
        System.out.println("\nOriginal Sequence: ");
        printSequence(sequence);
        System.out.println("\nSorted Sequence: ");
        QuickSort(0, N - 1);
        printSequence(sequence);
    }
}