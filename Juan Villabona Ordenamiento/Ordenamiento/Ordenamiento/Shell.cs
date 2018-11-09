using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ordenamiento
{
    class Shell
    {
        private int[] vector;

        public Shell()
        {
            Console.WriteLine("Metodo de Shell Sort");
            Console.Write("Ingresa el tamaño del arreglo...");

            int cant = int.Parse(Console.ReadLine().ToString());
            vector = new int[cant];

            //Ingresar posiciones de arreglo
            for (int f = 0; f < vector.Length; f++)
            {
                Console.Write("Ingrese elemento " + (f + 1) + ": ");
                vector[f] = int.Parse(Console.ReadLine().ToString());
            }

            //ordenar arreglo
            Ordenar();

            Console.WriteLine("");
            //Imprimir arreglo ordenado
            Imprimir();
        }

        public void Ordenar()
        {
            //Ordenamiento de arreglo por metodo shell
            int salto = 0;
            int sw = 0;
            int auxi = 0;
            int e = 0;
            salto = vector.Length / 2;

            //Iterar arreglo para ordenar
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
                            //Mover posiciones de arreglo
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
