using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fibonacci
{
    class Fibonacci
    {
        static void Main(string[] args)
        {
            // Inicialización de variables
            int num = 0, aux1 = 1, aux2 = 1, aux, intentos = 0;
            bool band = false;
            
            //Solicita límite de serie mientras sea valor correcto
            do{
                try{
                    Console.Write("Ingrese límite de serie: ");
                    num = int.Parse(Console.ReadLine().ToString());

                    //Si número es negativo, genera error
                    if(num <= 0){
                        throw new Exception();
                    }

                    band = true;
                }catch (Exception ex){
                    //Error si no ingresa valores validos m 
                    Console.Clear();
                    Console.WriteLine("Valor no permitido...");
                    band = false;
                    intentos++;


                    //Si tiene tres intentos fallidos, finaliza proceso
                    if(intentos == 3)
                    {
                        Console.WriteLine("Cantidad de intentos errados superado...");
                        Console.ReadKey();
                        Environment.Exit(0);
                    }
                }
            } while (!band);

            Console.WriteLine("Los valores de la serie finonacci hasta el número " + num + " es:\n");
            //Impresión de primer valor
            Console.WriteLine(aux1.ToString());

            //Generación de serie desde 0 hasta límite ingresado
            for (int i = 1; i < num; i++){
                //Asignar valor anterior
                aux = aux1;
                aux1 = aux2;

                //Sumar valor actual con valor anterior
                aux2 = aux + aux1;

                //Impresión de valor en serie
                Console.WriteLine(aux1);
            }

            //Lectura de entrada para finalizar programa
            Console.Write("\nPresione cualquier tecla para finalizar...");
            Console.ReadKey();
        }
    }
}
