var express = require('express');
var bodyParser = require('body-parser');

var app = express();

//Cargar archivo de Rutas

//Middlewares capa que se ejecuta antes del controlador
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());
//Cors

//Rutas
app.get('/postmanGet', (req, res)=>{
    res.status(200).send(
        'Peticion realizada Postman Get'
    )
});

app.post('/postmanPost/:id', (req, res)=>{
    res.status(200).send({
        persona: [
            {
                nombre: req.body.nombre,
                apellido: req.body.apellido,
                parametro: req.param('data'),
                id: req.param('id')
            }
        ]
    })
});


//Exportar
module.exports = app;