//El tipo de servidor va ser Express, por lo cual nos traemos el modulo requerido
var express = require('express');
//El modulo body-parser sera usado mas adelante para mapeo de req res de las peticiones al servicio
var bodyParser = require('body-parser');
//creamos un variable el cual contendra el modulo express
var app = express();

//Cargar archivo de Rutas, para manejo de MVC creo un js con la definicion de las rutas a manejar, en este caso cada js sera para cada coleccion del MongoDB
var producto_routes = require('./routes/producto');
var general_routes = require('./routes/general');

//Middlewares capa que se ejecuta antes del controlador, se usa el modulo body-parser para declarar que toda respuesta recibida en el servicio se dara en formato Json
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());

//Crear Ruta Generar producto seguido de las rutas contenidas en el archivo de rutas
app.use('/appfinal', producto_routes);
// app.use('/',general_routes);

//Exportar mediante module.export para poder acceder a mi objeto app en todo el projecto
module.exports = app;