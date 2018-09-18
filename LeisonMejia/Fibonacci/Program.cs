using System;

namespace SerieFibonacci
{
    class Program
    {
        static int conteoErrores = 0;

        static void Main(string[] args)
        {
            generarFibonacci();            
        }

        static void generarFibonacci()
        {
            // inicializacion de variables
            int numeroInicial = 0, numeroFinal = 1, numeroTotal = 0;
            int numeroMaximo = 0;
            // se solicita al usuario la cantidad maxima de veces que iterara la serie de fibonacci
            try
            {
                Console.Write("Ingrese el número máximo de iteraciones: ");
                numeroMaximo = int.Parse(Console.ReadLine());

                // valida el valor ingresado para que solamente permita numeros mayores a 0
                if(numeroMaximo < 1)
                {
                    Console.WriteLine("El numero ingresado debe ser mayor a 0");
                    Console.WriteLine("presione cualquier tecla para continuar");
                    Console.ReadKey();
                    // limpia la consola
                    Console.Clear();

                    // aumenta la cantidad de errores cometidos por el usuario
                    conteoErrores++;

                    // valida si ya exedio el maximo de 3 errores para cerrar la App
                    validadrCantidadErrores();

                    // se llama asi misma para volver a ejecutar de nuevo el metodo
                    generarFibonacci();
                }
            }
            catch(Exception e)
            {
                Console.WriteLine("Ingreso un caracter erroneo, por favor presione una tecla para continuar");
                Console.ReadKey();
                Console.Clear();

                // aumenta la cantidad de errores cometidos por el usuario
                conteoErrores++;

                // valida si ya exedio el maximo de 3 errores para cerrar la App
                validadrCantidadErrores();

                // se llama asi misma para volver a ejecutar de nuevo el metodo
                generarFibonacci();
            }

            // realiza el calculo de la serie de fibonacci la veces indicadas por el usuario
            for(int i = 0; i < numeroMaximo; i++)
            {
                numeroTotal = numeroInicial + numeroTotal;
                numeroInicial = numeroFinal;
                numeroFinal = numeroTotal;

                // se imprime el valor calculado
                Console.WriteLine(numeroTotal);
            }

            Console.ReadKey();
            

        }

        // valida si ya el usuario erro 3 veces para cerrar la App
        static void validadrCantidadErrores()
        {
            if(conteoErrores == 3)
            {
                Console.WriteLine("Excedio los 3 intentos maximos");
                Console.WriteLine("Presione cualquier tecla para salir");
                Console.ReadKey();
                Environment.Exit(0);
            }
        }

    }
}
