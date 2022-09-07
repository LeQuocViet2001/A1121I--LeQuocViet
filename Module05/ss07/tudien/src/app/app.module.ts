import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DictionayPageComponentComponent } from './dictionay-page-component/dictionay-page-component.component';
import {RouterModule} from "@angular/router";
import { DictionaryDetailComponentComponent } from './dictionary-detail-component/dictionary-detail-component.component';
import { CreateComponent } from './create/create.component';

@NgModule({
  declarations: [
    AppComponent,
    DictionayPageComponentComponent,
    DictionaryDetailComponentComponent,
    CreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
