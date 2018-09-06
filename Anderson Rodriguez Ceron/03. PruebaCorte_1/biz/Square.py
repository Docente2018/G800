from biz.Figure import Figure

class Square(Figure):

  def __init__(self, name, side):
    super().__init__(name)
    self.__side = side
    self.calculateArea()
    self.calculatePerimeter()

  @property
  def side(self):
    return self.__side

  @side.setter #Este metodo funciona como establecerLadoCuad()
  def side(self, new_side):
    self.__side = new_side

  def calculateArea(self):
    self.area = (self.__side**2)

  def calculatePerimeter(self):
    self.perimeter = (self.__side*4)