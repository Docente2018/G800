class Menu:

    def __init__(self):
        self.__title =  '   _   _   _     _     _   _   _   _     \n ' \
                        ' / \ / \ / \   / \   / \ / \ / \ / \ \n ' \
                        '(ALGORITMOS ) (DE ) (ORDENAMIENTO   )\n ' \
                        ' \_/ \_/ \_/   \_/   \_/ \_/ \_/ \_/ '

        self.__figure_menu =    "1. QuickSort\n" \
                                "2. Shell\n" \
                                "3. HeapSort\n" \
                                "4. Fín"

        self.__flag = True

        self.__input_option = 9999

    @property
    def title(self):
        return self.__title

    def figure_switcher(self):
        switcher = {
            1: "QuickSort",
            2: "Shell",
            3: "HeapSort",
            4: "Fin"
        }
        return bool(switcher.get(self.__input_option, False))

    def print_main_menu(self):

        while (self.__flag):

            print(self.__title)
            print(self.__figure_menu)
            try:
                self.__input_option = int(input('\nPor favor seleccione una opción: '))
            except ValueError:
                pass

            if (not self.figure_switcher()):
                print('\n' * 100)
                print("Opción inválida, por favor seleccione nuevamente!\n")
            elif (self.__input_option == 4):
                break
            else:
                return self.__input_option