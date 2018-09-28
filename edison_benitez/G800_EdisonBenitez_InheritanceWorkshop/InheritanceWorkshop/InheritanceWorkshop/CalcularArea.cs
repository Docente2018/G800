using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InheritanceWorkshop
{
    class CalcularArea
    {
    }

    public abstract class FiguraGeometrica
    {

        private int _NumeroLados;

        public int NumeroLados
        {
            get { return _NumeroLados; }
            set { _NumeroLados = value; }
        }

        private double _longLado;

        public double LongLado
        {
            get { return _longLado; }
            set { _longLado = value; }
        }

        private double _Radio;

        public double Radio
        {
            get { return _Radio; }
            set { _Radio = value; }
        }



        public abstract double CalcularArea();
        
    }

    public class Triangulo:FiguraGeometrica
    {
        public override double CalcularArea()
        {
            return 0;
        }
    }
}
