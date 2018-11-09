from biz.Menu import Menu
from biz.MenuAlgoritmos import MenuAlgoritmos

stay = True
menu = Menu()

while(stay):
    menu_algoritmos = MenuAlgoritmos( menu.print_main_menu() )
    menu_algoritmos.object_switcher()
    #menu_algoritmos.print_object_attributes()
    if( int(input("Presione 1 para reiniciar, 0 para salir: ")) == 0 ):
        stay = False