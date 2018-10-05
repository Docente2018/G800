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
        private static int movimientos;

        static void Main(string[] args)
        {
            //Cantidad de discos
            int discos = 0;
            //cantidad de intentos
            int intentos = 3;

            while (intentos > 0)
            {
                Console.WriteLine("LAS TORRES DE HANOI...");
                Console.WriteLine("Digite el numero de discos que desea");
                try
                {
                    discos = Convert.ToInt32(Console.ReadLine());
                    //no admite numeros menores a cero
                    if (discos <= 0)
                    {
                        throw new ArgumentNullException();
                    }
                    Console.WriteLine("Cantidad de discos: " + discos);
                    //Primer movimiento, cantidad de discos y torres
                    Hanoi.MueveTorre(discos, "A", "C", "B");

                    //Resultado
                    Console.WriteLine("\nResuelto en " + movimientos + " movimientos...");
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

        public static void mover(int discos,string a, string b)
        {
            //Mover disco de una torre a otra
            Console.WriteLine("mover el disco "+discos+" de la torre " + a + " mueve a torre " + b);
            //Aumenta contador de movimientos
            movimientos++;
        }

        public static void MueveTorre(int discos, string torre1, string torre2, string torre3)
        {
            //Si numero de movimiento es menor a cero, mueve a torre
            if (discos < 2)
            {
                Hanoi.mover(discos,torre1, torre2);
            }
            else
            {
                //Generar iteración de recursividad para mover a torre auxiliar
                Hanoi.MueveTorre(discos - 1, torre1, torre3, torre2);
                //Cambiar disco de torres
                Hanoi.mover(discos,torre1, torre2);

                //Mover a torre auxiliar para generar pivote de torre
                Hanoi.MueveTorre(discos - 1, torre3, torre2, torre1);
            }
            return;
        }
    }
}
