using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OrdenarNumeros
{
    class MainOrdenamiento
    {
        static void Main(string[] args)
        {

            Console.WriteLine("::: METODOS DE ORDENAMIENTO :::\n");

            int opcion = 0;
            try
            {
                Console.WriteLine("Digite el numero de la opcion:\n");
                Console.WriteLine(" - 1.METODO BURBUJA\n - 2.METODO QUICK SORT\n - 3.METODO SHELL SORT\n - 4.METODO MERGE SORT\n");
                opcion = Convert.ToInt32(Console.ReadLine());

                switch (opcion)
                {
                    case 1: ;
                        Console.WriteLine("\n___________________________\n");
                        Console.WriteLine("::: 1.METODO BURBUJA :::");
                        Console.WriteLine("\n___________________________\n");

                        MetodoBurbuja mb = new MetodoBurbuja();
                        mb.cargar();
                        mb.ProcMetodoBurbuja();
                        mb.imprimir();

                        Console.Read();
                        break;
                    case 2: ;
                        Console.WriteLine("\n___________________________\n");
                        Console.WriteLine("::: 2.METODO QUICK SORT:::");
                        Console.WriteLine("\n___________________________\n");

                        MetodoQuickSort mqs = new MetodoQuickSort();
                        mqs.cargar();

                        break;
                    case 3: ;
                        Console.WriteLine("\n___________________________\n");
                        Console.WriteLine("::: 3.METODO SHELL SORT :::");
                        Console.WriteLine("\n___________________________\n");

                        MetodoShellSort mss = new MetodoShellSort();
                        mss.cargar();
                        mss.Shell();
                        mss.Imprimir();

                        break;
                    case 4: ;
                        Console.WriteLine("\n___________________________\n");
                        Console.WriteLine("::: 4.METODO MERGE SORT :::");
                        Console.WriteLine("\n___________________________\n");

                        MetodoMergeSort mms = new MetodoMergeSort();
                        mms.cargar();
                      

                        break;
                    default:
                        Console.WriteLine("ERROR");
                        break;
                }
            }
            catch (Exception)
            {
                Console.WriteLine("Error solo numeros");
                Console.ReadLine();
             
            }
           

        }
    }
}
