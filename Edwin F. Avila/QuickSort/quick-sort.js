//declaro la funcion recibe un arreglo
function quickSort(array) {

   //si el arreglo es menor que uno retornamos un arreglo vacio
  if (array.length < 1) {
    return "ingresa numeros para organizar";
  }

  //arreglo derecho, izquierdo y el pivote
  var left = [];
  var right = [];
  //agarramos el primer elemento del arreglo
  var pivot = array[0];


  //ahora comparamos todos los elementos del pivote en adelante 

  for (var i = 1; i < array.length; i++) {//creamos un for para que recorra el arreglo
    if (array[i] < pivot) {//si el array i es menor que el pivote
      left.push(array[i]); //entonces se añade a la izquierda 
    }
    else {//si i es mayor al pivot entonces añadimos a la derecha 
      right.push(array[i]);
    }
  }//ya hemos separado el arreglo de izquierda a derecha ahora lo concatenamos (recursion)

  //retormnammos la izquierda, concatenamos al pivote, luego concatenamos a la derecha ya ordenada.
  return [].concat(quickSort(left), pivot, quickSort(right));
}


//Ingresamos los datos que queremos ordenar 
console.log(quickSort([4, 9, 2, 1, 6, 3, 8])); // [1,2,3,4,6,8,9]