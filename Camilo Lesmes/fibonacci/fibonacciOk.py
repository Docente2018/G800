rango = 0
intentoLimite = 0

while rango < 1000000000000000000000000000000000000000000000000000000000000000000:
	try:
		rango = input("Digite el rango: ")
		rango = int(rango)
		valor1 = 1
		valor2 = 0
		valorFinal = 0

		for Sucesion in range(0,rango):
			valorFinal = valor2
			valor2 = valor1
			valor1 = valorFinal + valor2
			print(Sucesion,"--",valor1)


	except:
		print("Ingrese un valor válido!!")
		exit()
