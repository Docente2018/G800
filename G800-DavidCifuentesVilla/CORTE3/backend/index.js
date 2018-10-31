var mongoose = require('mongoose');
var app = require('./app');
var URL = 'mongodb://localhost:27017/appfinal';
var portServer = 3000;



mongoose.Promise = global.Promise;

mongoose.connect(URL)
    .then(()=>{
        console.log('Conexion a DB establecida satisfactoriamente');
        // Creacion del servidor
        app.listen(portServer, ()=>{
            console.log('Servidor Corriendo correctamente en la url Localhost:'+portServer);
        })
    })
    .catch(err => console.log(err));