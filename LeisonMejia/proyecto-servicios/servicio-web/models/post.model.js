const mongoose = require('mongoose')
const { Schema } = mongoose;

const post = new Schema({
    title: String,
    content: String,
    imgUrl: String,
    colorTitle: String,
    dateCreated: Date
});

module.exports = mongoose.model('posts', post);