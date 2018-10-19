using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MetodosOrdenamiento
{
    class Program
    {
        static string[] metodos = new string[] { "1. Burbuja", "2. Quick Sort", "3. Insert Sort", "4. Heap Sort" };

        static TimeSpan duracion;

        static int cantidad = 0;
        static int opcion = 0;
        static bool valido = false;
        static void Main(string[] args)
        {

            Console.WriteLine("Seleccione el metodo de insercion con el numero del menu");
            foreach (string item in metodos)
            {
                Console.WriteLine(item);
            }

            while (!valido)
            {

                EvalOpcion(Console.ReadLine());

            }

            Console.WriteLine("Ingrese el numero de items que desea ordenar. ");
            valido = false;

            while (!valido)
            {
                EvalCantidad(Console.ReadLine());
            }

            Random r = new Random();

            int[] arregloNumeros = new int[cantidad];

            for (int c = 0; c <= cantidad - 1; c++)
            {
                arregloNumeros[c] = r.Next(0, 300);
            }

            Console.WriteLine("Los números que se van a ordenar son:");

            foreach (int item in arregloNumeros)
            {
                Console.Write(item.ToString() + " ");
            }

            switch (opcion)
            {
                case 1:
                    Ordenamiento.Bubble(arregloNumeros, ref duracion);

                    break;

                case 2:
                    Ordenamiento.QuickSort(arregloNumeros, 0, arregloNumeros.Length - 1, ref duracion);

                    break;
                case 3:
                    Ordenamiento.Insercion(arregloNumeros, ref duracion);

                    break;
                case 4:
                    Ordenamiento.HeapSort(arregloNumeros, ref duracion);

                    break;
                default:
                    break;
            }

            Console.WriteLine();
            Console.WriteLine("Arreglo Ordenado");
            for (int i = 0; i < arregloNumeros.Length; i++)
            {
                Console.Write(arregloNumeros[i].ToString() + " ");
            }

            Console.WriteLine("");
            Console.WriteLine("El ordenamiento duro " + duracion.TotalMilliseconds.ToString() + " milisegundos");


            Console.Read();

        }

        private static void EvalCantidad(string p)
        {
            valido = int.TryParse(p, out cantidad);
            if (!valido || cantidad <= 0)
            {
                valido = false;
                Console.WriteLine("El numero que ingresó no es válido. Ingrese otro número");
            }
        }

        private static void EvalOpcion(string p)
        {

            valido = int.TryParse(p, out opcion);
            if (!valido || opcion > metodos.Length)
            {
                valido = false;
                Console.WriteLine("La opcion que ingresó no es valida. Seleccione otra opción");
            }

        }
    }
}
