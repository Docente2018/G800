using System;

namespace QuickSort
{
    class MainClass
    {
        public static void Main(string[] args)
        {
			Console.Write("Digite cual sera la longitud del vector");
			int Longitud = Int32.Parse(Console.ReadLine());
			QuickSort qs = new QuickSort(Longitud);
        }
    }
	class QuickSort{
		int LongL;
		int[] Vector;

		public QuickSort(int Long){
			LongL = Long;
			Vector = new int[LongL];
			for (int i = 0; i < LongL; i++)
            {
                Console.Write("Ingresa el valor {0}: ", i + 1);
				Vector[i] = Int32.Parse(Console.ReadLine());
            }
			Organizar(Vector, 0, LongL - 1);
			Mostrar();
		}
		private void Organizar(int [] vector, int primero, int ultimo){
			int pri = primero;
			int ult = ultimo;
			int cen;
			cen = (pri + ult) / 2;
			double pivote = vector[cen];
			do
			{
				while (vector[pri] < pivote) pri++;
				while (vector[ult] > pivote) ult--;
				if(pri <= ult){
					int temp;
					temp = vector[pri];
					vector[pri] = vector[ult];
					vector[ult] = temp;
					pri++;
					ult--;
				}
			}
			while (pri <= ult);
			if(primero < ult){
				Organizar(vector, primero, ult);
			}
			if(pri < ultimo){
				Organizar(vector, pri, ultimo);
			}
		}
		private void Mostrar(){
			Console.Write("Este es el Vector");
			for (int i = 0; i < LongL; i++){
				Console.Write("{0} ", Vector[i]);
			}
		}
	}
}
