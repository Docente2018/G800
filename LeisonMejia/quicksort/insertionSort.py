import random

def insertionSort(lista):
   for index in range(1,len(lista)):

     valorActual = lista[index]
     posicion = index

     while posicion>0 and lista[posicion-1]>valorActual:
         lista[posicion]=lista[posicion-1]
         posicion = posicion-1

     lista[posicion]=valorActual

lista = random.sample(range(0, 20), 10)
#lista = [54,26,93,17,77,31,44,55,20]
print("lista a ordenar: ", lista);
insertionSort(lista)
print("lista ordenada: ", lista)