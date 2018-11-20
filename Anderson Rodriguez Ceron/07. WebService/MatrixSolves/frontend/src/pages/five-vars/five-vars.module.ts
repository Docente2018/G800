import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { FiveVarsPage } from './five-vars';

@NgModule({
  declarations: [
    FiveVarsPage,
  ],
  imports: [
    IonicPageModule.forChild(FiveVarsPage),
  ],
})
export class FiveVarsPageModule {}
