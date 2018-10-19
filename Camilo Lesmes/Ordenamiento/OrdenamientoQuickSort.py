def quicksort(lista,izq,der):
    i=izq
    j=der
    x=lista[(izq + der)/2]
 
    while( i <= j ):
        while lista[i]<x and j<=der:
            i=i+1
        while x<lista[j] and j>izq:
            j=j-1
        if i<=j:
            aux = lista[i]; lista[i] = lista[j]; lista[j] = aux;
            i=i+1;  j=j-1;
 
        if izq < j:
        quicksort( lista, izq, j );
    if i < der:
        quicksort( lista, i, der );
def imprimeLista(lista,tam):
    for i in range(0,tam):
        print lista[i]
 
def leeLista():
    lista=[]
    cn=int(raw_input("Cantidad de numeros a ingresar: "))
 
    for i in range(0,cn):
        lista.append(int(raw_input("Ingrese numero %d : " % i)))
    return lista
 
A=leeLista()
quicksort(A,0,len(A)-1)
imprimeLista(A,len(A))