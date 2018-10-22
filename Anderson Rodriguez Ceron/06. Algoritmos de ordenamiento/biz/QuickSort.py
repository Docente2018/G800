class QuickSort:

    def __init__(self):
        self.ejecutarQuickSort()

    def quicksort(self, lista, izq, der):
        i = izq
        j = der
        x = lista[int((izq + der) / 2)]

        while (i <= j):
            while lista[i] < x and j <= der:
                i = i + 1
            while x < lista[j] and j > izq:
                j = j - 1
            if i <= j:
                aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
                i = i + 1;
                j = j - 1;

            if izq < j:
                self.quicksort(lista, izq, j);
        if i < der:
            self.quicksort(lista, i, der);

    def imprimeLista(self, lista, tam):
        print(lista)

    def leeLista(self):
        lista = []
        cn = int(input("Cantidad de numeros a ingresar: "))

        for i in range(0, cn):
            lista.append(int(input("Ingrese numero %d : " % (i + 1))))
        return lista

    def ejecutarQuickSort(self):
        print('\n' * 100)
        A = self.leeLista()
        self.quicksort(A, 0, len(A) - 1)
        self.imprimeLista(A, len(A))