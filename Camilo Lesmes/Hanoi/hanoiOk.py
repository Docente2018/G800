"""
Inicio Fin Aux
1      3   2
3      1   2
1      2   3
2      1   3
2      3   1
3      2   1

"""

def hanoi (numero_discos, inicio = 1, fin = 3):
	if numero_discos :
		hanoi(numero_discos-1, inicio, 6-inicio-fin) # de la actual a la auxiliar
		print "Mueve el disco %d de la torre %d a la torre %d %(numero_discos,inicio,fin)"
		hanoi(numero_discos-1,6-inicio-fin,fin)%de la auxiliar a la final
hanoi(numero_discos=4)