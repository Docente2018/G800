var express = require('express');
//Cro un objeto de tipo controllador con las configuraciones del controlador producto
var ProductoController = require('../controllers/producto');

//creo un objeto de tipo Router
var router = express.Router();

//para el objeto creado genero las rutas que desee y las referencio a cada uno de las fuction correspondientes en el controlador
router.get('/home', ProductoController.home);
router.post('/test', ProductoController.test);
router.post('/save-producto', ProductoController.saveProducto);

module.exports = router;