var express = require('express');
//creo una variable de tipo Router
var router = express.Router();

//Defino cada una de las rutas las cuales podran ser consumidas el enlace seria http://localhost/3000/Ruta Definida
//Para cada una de ellas recibo un req y res
//Prueba del servicio se realiza consumo get a la URL postmanGet esta mediante el rea.status dara respuesta 200 y mediante el send reterna un body de respuesta
router.get('/postmanGet', (req, res)=>{
    res.status(200).send(
        'Peticion realizada Postman Get'
    )
});

//Prueba de POST mediante un :id, esta para asber como controlar el req de la peticion campo a campo ya sea por body o parametros de la url
router.post('/postmanPost/:id', (req, res)=>{
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

module.exports = router;