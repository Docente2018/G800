using System;

namespace Ordenamiento
{
    class Orden
    {
        static void Main(string[] args)
        {
            //Inicialización de variables
            bool band = false;
            int cant = 0;
            int[] array = null;

            Console.WriteLine("ORDENAMIENTO DE ARREGLOS...");


            do
            {
                try
                {
                    //Repetir mientras cantidad de posiciones sea entre 4 y 10
                    do
                    {
                        //Ingresar tamaño de arerglo (entre 4 y 10)
                        Console.Write("Ingresa el tamaño del arreglo...");
                        cant = int.Parse(Console.ReadLine().ToString());
                        array = new int[cant];
                        band = true;

                        Console.WriteLine("");

                        //Ingresar valores de cada posición del arreglo
                        for (int i = 0; i < cant; i++)
                        {
                            Console.Write("Ingrese valor de posición " + (i + 1) + ": ");
                            array[i] = int.Parse(Console.ReadLine().ToString());
                        }
                    }
                    while (cant < 4 && cant > 10);
                    
                }
                catch(Exception ex)
                {
                    band = false;
                }
            } while (!band);


            Console.WriteLine("");

            //Imprimir arreglo incial antes de ordenar
            Console.WriteLine("Arreglo inicial...");
            for (int i = 0; i < array.Length; i++)
            {
                Console.Write(array[i] + " ");
            }

            Console.WriteLine();
            Console.WriteLine();

            //Ejecutar ordenamiento de arreglo
            Orden.Sortear(array, 0, array.Length - 1);

            //Imprimir arreglo después de ordenar
            Console.WriteLine("Arreglo final...");
            for (int i = 0; i < array.Length; i++)
            {
                Console.Write(array[i] + " ");
            }

            Console.WriteLine();

            Console.ReadLine();
        }

        //Funcion para ordenar arerglo de menor a mayor
        public static void Sortear(int[] arreglo, int izq, int der)
        {
            int i = izq, j = der;
            //obtener primer posición de arreglo
            int pivot = arreglo[(izq + der) / 2];

            //Mientras posicion inicial sea menor o igual a final
            while (i <= j)
            {
                //Si posición es igual a pivote
                while (arreglo[i].CompareTo(pivot) < 0)
                {
                    i++;
                }

                while (arreglo[j].CompareTo(pivot) > 0)
                {
                    j--;
                }

                if (i <= j)
                {
                    //Mover posicion de arreglo mediante auxiliar (tmp)
                    int tmp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = tmp;

                    i++;
                    j--;
                }
            }

            if (izq < j)
            {
                //Organizar arreglo moviendo a siguiente posición
                Sortear(arreglo, izq, j);
            }

            if (i < der)
            {
                //Organizar arreglo moviendo a siguiente posición
                Sortear(arreglo, i, der);
            }
        }
    }
}
