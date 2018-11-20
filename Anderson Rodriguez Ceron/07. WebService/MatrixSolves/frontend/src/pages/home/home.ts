import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

//Pages
import { FiveVarsPage } from '../five-vars/five-vars';
import { FourVarsPage } from '../four-vars/four-vars';
import { ThreeVarsPage } from '../three-vars/three-vars';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  menu = [];

  constructor( public nav: NavController ) {

    this.menu = [
      {
        'title': 'Sistemas de 5 variables',               
        'color': '#E63135',
        'page':'five'
      },
      {
        'title': 'Sistemas de 4 variables',
        'color': '#0CA9EA',
        'page':'four'
      },
      {
        'title': 'Sistemas de 3 variables',
        'color': '#F46529',
        'page':'three'
      }
    ]   
  }

  openFiveVarsPage() {
    this.nav.push(FiveVarsPage);
  }

  openFourVarsPage() {
    this.nav.push(FourVarsPage);    
  }

  openThreeVarsPage() {
    this.nav.push(ThreeVarsPage);    
  }

  executePage( page: string ){
    switch (page) {
      case "three":
        this.openThreeVarsPage();
        break;

      case "four":
        this.openFourVarsPage();
        break;        

      case "five":
        this.openFiveVarsPage();
        break;

      default:
        console.log("no hace nada");
        break;
    }
  }

  openNavDetailsPage(item) {
    //this.nav.push(4variablesPageModule, { item: item });
    //this.nav.push(4variablesPageModule, { item: item });
  }

}
