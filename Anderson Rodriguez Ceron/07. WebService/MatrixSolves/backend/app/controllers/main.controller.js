const matrix = require('../core/matrix.core');

exports.create = (req, res) => {

    let body = req.body;


    if(!req.body.content){
        return res.status(200).send({
            ok: true,
            body: body
        });
    }
};

exports.view = (req, res, next) => {
    let reqMatrix;
    let reqSolutionsVar;

    try {

        reqMatrix = JSON.parse(req.body.matrix);
        reqSolutionsVar =  JSON.parse(req.body.vectorSolution);
        responseSolution = matrix.define(reqMatrix, reqSolutionsVar);

        return res.status(200).send({
            solve: responseSolution.status,
            message: responseSolution.solution
        });

    }catch(e){

        console.log(e);
        return res.status(400).send({
            solve: "not-solve",
            message: "bad matrix"
        });

    }
};
