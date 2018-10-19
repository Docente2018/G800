def quicksort(array):

    # se definen 3 array
    menores = []
    iguales = []
    mayores = []

    # if el tamaño del array es mayor a 1
    if len(array) > 1:
        # al pivot se le asigna el primer elemento del array
        pivot = array[0]
        
        for x in array:
				# Si el elemento es menor al pivote se agrega el elemento al array de menores
            if x < pivot:
                menores.append(x)
            if x == pivot:
				# Si el elemento es mayor al pivote se agrega el elemento al array de mayores
                iguales.append(x)
            if x > pivot:
				# Si el elemento es igual al pivote se agrega el elemento al array de igual
                mayores.append(x)
        
        return quicksort(menores)+iguales+quicksort(mayores) 
    
    else:  
        return array


print(quicksort([3,6,10,56,1,50,30,2]))