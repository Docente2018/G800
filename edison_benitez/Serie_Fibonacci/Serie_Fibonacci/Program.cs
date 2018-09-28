using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Serie_Fibonacci
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Secuencia de Fibonacci");
            Console.WriteLine("Ingrese el numero de elementos de la serie de fibonaci que desea ver");
            int limite = 0;
            string opcion = Console.ReadLine();
            if (int.TryParse(opcion, out limite))
            {
                if (limite > 1)
                {
                    List<int> serie = Fibonacci.SerieFibonacci(limite);

                    Console.WriteLine(string.Format("los primeros {0} numeros de la seie de fibonacci son:", limite.ToString()));
                    int elemento = 0;
                    
                    foreach (int item in serie)
                    {
                        elemento++;

                        if (elemento == 1)
                        {
                            Console.Write(item.ToString());
                        }
                        else if (elemento == serie.Count)
                        {
                            Console.Write(" y " + item.ToString());
                        }
                        else
                        {
                            Console.Write(string.Format(", {0}", item.ToString()));
                        }
                        
                    }
                }
                else
                {
                    Console.Write("El primer numero de la serie de Fibonaci es 1");
                }

                Console.Read();
                
            }
            else
            {
                Console.WriteLine("Opcion invalida, asegurese de ingresar un numero mayor a 0");
                Main(args);
            }
        }
    }

    public static class Fibonacci
    {

        
        public static List<int> SerieFibonacci(int items)
        {

            List<int> Serie = new List<int>();
            
            Serie.Add(1);
            Serie.Add(1);

            
            int counter = 2;

            while (items >= counter)
            {
                int actual = 0;
                int longActual = Serie.Count;

                Serie.Add(Serie.ElementAt(longActual-1) + Serie.ElementAt(longActual - 2));
                counter++;
            }

            return Serie;
        }



    }
}
