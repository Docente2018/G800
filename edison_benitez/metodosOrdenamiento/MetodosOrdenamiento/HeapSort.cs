using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MetodosOrdenamiento
{
    public static partial class Ordenamiento
    {
        private static int tamanoMonton;

        public static void HeapSort(int[] arreglo, ref TimeSpan duracion)
        {
            DateTime inicio = DateTime.Now;
            
            //determinar el tamaño del monton
            tamanoMonton = arreglo.Length - 1;
            //construir el monton
            for (int i = tamanoMonton / 2; i >= 0; i--)
            {
                Amontonar(arreglo, i);
            } 
            
            //ordenar el monton
            for (int i = arreglo.Length - 1; i >= 0; i--)
            {
                Intercambiar(arreglo, 0, i);
                tamanoMonton--;
                Amontonar(arreglo, 0);
            }

            DateTime final = DateTime.Now;

            duracion = final - inicio;

        }


        private static void Intercambiar(int[] arr, int x, int y)//funcion para intercambiar de posicion en el arreglo a dos elementos
        {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        private static void Amontonar(int[] arr, int posicion) //funcion para crear un arreglo amontonado como un arbol
        {
            int padre = posicion;//este es el indice del elemento padre
            int hijoIzquierda = 2 * posicion;//este es el indice del elemento hijo de la izquierda
            int hijoDerecha = 2 * posicion + 1;//este es el indice del elemnto hijo de la derecha
            
            if (hijoIzquierda <= tamanoMonton && arr[hijoIzquierda] > arr[posicion])
            {
                padre = hijoIzquierda;
            }

            if (hijoDerecha <= tamanoMonton && arr[hijoDerecha] > arr[padre])
            {
                padre = hijoDerecha;
            }

            if (padre != posicion)
            {
                Intercambiar(arr, posicion, padre);
                Amontonar(arr, padre);
            }
        }
        

    }
}
