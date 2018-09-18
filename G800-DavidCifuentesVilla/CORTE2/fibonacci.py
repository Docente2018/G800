#Ejercicio Fibonassi Mediante While
print "Ejercicio Mediante While"

intentos = 0  #Defino la variable de intentos

def obtenerNumero():  #Defino una funcion obtenerNUmero la cual va ser repetida mediante el trycatch
    if intentos == 3:  #Valido que la cantidad de limites sea menor a 3, al serlo genera error y sale de la funcion
        print "Excedio el limite de intentos"
        exit()
    num1 = 0  #Defino variable num1 inicializandola en 0
    num2 = 1  #Defino variable num1 inicializandola en 1
    num3 = 0  #Defino variable num1 inicializandola en 0
    i = 0  #Defino variable I inicializandola en 0 
    fibonacci = []  #Creo un array de tipo lista
    fibonacci.append(num1)  #Agrego mediante la sentencia append el valor de la variable num1
    fibonacci.append(num2)  #Agrego mediante la sentencia append el valor de la variable num2
    limite = 0
    try:
        limite = input("Ingrese el numero limite: " )  #Defino variable limite el cual recibira el valor por consola    
    except:
        global intentos  #Accedo a la variable de intentos global definida en la linea 4
        intentos += 1    # Sumo un intento a la varibale
        print "Ingreso un caracter incorrecto, Debe ingresar un numero correcto"
        obtenerNumero()  #Vuelvo a ejecutar la misma funcion
    

    while i <= limite:  #creo un while el cual sera controlado mediante la i iniciando en 0 mientras que esta sea menor o igual al limite valor ingresado
        num3 = num1 + num2  #Agrego la suma de los dos numeros num1 y num2 a la variable num3
        fibonacci.append(num3)  #Agrego mi suma num3 a el array de tipo lista
        num1 = num2  #Almaceno el valor del num2 al num1
        num2 = num3  #Almaceno el valor del num3 al num2
        i += 1       #Aumento en 1 la variable i para continuar con cada iteracion

    #despues de que mi array este lleno creo la un nuevo for desde i = 0 hasta el range que sera mi limite
    for i in range(limite): 
        print fibonacci[i]  #Imprimo cada una de las posiciones

obtenerNumero()  #Ejecuto la funcion
