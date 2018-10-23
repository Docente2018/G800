using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ordenamiento
{
    class Insercion
    {
        private int[] vector;

        public Insercion()
        {
            Console.WriteLine("Metodo de insercion directa");
            Console.Write("Ingresa el tamaño del arreglo...");

            //Ingresar cantidad de posiciones que desea en arreglo
            int cant = int.Parse(Console.ReadLine().ToString());
            vector = new int[cant];

            //Llenar arrerglo inicial
            for (int f = 0; f < vector.Length; f++)
            {
                Console.Write("Ingrese elemento " + (f + 1) + ": ");
                vector[f] = int.Parse(Console.ReadLine().ToString());
            }

            Console.WriteLine("");
            //Imprimir arreglo ordenado
            Imprimir();
        }


        //ordenamiento por insercion
        public void InsercionDirecta()
        {
            int auxili;
            int j;
            //Iterar arreglo para ordenar
            for (int i = 0; i < vector.Length; i++)
            {
                auxili = vector[i];
                j = i - 1;
                while (j >= 0 && vector[j] > auxili)
                {
                    vector[j + 1] = vector[j];
                    j--;
                }
                vector[j + 1] = auxili;
            }
        }

        //Imprimir arreglo ordenado
        public void Imprimir()
        {
            Console.WriteLine("Vector ordenados en forma ascendente");
            for (int f = 0; f < vector.Length; f++)
            {
                Console.Write(vector[f] + "  ");
            }
            Console.ReadKey();
        }
    }
}
