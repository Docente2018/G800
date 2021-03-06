var express = require('express');
//Cro un objeto de tipo controllador con las configuraciones del controlador producto
var ProductoController = require('../controllers/producto');

//creo un objeto de tipo Router
var router = express.Router();

var cors = require('cors');

var corsOptions = {
    origin: 'http://localhost:4200'
}

//para el objeto creado genero las rutas que desee y las referencio a cada uno de las fuction correspondientes en el controlador
router.get('/producto/home', ProductoController.home);
router.post('/producto/test', ProductoController.test);
router.post('/producto/save-producto', cors(corsOptions), ProductoController.saveProducto);
router.get('/producto/:id?',cors(corsOptions), ProductoController.getProducto);
router.get('/productos',cors(corsOptions), ProductoController.getProductos);
router.put('/producto/:id',cors(corsOptions), ProductoController.updateProducto);
router.delete('/producto/:id', ProductoController.deleteProducto);

module.exports = router;