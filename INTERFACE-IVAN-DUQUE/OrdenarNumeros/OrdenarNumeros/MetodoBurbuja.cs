using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OrdenarNumeros
{
    public class MetodoBurbuja
    {
        int cantNumeros = 0;
        int[] vectorNums;
       //Se debe crear un metodo tipo void para poder usar el Console.Writeline
        public void cargar(){
            int cont = 0;
            for (int i = 0; i < 3; i++)
            {
                try
                {
                   
                    Console.WriteLine("\n::::ORDENAMIENTO DE NUMEROS(Metodo Burbuja)::::\n");
                    Console.WriteLine("+_______________________________________________+\n");
                    Console.WriteLine("\n- Ingrese la cantidad de numeros a ingresar:\n");
                    cantNumeros = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("+_______________________________________________+\n");
                    vectorNums = new int[cantNumeros];
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

            for (int i = 0; i < cantNumeros; i++)
            {

                Console.WriteLine("\n*Ingrese el " + i + "° numero: \n");
                vectorNums[i] = Convert.ToInt32(Console.ReadLine());

            }
        }
        public void ProcMetodoBurbuja()
        {
            int temp;
            for (int a = 1; a < vectorNums.Length; a++)
            {
                for (int b = vectorNums.Length - 1; b >= a; b--)
                {
                    if (vectorNums[b - 1] > vectorNums[b])
                    {
                        temp = vectorNums[b - 1];
                        vectorNums[b - 1] = vectorNums[b];
                        vectorNums[b] = temp;
                    }
                }
            }
        }
        public void imprimir()
        {

            Console.WriteLine("");
            for (int i = 0; i < this.cantNumeros; i++)
            {

                Console.WriteLine("Num - " + vectorNums[i]);
            }
            //Console.WriteLine("Num - " + numeros[1] + " " + numeros[2] + " +numeros[3]");
        }
        
    }
}
