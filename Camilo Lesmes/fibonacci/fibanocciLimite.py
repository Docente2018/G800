intentos = 0

def obtener():
  if intentos == 3:
    print"a excedido el numero de intentos"
    exit()
  valor1 = 1
  valor2 = 0
  valorFinal = 0
  limite = 0
  i = 0
  rango = 0
  try:
    rango = input("Digite el rango: ")
  except:
    global intentos
    intentos +=1
    print("Ingrese un valor válido!!")
    obterner()
  for Sucesion in range(0,rango):
    valor1 = valorFinal + valor2
    valorFinal = valor2
    valor2 = valor1
    print(i,"--",valor1)
    i += 1
obtener()
