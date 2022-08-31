import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { ListServiceComponent } from './list-service/list-service.component';
import { UpdateServiceComponent } from './update-service/update-service.component';
import { NewServiceComponent } from './new-service/new-service.component';
import { ListCustomerComponent } from './list-customer/list-customer.component';
import { TestAComponent } from './test-a/test-a.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NewCustomerComponent } from './new-customer/new-customer.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';
import { NewContractComponent } from './new-contract/new-contract.component';
import { ListContractComponent } from './list-contract/list-contract.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    ListServiceComponent,
    UpdateServiceComponent,
    NewServiceComponent,
    ListCustomerComponent,
    TestAComponent,
    NewCustomerComponent,
    UpdateCustomerComponent,
    NewContractComponent,
    ListContractComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
