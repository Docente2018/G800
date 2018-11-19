const express = require('express');
const mongoose = require('mongoose');
const app = express();
const cors = require('cors');


mongoose.connect('mongodb://owner:owner123@ds147044.mlab.com:47044/uninpahu')
    .then(db => console.log('DB is connected'))
    .catch(error => console.error(error));

app.set('port', process.env.PORT || 3000);

app.use(express.json());
app.use(cors({origin: '*'}));

app.use('/productos', require('./routes/producto.route'));

app.listen(app.get('port'), ()=>{
    console.log('Server on port ' + app.get('port'));
});


