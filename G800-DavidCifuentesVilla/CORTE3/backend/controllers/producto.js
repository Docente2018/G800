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

        //Ejecuto el Metodo save en donde controlo los posibles valores mediante err, productoStored 
        producto.save((err, productoStored)=>{
            if(err) return res.status(500).send({message: 'Error al Guardar el Producto.'});
            
            if(!productoStored) return res.status(404).send({message: 'No se ha podido guardar el producto.'});
            
            return res.status(200).send({producto: productoStored})
        });
    },
    getProducto: function(req, res){
        var productoId = req.param('id');

        if(productoId == null) return res.status(404).send({message: 'ID del producto no informado'});

        Producto.findById(productoId, (err, producto)=>{
            if(err) return res.status(500).send({message: 'Error en devolver datos.'});
            if(!producto) return res.status(409).send({message: 'Producto Buscado No Existe'});
            return res.status(200).send({producto});
        });
    },
    getProductos: function(req, res){
        Producto.find({},(err, productos)=>{
            if(err) return res.status(500).send({message: 'Error al devolver los datos. '});
            if(!productos) return res.status(409).send({message: 'No hay datos a listar.'});
            return res.status(200).send({productos});
        })
    },
    updateProducto: function(req, res){
        var productoid = req.params.id;
        var update = req.body;

        Producto.findByIdAndUpdate(productoid, update, {new:true},(err, productoUpdated)=>{
            if(err) return res.status(500).send({message: 'Error al actualizar los datos.'});
            if(!productoUpdated) return res.status(409).send({message: 'No existe el producto a Actualizar.'});
            return res.status(200).send({productoUpdated});
        });
    },
    deleteProducto: function(req, res){
        var productoid = req.params.id;

        Producto.findByIdAndDelete(productoid, (err,productoDeleted) => {
            if(err) return res.status(500).send({message: 'Error al eliminar los datos.'});
            if(!productoDeleted) return res.status(409).send({message: 'No existe el producto a Eliminar.'});
            return res.status(200).send({productoDeleted});
        });
    }
};

module.exports = controller;