using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InheritanceWorkshop
{
    class AccionAnimal
    {
        static void Main(string[] args)
        {
            Reptil a = new Reptil();

            a.comer(new Mamifero());

        }
    }

    

    public class Animal
    {
        public Animal()
        {
            Console.WriteLine("Ha nacido un animal");
        }


        public void Rugir(string ruido)
        {
            Console.WriteLine(ruido);
        }
    }


    public class Mamifero : Animal
    {
        private int _Patas;

        public int Patas
        {
            get { return _Patas; }
            set { _Patas = value; }
        }
    }

    public class Reptil : Animal
    {
        public void comer(Mamifero a)
        {
            Digerir(a);
        }

        private void Digerir(Mamifero a)
        {
            Console.WriteLine("Ohhh que rico!!!");
        }
    }
}
