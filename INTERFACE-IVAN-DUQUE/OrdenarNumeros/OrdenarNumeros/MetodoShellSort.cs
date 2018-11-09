using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OrdenarNumeros
{
    class MetodoShellSort
    {
        private int[] vector;
        int cant;
        string linea;
        //Se debe crear un metodo tipo void para poder usar el Console.Writeline
        public void cargar()
        {
            int cont = 0;
            for (int i = 0; i < 3; i++)
            {
                try
                {

                    Console.WriteLine("\n::::ORDENAMIENTO DE NUMEROS(Metodo Shell Sort)::::\n");
                    Console.WriteLine("+_______________________________________________+\n");
                    Console.Write("\n-Ingrese de cuanto sera la longitud del vector: \n");
                    linea = Console.ReadLine();
                    cant = int.Parse(linea);
                    vector = new int[cant];
                    if (cont == 0)
                    {
                        break;
                    }
                    else if (cont == 3)
                    {
                        Console.WriteLine("::: Intentos permitidos superados :::");
                        Console.Read();
                    }
                }
                catch (Exception)
                {
                    cont++;
                    Console.WriteLine("\n----------------------\n");
                    Console.WriteLine("¡Error, solo numeros!\nintente de nuevo.");
                    Console.WriteLine("Intento# " + cont + "\n----------------------\n");
                }
                for (int f = 0; f < vector.Length; f++)
                {
                    Console.Write("Ingrese elemento " + (f + 1) + ": ");
                    linea = Console.ReadLine();
                    vector[f] = int.Parse(linea);
                }

            }

        }
        public void Shell()
        {
            int salto = 0;
            int sw = 0;
            int auxi = 0;
            int e = 0;
            salto = vector.Length / 2;
            while (salto > 0)
            {
                sw = 1;
                while (sw != 0)
                {
                    sw = 0;
                    e = 1;
                    while (e <= (vector.Length - salto))
                    {
                        if (vector[e - 1] > vector[(e - 1) + salto])
                        {
                            auxi = vector[(e - 1) + salto];
                            vector[(e - 1) + salto] = vector[e - 1];
                            vector[(e - 1)] = auxi;
                            sw = 1;
                        }
                        e++;
                    }
                }
                salto = salto / 2;
            }
        }

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
