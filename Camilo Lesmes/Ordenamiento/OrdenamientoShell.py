# -*- coding:utf-8 -*-
def ordenamientoDeShell(unaLista):
    contadorSublistas = len(unaLista)//2
    while contadorSublistas > 0:

      for posicionInicio in range(contadorSublistas):
        brechaOrdenamientoPorInsercion(unaLista,posicionInicio,contadorSublistas)

      print("el espacio",contadorSublistas,"La lista es",unaLista)

      contadorSublistas = contadorSublistas // 2

def brechaOrdenamientoPorInsercion(unaLista,inicio,brecha):
    for i in range(inicio+brecha,len(unaLista),brecha):

        valorActual = unaLista[i]
        posicion = i

        while posicion>=brecha and unaLista[posicion-brecha]>valorActual:
            unaLista[posicion]=unaLista[posicion-brecha]
            posicion = posicion-brecha

        unaLista[posicion]=valorActual

unaLista = [54,26,93,17,77,31,44,55,20]
ordenamientoDeShell(unaLista)
print(unaLista)
