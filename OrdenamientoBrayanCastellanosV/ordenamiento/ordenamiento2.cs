    using System;
    using System.Collections.Generic;
    using System.Text;

    namespace Ordenamiento
    {
        class Ordenamiento2
        {

            static void Main()
            {
                int n;
                Console.WriteLine("Metodo de Quick Sort");
                Console.Write("Cuantos longitud del vector: ");

                int intentos = 3;          
                while (intentos > 0)
                {
                    try
                    {                  
                        Console.WriteLine("Metodo de Quick Sort");
                        Console.Write("Cuantos longitud del vector: ");
                        n = Int32.Parse(Console.ReadLine());
                        //pedimos el tamaño del array
                        llenar b = new llenar(n);
                    }
                    catch (Exception e)
                    {
                        //controlamos que no se digiten letras ni valores menores a cero!!
                        e.Message.ToString();
                        intentos--;
                        Console.WriteLine("Error digite un numero valido, le quedan (" + intentos + ") intentos.");

                    }
                }
            }
        }

        class llenar
        {
            //llenamos el tamaño del array con el numero digitado
            int h;
            int[] vector;
            public llenar(int n)
            {
                h = n;
                vector = new int[h];
                for (int i = 0; i < h; i++)
                {
                    //Solicitamos al usuario los valores (desordenados)
                    Console.Write("ingrese valor {0}: ", i + 1);
                    vector[i] = Int32.Parse(Console.ReadLine());
                }
                //llamamos este metodo para organizarlos
                quicksort(vector, 0, h - 1);
                //impr pantalla o numeros ordenados
                mostrar();
            }

            private void quicksort(int[] vector, int primero, int ultimo)
            {
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

                if (primero < j)
                {
                    quicksort(vector, primero, j);
                }
                if (i < ultimo)
                {
                    quicksort(vector, i, ultimo);
                }
            }
            //metodo para mostrar los numeros
            private void mostrar()
            {
                Console.WriteLine("Vector ordenados en forma ascendente");
                for (int i = 0; i < h; i++)
                {
                    Console.Write("{0} ", vector[i]);
                }
                Console.ReadLine();
            }
        }
    }
