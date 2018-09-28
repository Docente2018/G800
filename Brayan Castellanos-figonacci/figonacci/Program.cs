using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace figonacci
{
    class Program
    {
        static void Main(string[] args)
        {
            //Brayan Alberto Castellanos Vargas
            //Programacion Associate

            //definimos las variables a utilizar
            int num1, num2, num3, contador, aux;
            int intentos = 0;
            //imprime el mensaje
            num3 = 0;
            //validar cantidad de intentos
            while (intentos < 3)
            {
                try
                {
                    Console.WriteLine("¿Cuantos números Fibonacci quieres?");
                    //captura el entero para saber cuantas veces se repite
                    num3 = int.Parse(Console.ReadLine());
                }
                catch (Exception e)
                {
                    intentos++;
                    num3 = 0;
                    Console.WriteLine("Valor no valido");
                    if (intentos == 3)
                    {
                        Console.WriteLine("Demasiados intentos erroneos, programa bloqueado");
                        Console.ReadKey();
                        Environment.Exit(0);
                    }
                }
            
            //mensaje de impresion
            Console.WriteLine("La matriz figonacci es: ");
            //valores a las primeras variables
            num1 = 0;
            num2 = 1;
            //se hace un for para repetir las veces deseadas y sume el numero anterior
            for (contador = 0; contador < num3; contador++)
            {
                aux = num1;
                num1 = num2;
                num2 = aux + num1;
                //se imprime el numero las veces deseadas
                Console.WriteLine(num1);
            }
            //se espera una tecla para terminar o iniciar nuevamente el programa
            Console.ReadKey();
        }
        }
    }
}
