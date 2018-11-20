import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { FourVarsPage } from './four-vars';

@NgModule({
  declarations: [
    FourVarsPage,
  ],
  imports: [
    IonicPageModule.forChild(FourVarsPage),
  ],
})
export class FourVarsPageModule {}
