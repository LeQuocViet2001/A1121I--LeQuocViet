import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductListComponent} from './product/product-list/product-list.component';
import {ProductCreateComponent} from './product/product-create/product-create.component';
import {UpdateProductComponent} from './product/update-product/update-product.component';



const routes: Routes = [
  {path:  'product/list', component: ProductListComponent},
  { path: 'product/create', component: ProductCreateComponent},
  { path: 'product/detail/:id', component: UpdateProductComponent},
  { path: 'product/delete/:id', component: ProductCreateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
