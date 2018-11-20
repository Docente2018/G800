import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';

//Pages
import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { FiveVarsPageModule } from '../pages/five-vars/five-vars.module';
import { FourVarsPageModule } from '../pages/four-vars/four-vars.module';
import { ThreeVarsPageModule } from '../pages/three-vars/three-vars.module';

//Providers
import { RestMatrixProvider } from '../providers/rest-matrix/rest-matrix';
import { ScreenOrientation } from '@ionic-native/screen-orientation';

//Http Imports
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    MyApp,
    HomePage
  ],
  imports: [
    BrowserModule,    
    HttpModule,
    HttpClientModule,
    IonicModule.forRoot(MyApp),
    FiveVarsPageModule,
    FourVarsPageModule,
    ThreeVarsPageModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    RestMatrixProvider,
    ScreenOrientation
  ]
})
export class AppModule {}
