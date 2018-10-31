//Creo un objeto de tipo model producto o Schema
var Producto = require('../models/producto');

//Para la variable controller defino cada fuction correspondiente a la url deseada, y en cada una de ellas defino la logica requerida
var controller = {
    home: function(req, res){
        return res.status(200).send({
            message: 'Entro a Home'
        });
    },
    test: function(req, res){
        return res.status(200).send({
            message: 'Entro metodo controlador test de producto' 
        });
    },
    saveProducto: function(req, res){
        //Instancio mi objeto producto en el va recibir los valores campo a campo del req
        var producto = new Producto();

        //creo la variable params el cual recibe el cuerpo de la solicitud
        var params = req.body;

        //Lleno mi objeto producto de tipo Schema campo a campo
        producto.estado = params.estado;
        producto.nombre = params.nombre;
        producto.precio = params.precio;
        producto.cantidad = params.cantidad;
        producto.id = params.id;

        //Ejecuto el Metodo save en donde controlo los posibles valores mediante err, productoStored 
        producto.save((err, productoStored)=>{
            if(err) return res.status(500).send({message: 'Error al Guardar el Producto.'});
            
            if(!productoStored) return res.status(404).send({message: 'No se ha podido guardar el producto.'});
            
            return res.status(200).send({producto: productoStored})
        });
    }
};

module.exports = controller;