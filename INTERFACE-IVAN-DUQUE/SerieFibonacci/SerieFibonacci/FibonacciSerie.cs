using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SerieFibonacci
{
    class Fibonacci
    {
        public static void Main(string[] args)
        {
            int a = 1, b = -1, numero = 0, cont=0;

            //Metodo que retorna el valor del tamaño de La cadena Fibonacci y se almacena en la variable
            Console.WriteLine("\n::: BIENVENIDO A LA SERIE FIBONACCI ::::\n");
            //Valida que la cantidad de intentos permitidos sea igual a 3
            for (int i = 0; i < 3; i++)
            {
                try
                {

                    Console.WriteLine("______________________________\n\n* Escriba un número de 1 a 2: \n");
                    numero = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("______________________________\n");
                    // Condicional valida los numeros negativos y el número cero
                    if (numero <= 0 && numero < 1)
                    {
                        cont++;
                        Console.WriteLine("\n¡¡¡No se admite el valor cero o numeros negativos!!!\n");
                        Console.WriteLine("\n*Itento #" + cont);
                    }
                    else
                    {
                        break; // Si no hay errores sale del ciclo con el break
                    }

                }
                catch (Exception)
                {
                    cont++; // Variable cont lleva la cuenta de los intentos fallidos.
                    Console.WriteLine("\n(¡¡¡Error, solo números enteros!!!)\n");
                    Console.WriteLine("\n*Itento #" + cont);
               
                }
              
            }
            if (cont == 3) // Condicional valida si la cantidad de intentos es igual 3 
            {
                Console.WriteLine("\n( :: Superó la cantidad de intentos permitidos :: )\n");
                Console.Read();
            }
            else
            {
            Console.WriteLine("\n*La Serie para el "+numero+" es: ");

            // serie: 0 1 1 2 3 5 8 13 21 34 55
                for (int i = 1; i <= numero; i++)
                {
                    // variables 
                    a = a + b; // Se muestra la variable a que contiene la serie
                    b = a - b;

                    // ::: Imprime la serie FIBONACCI :::
                    Console.WriteLine("\n " + a +" \n____");
                    //Console.WriteLine("b=( "+b+" )");
                }
                Console.Read();
            }
        }

    }

}