import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './list/list.component';
import { DialogModalDeleteComponent } from './dialog-modal-delete/dialog-modal-delete.component';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    DialogModalDeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,

    // Import popup and confirm box module
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
