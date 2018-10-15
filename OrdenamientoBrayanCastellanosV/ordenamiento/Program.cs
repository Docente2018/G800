using System;

namespace ordenamiento
{
    class Program
    {
        static void Main(string[] args)
        {
            int intentos = 3;
            //Creamos un vector (Array) de enteros con una longitud de 5 elementos
            int[] numeros = new int[5];
            while (intentos > 0)
            {
                try
                {
                    //Solicitamos al usuario los 5 valores (desordenados)
                    for (int i = 0; i < 5; i++)
                    {
                        Console.WriteLine("Ingrese un número:");
                        numeros[i] = int.Parse(Console.ReadLine());
                    }

                    //Ordenamos la lista e imprimimos los valores.
                    Array.Sort(numeros);
                    Console.WriteLine("\nLos números ordenados son:");

                    for (int i = 0; i < 5; i++)
                    {
                        Console.WriteLine(numeros[i]);
                    }

                    //Para mantener la consola abierta
                    Console.ReadKey();

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
}