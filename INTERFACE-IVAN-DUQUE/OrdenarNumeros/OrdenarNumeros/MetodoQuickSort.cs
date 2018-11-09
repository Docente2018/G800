using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OrdenarNumeros
{
    class MetodoQuickSort
    {
        //Se debe crear un metodo tipo void para poder usar el Console.Writeline
        public void cargar()
        {
            int cont = 0;
            int n=0;
            for (int i = 0; i < 3; i++)
            {
                try
                {
                    
                    Console.WriteLine("\n::::ORDENAMIENTO DE NUMEROS(Metodo Quick Sort)::::\n");
                    Console.WriteLine("+_______________________________________________+\n");
                    Console.Write("\n- Ingrese de cuanto sera la longitud del vector: ");
                    n = Int32.Parse(Console.ReadLine());

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
            llenar b = new llenar(n);

        }
        public class llenar
        {
            int h;
            int[] vector;
            public llenar(int n)
            {
                h = n;
                vector = new int[h];
                for (int i = 0; i < h; i++)
                {
                    Console.Write("ingrese valor {0}: ", i + 1);
                    vector[i] = Int32.Parse(Console.ReadLine());
                }
                //Se toma un elemento x de una posición cualquiera del arreglo.
                ProcMetodoQuickSort(vector, 0, h - 1);
                imprimir();
            }
            private void ProcMetodoQuickSort(int[] vector, int primero, int ultimo)
            {
                //Se trata de ubicar a x en la posición correcta del arreglo, 
                //de tal forma que todos los elementos que se encuentran 
                //a su izquierda sean menores o iguales a x y todos los 
                //elementos que se encuentren a su derecha sean 
                //mayores o iguales a x.

                int i, j, central;
                double pivote;
                central = (primero + ultimo) / 2;
                pivote = vector[central];
                i = primero;
                j = ultimo;
                do
                {
                    while (vector[i] < pivote) i++;
                    while (vector[j] > pivote) j--;
                    if (i <= j)
                    {
                        int temp;
                        temp = vector[i];
                        vector[i] = vector[j];
                        vector[j] = temp;
                        i++;
                        j--;
                    }
                } while (i <= j);
                //Se repiten los pasos anteriores pero ahora para los conjuntos de datos 
                //que se encuentran a la izquierda y a la derecha de la posición correcta 
                //de x en el arreglo.
                if (primero < j)
                {
                    ProcMetodoQuickSort(vector, primero, j);
                }
                if (i < ultimo)
                {
                    ProcMetodoQuickSort(vector, i, ultimo);
                }
            }

            public void imprimir()
            {

                Console.WriteLine("");
                Console.WriteLine("Vector ordenados en forma ascendente");
                for (int i = 0; i < h; i++)
                {
                    Console.Write("{0} ", vector[i]);
                }
                Console.ReadLine();
            }

        }
    }
}