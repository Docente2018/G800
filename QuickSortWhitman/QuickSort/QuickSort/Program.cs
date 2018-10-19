using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace QuickSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = 0;
            string ns;
            bool esnum = true;
            Console.WriteLine("Ingrese Tamaño del arreglo a ordenar: ");

            try //valida que el valor sea numero
            {
                n = Int32.Parse(Console.ReadLine());
            }
            catch (Exception)
            {
                esnum = false;
            }

            if (n < 0) //valida que el valor no sea negativo
            {
                esnum = false;
            }

            while (esnum == false) //valida que el nuevo valor sea numero
            {
                Console.WriteLine("Digite cantidad para el arreglo valida: ");
                ns = Console.ReadLine();//pide cantidad de discos
                try
                {
                    n = Int32.Parse(ns);
                    esnum = true;
                }
                catch (Exception)
                {
                    esnum = false;
                }
                if (n < 0) //valida que el nuevo valor no sea negativo
                {
                    esnum = false;
                }
            }

            Metodo_QuickSort MQS = new Metodo_QuickSort(n);
            Console.ReadKey();
        }
    }

    class Metodo_QuickSort
    {
        int nElem;
        int[] QuickSort;
        public Metodo_QuickSort(int n)
        {
            nElem = n;
            QuickSort = new int[nElem];

            Random Datos = new Random();

            Console.WriteLine("");
            for (int i = 0; i < QuickSort.Length; i++)
            {
                QuickSort[i] = Datos.Next(n);
            }


            Console.WriteLine("Lista en desorden");
            Console.WriteLine();
            Mostrar();
            Console.WriteLine();
            MetodoQuickSort(QuickSort, 0, nElem - 1);
            Console.WriteLine("Lista en orden");
            Console.WriteLine();
            Mostrar();
        }


        private void MetodoQuickSort(int[] QuickSort, int Primero, int Ultimo)
        {
            int Menor, Mayor, Central;
            double Pivote;

            Central = (Primero + Ultimo) / 2;
            Pivote = QuickSort[Central];
            Menor = Primero;
            Mayor = Ultimo;

            do
            {
                while (QuickSort[Menor] < Pivote) Menor++;
                while (QuickSort[Mayor] > Pivote) Mayor--;

                if (Menor <= Mayor)
                {
                    int temp;
                    temp = QuickSort[Menor];
                    QuickSort[Menor] = QuickSort[Mayor];
                    QuickSort[Mayor] = temp;
                    Menor++;
                    Mayor--;
                }
            } while (Menor <= Mayor);

            if (Primero < Mayor)
            {
                MetodoQuickSort(QuickSort, Primero, Mayor);
            }
            if (Menor < Ultimo)
            {
                MetodoQuickSort(QuickSort, Menor, Ultimo);
            }
        }
        private void Mostrar()
        {
            for (int i = 0; i < nElem; i++)
            {
                Console.WriteLine(QuickSort[i]);
            }
        }
    }
}