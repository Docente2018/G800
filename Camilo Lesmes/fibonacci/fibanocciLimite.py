rango = 0
intentoLimite = 0

def fibonacci():
  if intentoLimite == 3:
    print("Excedio el limite de intentos")
    exit()
  rango = 0
  while(rango < 1):
    try:
      rango = input("Digite el rango: ")
      for Sucesion in range(0,rango):
        rango = int(rango)
        valor1 = 1
        valor2 = 0
        valorFinal = 0
        valorFinal = valor2
        valor2 = valor1
        valor1 = valorFinal + valor2
        print(Sucesion,"--",valor1)
    except:
        global intentoLimite 
        intentoLimite += 1  
        print("Ingreso un caracter incorrecto, Debe ingresar un numero correcto")
fibonacci()
