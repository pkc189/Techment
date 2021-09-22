import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {MatButtonModule} from '@angular/material/button';
import { FormsModule } from '@angular/forms';
import { TestComponent } from './test/test.component';
import { CustomStyleDirective } from './custom-style.directive';



@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    CustomStyleDirective,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  
    BrowserAnimationsModule,
 FormsModule
  
  

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
