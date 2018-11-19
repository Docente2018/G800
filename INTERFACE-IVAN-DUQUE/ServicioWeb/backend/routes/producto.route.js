const express = require('express');
const router = express.Router();

const producto = require('../models/producto.model');

router.get('/', async (req, res) => {
    let productosEncontrados = await producto.find();
    res.json(productosEncontrados)
        .status(200);
});

router.get('/:id', async (req, res) => {
    let productoEncontrado = await producto.findById(req.params.id);
    res.json(productoEncontrado)
        .status(200);
});

router.post('/', async (req, res) => {
    let productoNuevo = new producto(req.body);
    await productoNuevo.save();
    res.json({
        "status": "created"
    })
    .status(200);
});


router.put('/:id', async (req, res) => {
    await producto.findByIdAndUpdate(req.params.id, req.body);
    res.json({
        "status": "updated"
    })
    .status(200);
});


router.delete('/:id', async (req, res) => {
    await producto.findByIdAndRemove(req.params.id);
    res.json({
        "status": "removed"
    })
    .status(200);
});

module.exports = router;