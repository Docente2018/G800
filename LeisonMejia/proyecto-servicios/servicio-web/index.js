const express = require('express')
const mongoose = require('mongoose')
const morgan = require('morgan')
const app = express()

app.set('port', process.env.PORT || 3000)
app.use(express.json())
app.use(express.static(`${__dirname}/public`))
app.use(morgan('tiny'))

// routes
app.use('/api/post', require('./routes/post.route'))

mongoose.connect('mongodb://owner:owner123@ds151393.mlab.com:51393/db-universidad', {useNewUrlParser: true})
    .then(()=> {
        console.log('Base de datos conectada')
    })
    .catch(error => {
        console.error(`Error al conectar con la base de datos : ${error}`)
    });

app.listen(app.get('port'), ()=> {
    console.log(`Server on port ${app.get('port')}`)
});