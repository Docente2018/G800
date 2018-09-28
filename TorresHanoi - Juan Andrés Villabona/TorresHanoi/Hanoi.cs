using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TorresHanoi
{
    class Hanoi
    {
        //Contador movimientos
        private static int x;

        static void Main(string[] args)
        {
            //Cantidad de discos
            int discos = 0;
            int intentos = 0;
            bool band = false;

            do{
                try
                {
                    do
                    {
                        //Ingresar cantidad de discos
                        Console.Write("Ingrese la cantidad de discos: ");
                        discos = int.Parse(Console.ReadLine().ToString());

                        //Verificar el rango de discos valido
                        if(discos < 4 || discos > 8)
                        {
                            Console.Clear();
                            Console.WriteLine("Ingrese una cantidad de discos entre 4 y 8");
                        }
                    } while (discos < 4 || discos > 8);
                                       
                    band = true;
                }
                catch (Exception ex)
                {
                    //Aumenta cantidad de intentos errados
                    intentos++;
                    band = false;

                    Console.Clear();
                    Console.WriteLine("Valor inválido...");


                    //Si intentos igual a 3, genera error y termina ejecución
                    if(intentos == 3)
                    {
                        Console.WriteLine("Presione cualquier tecla para finalizar...");
                        Console.ReadKey();
                        Environment.Exit(0);
                    }
                    
                }
            }while (!band) ;


            Console.Clear();
            Console.WriteLine("LAS TORRES DE HANOI...");
            Console.WriteLine("Cantidad de discos: " + discos);
            Console.WriteLine("");

            //Primer movimiento
            Hanoi.MueveTorre(discos, 1, 3, 2);

            //Resultado
            Console.WriteLine("\nResuelto en " + x + " movimientos...");
            Console.ReadKey();
        }

        public static void mover(int disc ,int a, int b)
        {
            //Mover disco de una torre a otra
            Console.WriteLine("Disco " + disc + " mueve de torre " + a + " a torre " + b);
            //Aumenta contador de movimientos
            x++;
        }

        public static void MueveTorre(int num, int desde, int hasta, int pivote)
        {
            //Si numero de movimiento es menor a cero, mueve a torre
            if(num < 2)
            {
                Hanoi.mover(num, desde, hasta);
            }
            else
            {
                //Generar iteración de recursividad para mover a torre auxiliar
                Hanoi.MueveTorre(num - 1, desde, pivote, hasta);
                //Cambiar disco de torres
                Hanoi.mover(num, desde, hasta);

                //Mover a torre auxiliar para generar pivote de torre
                Hanoi.MueveTorre(num - 1, pivote, hasta, desde);
            }

            return;
        }
    }
}
