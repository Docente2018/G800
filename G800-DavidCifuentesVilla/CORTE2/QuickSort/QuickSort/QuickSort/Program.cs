using System;

namespace QuickSort
{
    class MainClass
    {
        public static void Main(string[] args)
        {
			Console.Write("Digite cual sera la longitud del vector");
			int Longitud = Int32.Parse(Console.ReadLine());
			Ordenamiento qs = new Ordenamiento(Longitud);
        }
    }
	class Ordenamiento{
		int LongL;
		int[] Vector;

		public Ordenamiento(int Long){
			LongL = Long;
			Vector = new int[LongL];
			for (int i = 0; i < LongL; i++)
            {
                Console.Write("Ingresa el valor {0}: ", i + 1);
				Vector[i] = Int32.Parse(Console.ReadLine());
            }
			Console.Write("Digita que metodo de ordenamiento deseas 1-QuicSort, 2-ShellSort");
			int metodo = Int32.Parse(Console.ReadLine());

			if(metodo == 1){
			    QuickSort(Vector, 0, LongL - 1);
			}
			else{
				if(metodo == 2){
					ShellSort(Vector);
				}
			}
           
			Mostrar();
		}
		private void QuickSort(int [] vector, int primero, int ultimo){
			int pri = primero;
			int ult = ultimo;
			int cen;
			cen = (pri + ult) / 2;
			double pivote = vector[cen];
			do
			{
				while (vector[pri] < pivote) 
					pri++;
				while (vector[ult] > pivote) 
					ult--;
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
				QuickSort(vector, primero, ult);
			}
			if(pri < ultimo){
				QuickSort(vector, pri, ultimo);
			}
		}
		private void Mostrar(){
			Console.Write("Este es el Vector");
			for (int i = 0; i < LongL; i++){
				Console.Write("{0} ", Vector[i]);
			}
		}

		private void ShellSort(int [] vector){
			int salto, aux, i;
			Boolean cambio;
			//Para el manejo del metodo shell se debe tomar la longitud del vector 
			for (salto = vector.Length / 2; salto != 0;salto/=2){
				cambio = true;
				while(cambio){
					cambio = false;
					for (i = salto; i < vector.Length; i++){
						if(vector[i-salto]>vector[i]){
							aux = vector[i];
							vector[i] = vector[i - salto];
							vector[i - salto] = aux;
							cambio = true;
						}
					}
				}
			}
		}
	}
}
