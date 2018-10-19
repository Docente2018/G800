
#Algoritmo de ordenamiento Shell
 
def shellsort (lista) : 
  """Ordena la lista por metodo Shell, o ShellSort"""
  incremento=len(lista)/2 
  while (incremento>0) : 
    for i in range(incremento,len(lista)) :
      j=i 
      temporal=lista[i] 
	      while ( (j>=incremento) and (lista[j-incremento]>temporal) ) :  
	        lista[j]=lista[j-incremento]
	        j=j-incremento
	      lista[j]=temporal 
	    if (incremento==2) : incremento=1 
	    else : incremento=int(incremento/2.2)
	  return lista