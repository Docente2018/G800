import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, LoadingController } from 'ionic-angular';
import { RestMatrixProvider } from '../../providers/rest-matrix/rest-matrix';
import * as math from 'mathjs';
import { ScreenOrientation } from '@ionic-native/screen-orientation';


@IonicPage({
	name: 'fiveVars',
    segment: 'fiveVars'
})
@Component({
  selector: 'page-five-vars',
  templateUrl: 'five-vars.html',
})
export class FiveVarsPage {

	matrix: any = [
					[
						{'var':'X', 'id':'id11', 'value': '1'},
						{'var':'Y', 'id':'id12', 'value': '-2'},
						{'var':'Z', 'id':'id13', 'value': '2'},
						{'var':'W', 'id':'id14', 'value': '-3'},
						{'var':'T', 'id':'id15', 'value': '-3'},
						{'var':'...', 'id':'iql1', 'value': '='},
						{'var':'...', 'id':'sol1', 'value': '15'}
					],
					[
						{'var':'X', 'id':'id21', 'value': '3'},
						{'var':'Y', 'id':'id22', 'value': '4'},
						{'var':'Z', 'id':'id23', 'value': '-1'},
						{'var':'W', 'id':'id24', 'value': '1'},
						{'var':'T', 'id':'id25', 'value': '-3'},
						{'var':'&nbsp;', 'id':'iql2', 'value': '='},
						{'var':'&nbsp;', 'id':'sol2', 'value': '-6'}
					],
					[
						{'var':'X', 'id':'id31', 'value': '2'},
						{'var':'Y', 'id':'id32', 'value': '-3'},
						{'var':'Z', 'id':'id33', 'value': '2'},
						{'var':'W', 'id':'id34', 'value': '-1'},
						{'var':'T', 'id':'id35', 'value': '-3'},
						{'var':'&nbsp;', 'id':'iql3', 'value': '='},
						{'var':'&nbsp;', 'id':'sol3', 'value': '17'}
					],
					[
						{'var':'X', 'id':'id41', 'value': '1'},
						{'var':'Y', 'id':'id42', 'value': '1'},
						{'var':'Z', 'id':'id43', 'value': '-3'},
						{'var':'W', 'id':'id44', 'value': '-2'},
						{'var':'T', 'id':'id45', 'value': '-3'},
						{'var':'&nbsp;', 'id':'iql4', 'value': '='},
						{'var':'&nbsp;', 'id':'sol4', 'value': '-21'}
					],				
					[
						{'var':'X', 'id':'id51', 'value': '1'},
						{'var':'Y', 'id':'id52', 'value': '5'},
						{'var':'Z', 'id':'id53', 'value': '2'},
						{'var':'W', 'id':'id54', 'value': '-6'},
						{'var':'T', 'id':'id55', 'value': '-3'},
						{'var':'&nbsp;', 'id':'iql5', 'value': '='},
						{'var':'&nbsp;', 'id':'sol5', 'value': '-7'}
					],					
				  ]

	solution: any = {
		"solve":"",
		"message":""
	};

	error: any;

  loading: any;

  	constructor( public navCtrl: NavController, 
  				       public navParams: NavParams, 
  				       public restMatrix: RestMatrixProvider,
                 public loadingCtrl: LoadingController,
                 public screenOrientation: ScreenOrientation ) 
  	{ }

    ionViewDidLoad() {
      this.screenOrientation.lock(this.screenOrientation.ORIENTATIONS.LANDSCAPE);
    }

    ionViewDidLeave(){
      this.screenOrientation.lock(this.screenOrientation.ORIENTATIONS.PORTRAIT); 
    }

    signRandom(){
      var set = math.floor(math.random(10));
      if (set > 5) {
        return "-"
      }
      return ""
    }    

    numberRandom(){
      return this.signRandom()+math.floor(math.random(20)).toString();
    }

    randomMatrix(){
      for (var i = 0; i < 5; i++) {
        for (var z = 0; z < 5; ++z) {
          this.matrix[i][z].value = this.numberRandom();
          this.matrix[i][6].value = this.numberRandom();
        }
      }
    }       

   	cleanMatrix(){
  		for (var i = 0; i < 5; i++) {
  			for (var z = 0; z < 5; ++z) {
  				this.matrix[i][z].value = "";
  				this.matrix[i][6].value = "";
  			}
  		}

      this.solution.solve = "";
      this.solution.message = "";
  	}

	prepareMatrix( objeto: any ){
		var valueOb = "";
  		let mat: string[][] = [[],[],[],[],[]];
  		for (var i = 0; i < 5; i++) {
  			for (var z = 0; z < 5; ++z) {
  				valueOb = objeto[i][z].value;
  				if (valueOb === "") {
  					valueOb = "0";
  				}
  				mat[i][z] = valueOb;
  			}
  		}
  		return mat;
  	}

  	prepareVector( objeto: any) {
  		var valueObj = "";
  		let vector: string[] = [];
  		for (var i = 0; i < 5; ++i) {
  			valueObj = objeto[i][6].value
  			if (valueObj === "") {
  				valueObj = "0"
  			}
  			vector[i] = valueObj
  		}
  		return vector
  	}

  	showSome(){

  		console.log( this.prepareMatrix( this.matrix ) );
  		console.log( this.prepareVector( this.matrix ) );
  		this.restMatrix.solveMatrix(this.prepareMatrix( this.matrix ), this.prepareVector( this.matrix ));
  	}  	

  	solveMatrix(){

      //Mostrando Loading...
      this.loading = this.loadingCtrl.create({
        spinner: 'bubbles',
        content: 'Calculando, por favor espere...'
      });      
      this.loading.present();

  		var matrixPrepared = this.prepareMatrix( this.matrix );
  		var vectorPrepared = this.prepareVector( this.matrix );

  		this.restMatrix.solveMatrix(matrixPrepared, vectorPrepared)
      	.then((res)=>{
        	this.solution = res; 
          this.loading.dismiss();         	
      	}).catch((err)=>{
        	console.log("ERROR: ", err);
        	this.error = JSON.stringify(err);
          this.loading.dismiss();  
      	});
      	console.log("RESPONSE: ", this.solution);
    }

}
