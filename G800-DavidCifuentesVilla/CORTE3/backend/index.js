//Modulo de Mongoose para proceso de conexion a MongoDB
var mongoose = require('mongoose');
//Se importa el archivo app.js el cual contendra la configuracion del servidor: Rutas, Middleware, etc
var app = require('./app');
//Se define la Ruta de conexion al MongoDB y la Base de datos a trabajar
var URL = 'mongodb://localhost:27017/appfinal';
//Se define el puerto que sera usado para la conexion al servidor por donde se escucharan todas las peticiones Rest
var portServer = 3000;

//
mongoose.Promise = global.Promise;

//Se realiza la coneccion mediante el modulo de mongoose a la URL  de MongoDB del servidor Local
mongoose.connect(URL)
    //Para control de respuesta usamos Then Catch
    //El ingreso al then se da cuando la conexion mediante Mongoose se da correctamente
    .then(()=>{
        console.log('Conexion a DB establecida satisfactoriamente');
        // Creacion del servidor
        app.listen(portServer, ()=>{
            console.log('Servidor Corriendo correctamente en la url Localhost:'+portServer);
        })
    })
    //En el caso de que la conexion no se de correctamente se imprimira el error por consola 
    .catch(err => console.log(err));