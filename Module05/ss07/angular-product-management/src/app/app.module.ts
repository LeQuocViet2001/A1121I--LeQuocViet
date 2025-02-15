import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListComponent } from './product/product-list/product-list.component';
import { ProductCreateComponent } from './product/product-create/product-create.component';
import {ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import { UpdateProductComponent } from './product/update-product/update-product.component';
import {HttpClientModule} from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {NgbModal, NgbModalModule} from '@ng-bootstrap/ng-bootstrap';



@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductCreateComponent,
    UpdateProductComponent,



  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule,
        RouterModule,
        HttpClientModule,
        BrowserAnimationsModule


    ],
  exports: [

  ],
  bootstrap: [AppComponent],
  providers: []

})
export class AppModule { }
