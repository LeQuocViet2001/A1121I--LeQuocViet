import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DictionayPageComponentComponent} from "./dictionay-page-component/dictionay-page-component.component";
import {DictionaryDetailComponentComponent} from "./dictionary-detail-component/dictionary-detail-component.component";
import {CreateComponent} from "./create/create.component";


const routes: Routes = [
  { path: '', component: DictionayPageComponentComponent},
  {path: 'detail/:word', component: DictionaryDetailComponentComponent},
  {path: 'create', component: CreateComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
