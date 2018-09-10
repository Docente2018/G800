import { Component } from '@angular/core';
import { NavController, AlertController, LoadingController } from 'ionic-angular';
import { Triangulo } from '../clasesFiguras/claseTriangulo';
import { Cuadrado } from '../clasesFiguras/claseCuadrado';
import { Circulo } from '../clasesFiguras/claseCirculo';
import { Rectangulo } from '../clasesFiguras/claseRectangulo';
import { AnonymousSubject } from 'rxjs/Subject';
@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  public triangulo: any;
  public cuadrado: any;
  public circulo: any;
  public rectangulo: any;
  public objetoTriangulo: any;
  public Lado: any;
  public Radio: any;
  public rectanguloData: any;
  constructor(public navCtrl: NavController, public alertCtrl: AlertController, public loadingCtrl: LoadingController) {
    this.objetoTriangulo = {
      baseTria: null,
      alturaTria: null,
      LadoA: null,
      LadoB: null,
      LadoC: null,
    }
    this.rectanguloData = {
      baseRecta: null,
      alturaRecta: null,
    }
    this.Lado = null;
    this.Radio = null;
    this.triangulo = new Triangulo();
    this.cuadrado = new Cuadrado();
    this.circulo = new Circulo();
    this.rectangulo = new Rectangulo();
  }
  calcularDatosTriangulo() {
    if (this.objetoTriangulo.baseTria === "0" ||
        this.objetoTriangulo.alturaTria === "0"  ||
        this.objetoTriangulo.LadoA === "0"  ||
        this.objetoTriangulo.LadoB === "0"  ||
        this.objetoTriangulo.LadoC === "0" ) {
          const alert = this.alertCtrl.create({
            title: 'Error',
            subTitle: 'Los datos no pueden ser 0',
            buttons: ['OK']
          });
          alert.present();
    } else if (this.objetoTriangulo.baseTria  &&
      this.objetoTriangulo.alturaTria &&
      this.objetoTriangulo.LadoA &&
      this.objetoTriangulo.LadoB &&
      this.objetoTriangulo.LadoC) {
        this.triangulo.establecerDatosDelTriangulo(this.objetoTriangulo);
        const confirm = this.alertCtrl.create({
          title: '¿Que desea calcular?',
          buttons: [
            {
              text: 'Area',
              handler: () => {
                let area = this.triangulo.calcularArea();
                let loading  = this.loadingCtrl.create({
                  content: "Calculando area...",
                  duration: 2000
                });
                loading.onDidDismiss(() => {
                  const alert = this.alertCtrl.create({
                    title: 'Respuesta',
                    subTitle: 'El area calculado es: ' + area,
                    buttons: ['OK']
                  });
                  alert.present();
                });
                loading .present();
              }
            },
            {
              text: 'Perimetro',
              handler: () => {
                let perimetro = this.triangulo.calcularPerim();
                let loading  = this.loadingCtrl.create({
                  content: "Calculando perimetro...",
                  duration: 2000
                });
                loading.onDidDismiss(() => {
                  const alert = this.alertCtrl.create({
                    title: 'Respuesta',
                    subTitle: 'El perimetro calculado es: ' + perimetro,
                    buttons: ['OK']
                  });
                  alert.present();
                });
                loading .present();
              }
            }
          ]
        });
        confirm.present();
      } else {
        const alert = this.alertCtrl.create({
          title: 'Error',
          subTitle: 'Debe ingresar todos los datos',
          buttons: ['OK']
        });
        alert.present();
      }
  }
  calcularDatosCuadrado() {
    if (this.Lado && this.Lado === "0") {
      const alert = this.alertCtrl.create({
        title: 'Error',
        subTitle: 'Los datos no pueden ser 0',
        buttons: ['OK']
      });
      alert.present();
    } else  if (this.Lado) {
      this.cuadrado.establecerDatosCuadrado(this.Lado);
      const confirm = this.alertCtrl.create({
        title: '¿Que desea calcular?',
        buttons: [
          {
            text: 'Area',
            handler: () => {
              let area = this.cuadrado.calcularArea();
              let loading  = this.loadingCtrl.create({
                content: "Calculando area...",
                duration: 2000
              });
              loading.onDidDismiss(() => {
                const alert = this.alertCtrl.create({
                  title: 'Respuesta',
                  subTitle: 'El area calculado es: ' + area,
                  buttons: ['OK']
                });
                alert.present();
              });
              loading .present();
            }
          },
          {
            text: 'Perimetro',
            handler: () => {
              let perimetro = this.cuadrado.calcularPerim();
              let loading  = this.loadingCtrl.create({
                content: "Calculando perimetro...",
                duration: 2000
              });
              loading.onDidDismiss(() => {
                const alert = this.alertCtrl.create({
                  title: 'Respuesta',
                  subTitle: 'El perimetro calculado es: ' + perimetro,
                  buttons: ['OK']
                });
                alert.present();
              });
              loading .present();
            }
          }
        ]
      });
      confirm.present();
    } else {
      const alert = this.alertCtrl.create({
        title: 'Error',
        subTitle: 'Debe ingresar el lado del cuadrado a calcular',
        buttons: ['OK']
      });
      alert.present();
    }
  } 
  calcularDatosCirculo() {
    if (this.Radio && this.Radio === "0") {
      const alert = this.alertCtrl.create({
        title: 'Error',
        subTitle: 'Los datos no pueden ser 0',
        buttons: ['OK']
      });
      alert.present();
    } else if (this.Radio) {
      console.log(this.Radio)
      this.circulo.establecerDatosCirculo(this.Radio);
      const confirm = this.alertCtrl.create({
        title: '¿Que desea calcular?',
        buttons: [
          {
            text: 'Area',
            handler: () => {
              let area = this.circulo.calcularArea();
              let loading  = this.loadingCtrl.create({
                content: "Calculando area...",
                duration: 2000
              });
              loading.onDidDismiss(() => {
                const alert = this.alertCtrl.create({
                  title: 'Respuesta',
                  subTitle: 'El area circulo es: ' + area + 'cm2',
                  buttons: ['OK']
                });
                alert.present();
              });
              loading .present();
            }
          },
          {
            text: 'Perimetro',
            handler: () => {
              let perimetro = this.circulo.calcularPerim();
              let loading  = this.loadingCtrl.create({
                content: "Calculando perimetro...",
                duration: 2000
              });
              loading.onDidDismiss(() => {
                const alert = this.alertCtrl.create({
                  title: 'Respuesta',
                  subTitle: 'El perimetro del circulo es: ' + perimetro + 'cm2',
                  buttons: ['OK']
                });
                alert.present();
              });
              loading.present();
            }
          }
        ]
      });
      confirm.present();
    } else {
      const alert = this.alertCtrl.create({
        title: 'Error',
        subTitle: 'Debe ingresar el lado del cuadrado a calcular',
        buttons: ['OK']
      });
      alert.present();
    }
  } 
  calcularDatosRectangulo() {
    if (this.rectanguloData.baseRecta === "0" || this.rectanguloData.alturaRecta === "0") {
      const alert = this.alertCtrl.create({
        title: 'Error',
        subTitle: 'Los datos no pueden ser 0',
        buttons: ['OK']
      });
      alert.present();
    } else if (this.rectanguloData.baseRecta && this.rectanguloData.alturaRecta) {
      console.log(this.Radio)
      this.rectangulo.establecerDatosRectangulo(this.rectanguloData);
      const confirm = this.alertCtrl.create({
        title: '¿Que desea calcular?',
        buttons: [
          {
            text: 'Area',
            handler: () => {
              let area = this.rectangulo.calcularArea();
              let loading  = this.loadingCtrl.create({
                content: "Calculando area...",
                duration: 2000
              });
              loading.onDidDismiss(() => {
                const alert = this.alertCtrl.create({
                  title: 'Respuesta',
                  subTitle: 'El area calculado es: ' + area,
                  buttons: ['OK']
                });
                alert.present();
              });
              loading .present();
            }
          },
          {
            text: 'Perimetro',
            handler: () => {
              let perimetro = this.rectangulo.calcularPerim();
              let loading  = this.loadingCtrl.create({
                content: "Calculando perimetro...",
                duration: 2000
              });
              loading.onDidDismiss(() => {
                const alert = this.alertCtrl.create({
                  title: 'Respuesta',
                  subTitle: 'El perimetro calculado es: ' + perimetro,
                  buttons: ['OK']
                });
                alert.present();
              });
              loading .present();
            }
          }
        ]
      });
      confirm.present();
    } else {
      const alert = this.alertCtrl.create({
        title: 'Error',
        subTitle: 'Debe ingresar todos los datos',
        buttons: ['OK']
      });
      alert.present();
    }
  } 
}
