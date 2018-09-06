from biz.Figure import Figure
import math

class Circle(Figure):

    def __init__(self, name, radius):
        super().__init__(name)
        self.__radius = radius
        self.calculateArea()
        self.calculatePerimeter()

    @property
    def radius(self):
        return self.__radius

    @radius.setter
    def radius(self, new_radius):
        self.__radius = new_radius

    def calculateArea(self):
        self.area = ((2*math.pi)*(self.__radius**2))

    def calculatePerimeter(self):
        self.perimeter = (math.pi * self.__radius)