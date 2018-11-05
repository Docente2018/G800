const express = require('express')
const router = express.Router()
const cors = require('cors')

const postModel = require('../models/post.model');

router.get('/', async (req, res)=> {
    const posts = await postModel.find().sort({'dateCreated': -1});
    res.json(posts);
});


router.get('/:id',  async (req, res)=> {
    await postModel.findById(req.params.id)
        .then(post => {
            if (post) {
                res.json(post);
            }
            else {
                res.status(204).json({});
            }
        })
        .catch(error => {
            res
                .status(500)
                .json(error);
        })
    
});


router.post('/', async (req, res)=> {
    const post = new postModel(req.body);
    post.dateCreated = new Date();
    await post.save();
    res.json(post);
});


router.put('/:id', async (req, res)=> {
    await postModel.findByIdAndUpdate(req.params.id, req.body);
    const post = await postModel.findById(req.params.id);
    res.json(post);
});


router.delete('/:id', async (req, res)=> {
    await postModel.findByIdAndRemove(req.params.id);
    res.json({
        'message': 'post remove'
    });
});

module.exports = router;