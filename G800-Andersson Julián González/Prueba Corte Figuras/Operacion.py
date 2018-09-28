import math



def areaTriangulo(base,altura):
  area= (base*altura)/2
  print('El área del triangulo es:', area)

def perimetroTriangulo(ladoA,ladoB,ladoC):
  perimetro= ladoA*ladoB*ladoC
  print('El perimetro del triangulo es:', perimetro)


def areaCuadrado(lado):
  area= math.pow(lado, 2)
  print('El área del cuadrado es:', area)

def perimetroCuadrado(lado):
  perimetro= 4*lado
  print('El perimetro del Cuadrado es:', perimetro)

def areaCirculo(radio):
  area= math.pow(math.pi*radio,2)
  print('El área del Circulo es:', area)

def perimetroCirculo(radio):
  perimetro= 2*math.pi*radio
  print('El perimetro del Circulo es:', perimetro)

def areaRectangulo(base,altura):
  area= base*altura
  print('El área del Rectangulo es:', area)

def perimetroRectangulo(base,altura):
   perimetro= 2*(base+altura)
   print('El perimetro del Rectangulo es:', perimetro)
