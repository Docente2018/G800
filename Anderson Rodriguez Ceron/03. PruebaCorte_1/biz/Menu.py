class Menu:

    def __init__(self):
        self.__title =  '   _   _   _   _   _     _     _   _   _   _   _   _   _   _   _   _  \n ' \
                        ' / \ / \ / \ / \ / \   / \   / \ / \ / \ / \ / \ / \ / \ / \ / \ / \ \n ' \
                        '( A | R | E | A | S ) ( Y ) ( P | E | R | I | M | E | T | R | O | S )\n ' \
                        ' \_/ \_/ \_/ \_/ \_/   \_/   \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ '

        self.__figure_menu =    "1. Triángulo\n" \
                                "2. Cuadrado\n" \
                                "3. Rectángulo\n" \
                                "4. Círculo\n" \
                                "5. Fín"

        self.__flag = True

        self.__input_option = 9999

    @property
    def title(self):
        return self.__title

    def figure_switcher(self):
        switcher = {
            1: "Triángulo",
            2: "Cuadrado",
            3: "Rectángulo",
            4: "Círculo",
            5: "Fin"
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
            elif (self.__input_option == 5):
                break
            else:
                return self.__input_option