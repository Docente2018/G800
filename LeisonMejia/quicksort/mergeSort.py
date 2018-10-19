import random

def mergeSort(lista):
    if len(lista)>1:
        media = len(lista)//2
        izquierda = lista[:media]
        derecha = lista[media:]

        mergeSort(izquierda)
        mergeSort(derecha)

        i=0
        j=0
        k=0
        while i < len(izquierda) and j < len(derecha):
            if izquierda[i] < derecha[j]:
                lista[k]=izquierda[i]
                i=i+1
            else:
                lista[k]=derecha[j]
                j=j+1
            k=k+1

        while i < len(izquierda):
            lista[k]=izquierda[i]
            i=i+1
            k=k+1

        while j < len(derecha):
            lista[k]=derecha[j]
            j=j+1
            k=k+1
    
    return lista;

lista = random.sample(range(0, 20), 10)
print("lista a ordenar:", lista)
print("lista ordenada",mergeSort(lista))

