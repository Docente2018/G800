from biz.Figure import Figure

class Rectangle(Figure):

    def __init__(self, name, base, high):
        super().__init__(name)
        self.__base = base
        self.__high = high
        self.calculateArea()
        self.calculatePerimeter()

    @property
    def base(self):
        return self.__base

    @base.setter #Este metodo funciona como establecerBaseRecta()
    def base(self, new_base):
        self.__base = new_base

    @property
    def high(self):
        return self.__high

    @high.setter #Este metodo funciona como establecerAlturaRecta()
    def high(self, new_high):
        self.__high = new_high

    def calculateArea(self):
        self.area = ( self.__base * self.__high )

    def calculatePerimeter(self):
        self.perimeter = ( (self.__base*2) + (self.__high*2) )