import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListFacilityComponent} from "./Service/list-facility/list-facility.component";
import {NewCustomerComponent} from "./Customer/new-customer/new-customer.component";
import {ListCustomerComponent} from "./Customer/list-customer/list-customer.component";
import {ListContractComponent} from "./Contract/list-contract/list-contract.component";


const routes: Routes = [
  {path: '', component: ListFacilityComponent},
  {path: 'customer/create', component: NewCustomerComponent},
  {path: 'customer/list', component: ListCustomerComponent},
  {path: 'contract/list', component: ListContractComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
