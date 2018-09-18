/*
    Se crean variables globales que luego se iran cambiando
    sus valores en el while
*/
var numFinish = 0;
var uno = 0;
var dos = 0;
var suma = 0;
var res = 0;
var cont = 30;
/*
    Se valida si es un numero para hacer el ciclo
    si no simplemente mandara un console.log informando al cliente
    que no se ha podido crear el ciclo debido a que no es un numero
*/
if (Number.isInteger(cont)) {
    /*
        Crear un ciclo para sacar los numeros de  Fibonacci
    */
    while (suma <= (cont - 1)) {
        /*
            Valida si los dos numeros son ceros para inicializarlos
            y asi empezar a sacar los numeros
        */
        if (uno === 0 && dos === 0) {
            console.log(uno);
            uno = 1;
        }
        //Suma y mostrar los numeros en consola
        res = uno + dos;
        console.log(res);
        uno = dos;
        dos = res;
        suma++;
    }
}
else {
    //mostrar mensaje al cliente que no se pudo ya que no es de tipo numerico.
    console.log("NO ES UN NUMERO");
}
