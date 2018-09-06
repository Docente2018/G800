from biz.Figure import Figure

class Triangle(Figure):

  def __init__(self, kwargs):
    super().__init__(kwargs.get('name'))
    self.__base   = kwargs.get('base')
    self.__high   = kwargs.get('high')
    self.__side_a = kwargs.get('side_a')
    self.__side_b = kwargs.get('side_b')
    self.__side_c = kwargs.get('side_c')
    self.calculateArea()
    self.calculatePerimeter()

  @property
  def base(self):
    return self.__base

  @base.setter #Este metodo funciona como establecerBaseTria()
  def base(self, new_base):
    self.__base = new_base

  @property
  def high(self):
    return self.__high

  @high.setter #Este metodo funciona como establecerAlturaTria()
  def high(self, new_high):
    self.__high = new_high

  @property
  def side_a(self):
    return self.__side_a

  @side_a.setter #Este metodo funciona como establecerLadoA()
  def side_a(self, new_side_a):
    self.__side_a = new_side_a

  @property
  def side_b(self):
    return self.__side_b

  @side_b.setter #Este metodo funciona como establecerLadoB()
  def side_b(self, new_side_b):
    self.__side_b = new_side_b

  @property
  def side_c(self):
    return self.__side_c

  @side_c.setter #Este metodo funciona como establecerLadoC()
  def side_c(self, new_side_c):
    self.__side_c = new_side_c

  def calculateArea(self):
    self.area = (self.__base*self.__high)/2

  def calculatePerimeter(self):
    self.perimeter = (self.__side_a + self.__side_b + self.__side_c)