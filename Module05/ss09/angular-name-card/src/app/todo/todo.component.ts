import { Component, OnInit } from '@angular/core';
import {Todo} from "../todo";
import {FormControl} from "@angular/forms";
import {TodoService} from "../todo.service";


// let _id = 1;
@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {


  todoes: Todo[] = [];
  content = new FormControl();


  constructor( private  todoService: TodoService) { };

  ngOnInit(): void {

    this.todoService.getAll().subscribe(
      (data)=>{
        this.todoes = data;
      }
    );


  }

  // toggleTodo(i: number) {
  //   this.todoes[i].complete = !this.todoes[i].complete;
  // }

  toggleTodo(id: number) {
    this.todoes.find( (data: Todo)=>data.id === id).complete = !this.todoes.find( (data: Todo)=>data.id === id).complete;
    // this.todoes[id].complete = !this.todoes[id].complete;
  }

  change() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        content: value,
        complete: false
      };

      this.todoService.saveTodo(todo).subscribe(
        ()=>{},
        ()=>{},
        ()=>{ this.ngOnInit()}
      );
      // this.todoes.push(todo);
      this.content.reset();
    }
  }

  deleteTodo(id: number) {
    this.todoService.deleteTodo(id).subscribe(
      ()=> {},
      ()=> {},
      ()=> {  this.ngOnInit()},
    );

  }
}
