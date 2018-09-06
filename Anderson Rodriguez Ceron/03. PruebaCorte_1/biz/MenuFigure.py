from biz.Triangle import Triangle
from biz.Square import Square
from biz.Rectangle import Rectangle
from biz.Circle import Circle

from biz.Menu import Menu

class MenuFigure(Menu):

    def __init__(self, selected_figure):
        super().__init__()
        self.__selected_figure = selected_figure
        self.__object_figure = None

    def set_inputs_triangle(self):
        name = 'Triángulo'
        base = int(input("Ingrese la base del triángulo: "))
        high = int(input("Ingrese la altura del triángulo: "))
        side_a = int(input("Ingrese el lado a del triángulo: "))
        side_b = int(input("Ingrese el lado b del triángulo: "))
        side_c = int(input("Ingrese el lado c del triángulo: "))
        return {'name':name, 'base':base, 'high':high, 'side_a':side_a,
                'side_b':side_b, 'side_c':side_c}


    def object_switcher(self):

        if self.__selected_figure == 1:
            self.__object_figure = Triangle(self.set_inputs_triangle())
        elif self.__selected_figure == 2:
            side = int(input("Ingrese el lado del cuadrado: "))
            self.__object_figure = Square('Cuadrado', side)
        elif self.__selected_figure == 3:
            base = int(input("Ingrese la base del rectángulo: "))
            high = int(input("Ingrese la altura del rectángulo: "))
            self.__object_figure = Rectangle('Rectángulo', base, high)
        elif self.__selected_figure == 4:
            radius = int(input("Ingrese el radio del círculo: "))
            self.__object_figure = Circle('Círculo', radius)

    def print_object_attributes(self):
        print("\n"*100)
        print(super().title)
        print("La figura: {}.\n"
              "Tiene un area de: {}.\n"
              "Tiene un perimetro de: {}.\n".format(self.__object_figure.name,
                                                    self.__object_figure.area,
                                                    self.__object_figure.perimeter))
        self.__object_figure = None
