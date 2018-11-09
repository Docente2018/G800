using System;
using System.Threading;

namespace Ordenamiento
{
    class Orden
    {
        static void Main(string[] args)
        {
            int opcion = 0;
            bool band = false;
            

            //Seleccionar tipo de ordenamiento
            do
            {
                try
                {
                    do
                    {
                        Console.Clear();
                        Console.WriteLine("METODOS DE ORDENAMIENTO DE ARREGLOS...");
                        Console.WriteLine("1. Ordernamiento QuickSort.\n" +
                           "2. Ordenamiento por inserción.\n" +
                           "3. Ordenamiento Shell \n" +
                           "4. Salir.");
                        Console.Write("Seleccione una opcion: ");

                        opcion = int.Parse(Console.ReadLine().ToString());
                        Orden.callOption(opcion);

                    }
                    while(opcion < 1 || opcion > 4);                    
                }
                catch(Exception ex)
                {
                    Console.Clear();
                }
               
            } while (!band);
        }

        public static void callOption(int opt)
        {
            //Llamado a procesos por opcion seleccionada
            Console.Clear();
            switch (opt)
            {
                case 1:
                    QuickSort qS = new QuickSort();
                    break;
                case 2:
                    Insercion ins = new Insercion();
                    break;
                case 3:
                    Shell shell = new Shell();
                    break;
                case 4:
                    Console.Write("Adios...");
                    Thread.Sleep(800);
                    Environment.Exit(0);
                    break;
            }
        }
       
    }
}
