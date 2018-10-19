using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MetodosOrdenamiento
{
    public static partial class Ordenamiento
    {
        public static void Bubble(int[] arreglo, ref TimeSpan duracion)
        {
            DateTime inicio = DateTime.Now;
            
            for (int i = 1; i < arreglo.Length; i++)
            {
                for (int j = 0; j < arreglo.Length - 1; j++)
                {
                    if (arreglo[j]>arreglo[j + 1])
                    {
                        int m = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = m;
                    }
                }
            }

            DateTime final = DateTime.Now;

            duracion = final - inicio;

        }

        public static void Insercion(int[] arreglo, ref TimeSpan duracion)
        {
            DateTime inicio = DateTime.Now;
            
            for (int i = 0; i < arreglo.Length - 1; i++)
            {
                for (int j = i + 1; j > 0; j--)
                {
                    if (arreglo[j - 1] > arreglo[j])
                    {
                        int m = arreglo[j - 1];
                        arreglo[j - 1] = arreglo[j];
                        arreglo[j] = m;
                    }
                }
            }

            DateTime final = DateTime.Now;

            duracion = final - inicio;

        }

        public static void QuickSort(int[] arreglo, int primero, int ultimo, ref TimeSpan duracion)
        {
            DateTime inicio = DateTime.Now;
            
            int i, j, central;
            double pivote;
            central = (primero + ultimo) / 2;
            pivote = arreglo[central];
            i = primero;
            j = ultimo;
            do
            {
                while (arreglo[i] < pivote) i++;
                while (arreglo[j] > pivote) j--;
                if (i <= j)
                {
                    int temp;
                    temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);

            if (primero < j)
            {
                QuickSort(arreglo, primero, j, ref duracion);
            }
            if (i < ultimo)
            {
                QuickSort(arreglo, i, ultimo, ref duracion);
            }

            DateTime final = DateTime.Now;

            duracion = final - inicio;
        }
    }
}
