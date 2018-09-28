from biz.Menu import Menu
from biz.MenuFigure import MenuFigure

stay = True
menu = Menu()

while(stay):
    menu_figure = MenuFigure( menu.print_main_menu() )
    menu_figure.object_switcher()
    menu_figure.print_object_attributes()
    if( int(input("Presione 1 para reiniciar, 0 para salir: ")) == 0 ):
        stay = False




