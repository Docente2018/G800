from biz.QuickSort import QuickSort
from biz.Shell import Shell
from biz.HeapSort import HeapSort
from biz.Menu import Menu

class MenuAlgoritmos(Menu):

    def __init__(self, selected_figure):
        super().__init__()
        self.__selected_figure = selected_figure
        self.__object_algorithm = None

    def object_switcher(self):

        if self.__selected_figure == 1:
            self.__object_algorithm = QuickSort()
        elif self.__selected_figure == 2:
            self.__object_algorithm = Shell()
        elif self.__selected_figure == 3:
            self.__object_algorithm = HeapSort()