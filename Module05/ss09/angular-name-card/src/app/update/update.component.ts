import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";
import {TodoService} from "../todo.service";
import {Todo} from "../todo";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  todo : Todo ;
  formUpdateTodo = new FormGroup(
    {
      id:  new FormControl(),
      content: new FormControl(),

    }

  );





  constructor( private httpClient: HttpClient,
               private  activatedRoute: ActivatedRoute,
               private todoService: TodoService,
               private  router:Router) { }

  ngOnInit(): void {

    this.activatedRoute.paramMap.subscribe(
      (param)=>{
         const  id = parseInt(param.get('id'));
         this.todoService.findById( id).subscribe(
           (data)=>{
             this.todo = data;

           }
         )
      }
    )
    ;
  }

  // @ts-ignore
  editA(value: string) {

   this.todo.content = value;
    console.log( this.todo.content);
    this.todoService.editTodo(this.todo).subscribe(
      ()=>{},
      ()=>{},
      ()=>{ this.router.navigateByUrl("") }
    );
  }


}
