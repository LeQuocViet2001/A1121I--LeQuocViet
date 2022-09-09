import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {UpdateComponent} from "./update/update.component";
import {TodoComponent} from "./todo/todo.component";


const routes: Routes = [
  {path :'', component: TodoComponent},
  {path :'edit/:id', component: UpdateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
