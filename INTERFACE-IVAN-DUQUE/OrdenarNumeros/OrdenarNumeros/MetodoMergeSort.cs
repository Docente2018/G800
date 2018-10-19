using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OrdenarNumeros
{
    class MetodoMergeSort
    {
        string linea;
        int[] nums = new int[40];
        //Se debe crear un metodo tipo void para poder usar el Console.Writeline
        public void cargar()
        {
            int cont = 0;
            for (int i = 0; i < 3; i++)
            {
                try
                {
                   
                    Console.WriteLine("\n::::ORDENAMIENTO DE NUMEROS(Metodo Merge Sort)::::\n");
                    Console.Write("\n-Ingrese de cuanto sera la longitud del vector: \n");
                    linea = Console.ReadLine();

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

            }
            int cant;
            cant = int.Parse(linea);
            nums = new int[cant];
            for (int f = 0; f < nums.Length; f++)
            {
                Console.Write("Ingrese elemento " + (f + 1) + ": ");
                linea = Console.ReadLine();
                nums[f] = int.Parse(linea);
            }
            ProcMetodoMergeSort(nums);
            Console.WriteLine("Vector Ordenado Ascendentemente");
            for (int i = 0; i < nums.Length; i++)
                Console.Write(nums[i] + " ");
            Console.ReadLine();

        } 
        //Método portal que llama al método recursivo inicial
        public static void ProcMetodoMergeSort(int[] x)
        {
            ProcMetodoMergeSort(x, 0, x.Length - 1);
        }

        static private void ProcMetodoMergeSort(int[] x, int desde, int hasta)
        {
            //Condicion de parada
            if (desde == hasta)
                return;
            //Calculo la mitad del array
            int mitad = (desde + hasta) / 2;
            //Voy a ordenar recursivamente la primera mitad
            //y luego la segunda
            ProcMetodoMergeSort(x, desde, mitad);
            ProcMetodoMergeSort(x, mitad + 1, hasta);
            //Mezclo las dos mitades ordenadas
            int[] aux = Merge(x, desde, mitad, mitad + 1, hasta);
            Array.Copy(aux, 0, x, desde, aux.Length);
        }

        //Método que mezcla las dos mitades ordenadas
        static private int[] Merge(int[] x, int desde1, int hasta1, int desde2, int hasta2)
        {
            int a = desde1;
            int b = desde2;
            int[] result = new int[hasta1 - desde1 + hasta2 - desde2 + 2];

            for (int i = 0; i < result.Length; i++)
            {
                if (b != x.Length)
                {
                    if (a > hasta1 && b <= hasta2)
                    {
                        result[i] = x[b];
                        b++;
                    }
                    if (b > hasta2 && a <= hasta1)
                    {
                        result[i] = x[a];
                        a++;
                    }
                    if (a <= hasta1 && b <= hasta2)
                    {
                        if (x[b] <= x[a])
                        {
                            result[i] = x[b];
                            b++;
                        }
                        else
                        {
                            result[i] = x[a];
                            a++;
                        }
                    }
                }
                else
                {
                    if (a <= hasta1)
                    {
                        result[i] = x[a];
                        a++;
                    }
                }
            }
            return result;
        }
    }
}

