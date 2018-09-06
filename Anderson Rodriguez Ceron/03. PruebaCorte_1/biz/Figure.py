from abc import ABC, abstractmethod


class Figure(ABC):

    def __init__(self, name="", area=0, perimeter=0):
        self.__name = name
        self.__area = area
        self.__perimeter = perimeter

    @property  # Este metodo funciona como establecerNombreFigura()
    def name(self):
        return self.__name

    @name.setter  # Este metodo funciona como obtenerNombreFigura()
    def name(self, new_name):
        self.__name = new_name

    @property  # Este metodo funciona como obtenerArea()
    def area(self):
        return self.__area

    @area.setter
    def area(self, new_area):
        self.__area = new_area

    @property  # Este metodo funciona como obtenerPerim()
    def perimeter(self):
        return self.__perimeter

    @perimeter.setter
    def perimeter(self, new_perimeter):
        self.__perimeter = new_perimeter

    @abstractmethod
    def calculateArea(self):
        pass

    @abstractmethod
    def calculatePerimeter(self):
        pass
