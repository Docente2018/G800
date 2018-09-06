using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Taller_Corte_1_EdisonBenitez
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el numero al lado de la opcion para selecionarla");
            Console.WriteLine("");
            Console.WriteLine("1. Triangulo");
            Console.WriteLine("2. Rectangulo");
            Console.WriteLine("3. Cuadrado");
            Console.WriteLine("4. Circulo");
            Console.WriteLine("5. Fin");


            int opcion = Convert.ToInt32(Console.ReadLine());

            switch (opcion)
            {
                case 1:
                    Triangulo t = new Triangulo();
                    break;
                case 2:
                    Rectangulo r = new Rectangulo();
                    break;
                case 3:
                    Cuadrado c = new Cuadrado();
                    break;
                case 4:
                    Circulo s = new Circulo();
                    break;
                case 5:
                    Console.WriteLine("Gracias por su tiempo, que vuelva vecino");
                    break;
                default:
                    Console.WriteLine("Opcion invalida, Intente de nuevo");
                    Program.Main(new string[] { });
                    break;
            }

        }
    }

    public class FiguraGeometrica
    {

        public FiguraGeometrica()
        {

        }

        private EnumFigurasGeometricas _Figura;

        private int[] _NumeroLados;

        private double _Area;

        private double _Perimetro;

        public EnumFigurasGeometricas Figura
        {
            get { return _Figura; }
            set { _Figura = value; }
        }

        public int[] NumeroLados
        {
            get { return _NumeroLados; }
            set { _NumeroLados = value; }
        }

        public double Area
        {
            get { return _Area; }
            set { _Area = value; }
        }

        public double Perimetro
        {
            get { return _Perimetro; }
            set { _Perimetro = value; }
        }

        public void SetFigura(int FigNumber)
        {
            this.Figura = (EnumFigurasGeometricas)FigNumber;
        }

        public void SelectNCalculate()
        {
            switch (this._Figura)
            {

                case EnumFigurasGeometricas.Circulo:
                    Circulo cir = new Circulo();
                    break;
                case EnumFigurasGeometricas.Cuadrado:
                    Cuadrado cua = new Cuadrado();
                    break;
                case EnumFigurasGeometricas.Rectangulo:
                    Rectangulo rec = new Rectangulo();
                    break;
                case EnumFigurasGeometricas.Triangulo:
                    Triangulo tri = new Triangulo();
                    break;
                
                default:
                    throw new InvalidOperationException("La opcion que escogio no esta en el listado");
            }
        }

    }


    public enum EnumFigurasGeometricas
    {
        
        Triangulo = 1,
        Rectangulo,
        Cuadrado,
        Circulo
    }

    public interface IAreaCalculable
    {
        void CalcularArea(int[] lados);
        void SetFiguraByLados();

        void CalcularPerimetro(int[] lados);
    }

    
    public class Triangulo : FiguraGeometrica, IAreaCalculable
    {
        public Triangulo()
        {
            int[] lados = new int[3];
            
            SetFiguraByLados();
            Console.WriteLine("Ingrese el valor del primer lado");
            lados[0] = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Ingrese el valor del segundo lado");
            lados[1] = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Ingrese el valor del tercer lado");
            lados[2] = Convert.ToInt32(Console.ReadLine());
            NumeroLados = lados;
            CalcularPerimetro(NumeroLados);
            CalcularArea(NumeroLados);
            
            Console.Write(string.Format("El area del triangulo es {0} y su perimetro es {1}", Area.ToString(), Perimetro.ToString()));
            Console.Read();
        }

        public void SetFiguraByLados()
        {
            this.Figura = EnumFigurasGeometricas.Triangulo;
        }

        public void CalcularArea(int[] lados)
        {
            int lado1 = lados[0];
            int lado2 = lados[1];
            int lado3 = lados[2];
            
            this.Area = Math.Sqrt(this.Perimetro * (Perimetro - lado1) * (Perimetro - lado2) * (Perimetro - lado3));
        }
        public void CalcularPerimetro(int[] lados) 
        {
            Perimetro = lados[0] + lados[1] + lados[2];  
        }
    }
    public class Circulo : FiguraGeometrica, IAreaCalculable
    {
        public Circulo()
        {
            int[] lados = new int[1];
            SetFiguraByLados();
            Console.WriteLine("Ingrese el valor del radio del circulo");
            lados[0] = Convert.ToInt32(Console.ReadLine());
            NumeroLados = lados;
            CalcularPerimetro(NumeroLados);
            CalcularArea(NumeroLados);

            Console.Write(string.Format("El area del circulo es {0} y su perimetro es {1}", Area.ToString(), Perimetro.ToString()));
            Console.Read();

        }

        public void SetFiguraByLados()
        {
            this.Figura = EnumFigurasGeometricas.Circulo;
        }

        public void CalcularArea(int[] lados)
        {
            int lado1 = lados[0];
            this.Area = Math.Pow(lado1, 2) + Math.PI;
        }
        public void CalcularPerimetro(int[] lados)
        {
            Perimetro = lados[0] * 2 * Math.PI;
        }
    }
    public class Cuadrado : FiguraGeometrica, IAreaCalculable
    {
        public Cuadrado()
        {
            int[] lados = new int[1];

            SetFiguraByLados();
            Console.WriteLine("Ingrese el valor del lado del cuadrado");
            lados[0] = Convert.ToInt32(Console.ReadLine());
            NumeroLados = lados;
            CalcularPerimetro(NumeroLados);
            CalcularArea(NumeroLados);

            Console.Write(string.Format("El area del cuadrado es {0} y su perimetro es {1}", Area.ToString(), Perimetro.ToString()));
            Console.Read();

        }

        public void SetFiguraByLados()
        {
            this.Figura = EnumFigurasGeometricas.Cuadrado;
        }

        public void CalcularArea(int[] lados)
        {
            int lado1 = lados[0];
            this.Area = Math.Pow(lado1, 2);
        }
        public void CalcularPerimetro(int[] lados)
        {
            Perimetro = lados[0] * 4;
        }
    }
    public class Rectangulo : FiguraGeometrica, IAreaCalculable
    {
        public Rectangulo()
        {
            int[] lados = new int[2];

            SetFiguraByLados();
            Console.WriteLine("Ingrese el valor de la base");
            lados[0] = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Ingrese el valor de la altura");
            lados[1] = Convert.ToInt32(Console.ReadLine());
            NumeroLados = lados;
            CalcularPerimetro(NumeroLados);
            CalcularArea(NumeroLados);

            Console.Write(string.Format("El area del rectángulo es {0} y su perimetro es {1}", Area.ToString(), Perimetro.ToString()));
            Console.Read();
        }

        public void SetFiguraByLados()
        {
            this.Figura = EnumFigurasGeometricas.Rectangulo;
        }

        public void CalcularArea(int[] lados)
        {
            int lado1 = lados[0];
            int lado2 = lados[1];
            this.Area = lado1 * lado2;
        }
        public void CalcularPerimetro(int[] lados)
        {
            Perimetro = (lados[0] + lados[1]) * 2;
        }
    }
}
