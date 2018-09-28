using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HanoiTowers
{
    class HanoiTower
    {
        static void Main(string[] args)
        {
            String res = "";
            do
            {
                int contErr = 0;
                Double contMov = 0; ;
                int nDiscos = 0, Torre1 = 1, Torre2 = 2, Torre3 = 3;

                for (int i = 0; i < 3; i++)
                {
                    try
                    {
                        Console.WriteLine("\n:::TORRE HANOI:::\n");
                        Console.WriteLine("________ ________ ________\n");
                        Console.WriteLine("Torre1 - Torre2 - Torre3\n");

                        Console.WriteLine("\n*Ingrese el numero de discos:\n");
                        nDiscos = Convert.ToInt32(Console.ReadLine());

                        // Condicional valida los numeros negativos y el número cero
                        if (nDiscos <= 0 && nDiscos < 1)
                        {
                            contErr++;
                            Console.WriteLine("\n¡¡¡No se admite el valor cero o numeros negativos!!!\n");
                            Console.WriteLine("\n*Itento #" + contErr);
                        }
                        else
                        {
                            break; // Si no hay errores sale del ciclo con el break
                        }
                    }
                    catch (Exception)
                    {
                        contErr++;
                        Console.WriteLine("\n¡¡Error solo Numeros!!");
                        Console.WriteLine("\n*Intento #" + contErr);
                    }
                }// ciclo for
                if (contErr == 3)
                {
                    Console.WriteLine("\n¡¡Se supero la cantidad maxima de intentos permitidos!!");
                    Console.ReadLine();
                    break;
                }
                else
                {
                    Console.WriteLine("\n*Solucion: \n");
                    // cantidad movimientos (HANOI = 2^N-1)
                    contMov = Math.Pow(2, nDiscos)-1;
                    Console.WriteLine("---------------------\n*#Movimientos: " + contMov + "\n---------------------\n");

                    Hanoi(nDiscos, Torre1, Torre2, Torre3);
                }
                Console.WriteLine("---------------------\n*Para volver a jugar:\n - Digite S\n");
                Console.WriteLine("*Para salir:\n - Cualquier tecla\n---------------------\n");
                res = Console.ReadLine();
            } while (res == "s" || res == "S");
        }
        public static void Hanoi(int nDisco, int Torre1, int Torre2, int Torre3)
        {
            int cont = 0;
            if (nDisco == 1)
            { 
                Console.WriteLine("- Mover de la torre " + Torre1 + " hacia la torre " + Torre3);
                cont = Torre1++;
            }
            else
            {//+ " cont: " + cont++);
                Hanoi(nDisco - 1, Torre1, Torre3, Torre2);
                Console.WriteLine("+ Mover de la torre " + Torre1 + " hacia la torre " + Torre3);
                Hanoi(nDisco - 1, Torre1, Torre2, Torre3);
                cont = Torre1++;
            }
        }// FIN METODO Hanoi
    }
}
