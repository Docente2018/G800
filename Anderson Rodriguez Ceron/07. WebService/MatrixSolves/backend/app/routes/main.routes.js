module.exports = (app) => {

    const main = require('../controllers/main.controller.js');

    app.post('/notes', main.create);

    app.post('/view', main.view);

}