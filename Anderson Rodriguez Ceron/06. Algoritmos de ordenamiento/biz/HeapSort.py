import math

class HeapSort:

    def __init__(self):
        self.ejecutarQuickSort()

    def heapAlgoritmo(self, a, i, n):
        izq = -1
        if (2 * i <= n):
            izq = 2 * i

        der = -1
        if 2 * i + 1 <= n:
            der = 2 * i + 1

        if (izq == -1 and der == -1):
            return a
        else:
            if (der == -1):
                if a[i - 1] < a[2 * i - 1]:
                    aux = a[i - 1]
                    a[i - 1] = a[2 * i - 1]
                    a[2 * i - 1] = aux
                    return self.heapAlgoritmo(a, izq, n)
                else:
                    return a
            else:
                if a[2 * i - 1] > a[2 * i + 1 - 1]:
                    if a[2 * i - 1] > a[i - 1]:
                        aux = a[i - 1]
                        a[i - 1] = a[2 * i - 1]
                        a[2 * i - 1] = aux
                        return self.heapAlgoritmo(a, izq, n)
                    else:
                        return a
                else:
                    if a[2 * i - 1 + 1] > a[i - 1]:
                        aux = a[i - 1]
                        a[i - 1] = a[2 * i - 1 + 1]
                        a[2 * i - 1 + 1] = aux
                        return self.heapAlgoritmo(a, der, n)
                    else:
                        return a


    def monticulo(self, a):
        n = len(a)
        mitad = math.floor(n)

        for i in range(mitad, 0, -1):
            a = self.heapAlgoritmo(a, i, n)

        return a


    def heapSortAlgo(self, a):
        n = len(a)
        c = self.monticulo(a)
        for i in range(1, n + 1):
            aux = c[0]
            c[0] = c[n - 1]
            c[n - 1] = aux
            n -= 1
            c = self.heapAlgoritmo(a, 1, n)

        return c

    def leeLista(self):
        lista = []
        cn = int(input("Cantidad de numeros a ingresar: "))

        for i in range(0, cn):
            lista.append(int(input("Ingrese numero %d : " % (i+1))))
        return lista

    def ejecutarQuickSort(self):
        a = self.leeLista()
        f = self.heapSortAlgo(a)
        print("Ordenado", f)