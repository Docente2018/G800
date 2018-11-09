var mongoose = require('mongoose');
var Schema = mongoose.Schema;

//Creo el modelo o Schema necesario para CRUD de MongoDB
//Defino que el productoSchema va ser de estructura JSON, y le defino cada uno de sus posibles atributos
var ProductoSchema = Schema({
    estado: Number,
    nombre: String,
    precio: Number,
    cantidad: Number
});

//Exporto mediante mongoose.model en donde referencio a que collection realacion y que Schema usa
module.exports = mongoose.model('Producto', ProductoSchema);