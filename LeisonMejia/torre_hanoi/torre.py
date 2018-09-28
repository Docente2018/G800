'''
    Ecuacion para hallar la torre auxiliar donde se alojaran los discos mientras
    se pasan los demas = 6 - torre_inicio_disco - torre_final_disco

      constante    torre_inicial   torre_final     torre_auxiliar
          6             1               3                   2
          6             2               3                   1
'''

cantidad_movimientos = 0

def torre_hanoi(numero_disco, inicio = 1, fin = 3):    
    if numero_disco > 0: 
        global cantidad_movimientos
        cantidad_movimientos += 1

        torre_hanoi(numero_disco -1, inicio, 6 - inicio - fin) # de la actual a la auxiliar
        print("Mueve el disco ", numero_disco ," de la torre ", inicio, " a la torre ", fin)
        torre_hanoi(numero_disco -1, 6 - inicio - fin, fin) # de la auxiliar a la final


discos = int(input("Ingresa el numero de discos:"))

if(discos < 1):
    print("La cantidad de discos debe ser mayor a 0")
else:
    torre_hanoi(discos)
    print("La solucion se realizo con ", cantidad_movimientos, " movimientos")

'''
(2, 1, 2), (1, 1, 3), (0, 1, 2)

'''