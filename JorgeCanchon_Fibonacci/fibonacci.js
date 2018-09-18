const fibonacci = numero => {
  try{
    //Declaración variables temporales
    let temp1 = 1, res = 1, temp2 = 0
    //Verifica si el dato ingresado es valido
    if(isNaN(parseInt(numero)) || numero < 0){
     console.log('Ingrese un número válido')
     return ;
    }
    //varifica si el número es 1
    if(numero == 0){
       console.log(numero)
       return
    }
    console.log(0)
    //Iteración hasta el número ingresado
    for(let i=0;i<=numero;i++){
      console.log(res)
       //Se suma los dos primeros valores (1,1) y se almacenan en res
       res = temp1 + temp2
       //Se asigna la primera variable a la segunda variable
       temp2 = temp1
       //Se asigna la suma a la segunda variable
       temp1 = res
    }
  }catch(e){
    console.log("Ingrese número válido")
  }
}
//Se llama a la función
fibonacci(5)