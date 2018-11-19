const mongoose = require('mongoose');
const { Schema } = mongoose;

const producto = new Schema({
    codigo: Number,
    nombre: String,
    categoria: String,
    stock: Number,
    precio: String
});

module.exports = mongoose.model('producto', producto);
