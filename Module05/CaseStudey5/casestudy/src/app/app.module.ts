import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { NavbarComponent } from './HeaderFooter/navbar/navbar.component';
import { FooterComponent } from './HeaderFooter/footer/footer.component';
import { ListServiceComponent } from './Service/list-service/list-service.component';
import { UpdateServiceComponent } from './Service/update-service/update-service.component';
import { NewServiceComponent } from './Service/new-service/new-service.component';
import { ListCustomerComponent } from './Customer/list-customer/list-customer.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NewCustomerComponent } from './Customer/new-customer/new-customer.component';
import { UpdateCustomerComponent } from './Customer/update-customer/update-customer.component';
import { NewContractComponent } from './Contract/new-contract/new-contract.component';
import { ListContractComponent } from './Contract/list-contract/list-contract.component';
import { ListFacilityComponent } from './Service/list-facility/list-facility.component';
import {RouterModule, ROUTES} from "@angular/router";

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    ListServiceComponent,
    UpdateServiceComponent,
    NewServiceComponent,
    ListCustomerComponent,
    NewCustomerComponent,
    UpdateCustomerComponent,
    NewContractComponent,
    ListContractComponent,
    ListFacilityComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
