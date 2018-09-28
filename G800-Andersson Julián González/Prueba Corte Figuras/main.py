import Operacion

x=0
while x < 5:
  try:
    print("Seleccione la Figura")

    print("1. Triangulo")

    print("2. Cuadrado")

    print("3. Circulo")

    print("4. Retangulo")

    print("5. Fin")



    x=int(input("Escoga la Figura"))

    if x==1:
      base=int(input("Inserte la base del Triangulo"))
      altura=int(input("Inserte la altura del Triangulo"))
      ladoA=int(input("Inserte el lado A del triangulo"))
      ladoB=int(input("Inserte el lado B del triangulo"))
      ladoC=int(input("Inserte el lado C del triangulo"))
      Operacion.areaTriangulo(base,altura)
      Operacion.perimetroTriangulo(ladoA,ladoB,ladoC)


    elif x==2:
      lado=int(input("Inserte el lado del Cuadrado"))
      Operacion.areaCuadrado(lado)
      Operacion.perimetroCuadrado(lado)

    elif x==3:
      radio=int(input("Inserte el radio del Circulo"))
      Operacion.areaCirculo(radio)
      Operacion.perimetroCirculo(radio)

    elif x==4:
      base=int(input("Inserte la base del Rectangulo"))
      altura=int(input("Inserte la altura del Rectangulo"))
      Operacion.areaRectangulo(base,altura)
      Operacion.perimetroRectangulo(base,altura)

  except:
    print("Ingrese un valor válido!!")
    continue

