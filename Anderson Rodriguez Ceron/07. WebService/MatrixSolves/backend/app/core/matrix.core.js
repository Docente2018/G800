const math = require('mathjs');

var solutionVar = 0;
var solutions = new Array();
var deltaMatrix;
var deltaVariable;
var deltaVariable2;
var vectorSolutions = [];
var originalMat;
var numeroVariable = 0;


function setColumn( mat, column, position ){
    var mats =  math.matrix(mat);
    for (var i = 0; i < mat._size[0]; i++) {  
        mats._data[i][position] = column[i];
    }
    return mats._data;
}

function prepareSols( solutionVar ){
    console.log("FRACCIONS::::::", solutionVar);
    if ( solutionVar.n % solutionVar.d == 0 ) {
        return `${solutionVar.s * solutionVar.n / solutionVar.d}`;
    }
    return `${solutionVar.s * solutionVar.n}/${solutionVar.d}`;    
}

function solveMatrix(matrix, column, sols, times) {

    let matx = math.matrix(matrix);

    console.log("matriz original: ", matx);
    if(column === 0){
        deltaMatrix = math.fraction(math.det(matx));
        if( deltaMatrix.n === 0 ){
            return {"status": "not-solve", "solution":"La matriz no tiene solución o tiene multiples soluciones"};
        }        
    }
    console.log("determinante global: ", deltaMatrix);
    matx._data = setColumn( matx, vectorSolutions, times );
    console.log("nueva matriz:", matx);
    deltaVariable2 = math.det(matx);
    console.log("nueva det:", deltaVariable2);
    deltaVariable = math.fraction(math.det(matx));
    console.log("nueva determinante:", deltaVariable);

    solutionVar = math.divide(deltaVariable, deltaMatrix);
    console.log("SOLUCION:", solutionVar);

    if( typeof  math.number(solutionVar) === "number" ){
        sols.push(prepareSols(solutionVar));
    }else{
        return {"status": "not-solve", "solution":"La matriz no tiene solución o tiene multiples soluciones"};        
    }

    console.log("Longitud matriz: ", matx._size[0]);
    console.log("columna: ", column);

    if( column < matx._size[0]-1 ){
        console.log("CALL MATRIX AGAIN");        
        return solveMatrix(originalMat, column+1, sols, times+1);
    }

    console.log("Retornando solución:", sols.toString());
    return {"status": "solve", "solution":sols};    
}

function prepareMatrixFracs( arrayObject ){
    arrayObject.forEach( function(elem, index) {
        for (var i = 0; i < elem.length; i++) {            
            arrayObject[index][i] = eval(elem[i]);
        }        
    });
    return arrayObject;
}

function prepareVectorFracs( vectorObject ){
    vectorObject.forEach( function(elem, index) {
        vectorObject[index] = eval(elem);        
    });
    return vectorObject;
}

exports.define = ( matrix, vectorSolution ) => {
    

    vectorSolutions = Array.from( prepareVectorFracs(vectorSolution));
    originalMat = math.matrix( prepareMatrixFracs(Array.from(matrix)) );
    solutions = [];

    try {            

        if( originalMat.size[0] === originalMat.size[1] ){
            return solveMatrix(originalMat, 0, solutions, 0);
        }
        return {"status": "not-solve", "solution":"No es una matriz cuadrada!"};

    }catch{
        console.log('Error creando la matriz');
        return {"status": "not-solve", "solution":"Error creando la matriz!"};
    }
}

exports.properties