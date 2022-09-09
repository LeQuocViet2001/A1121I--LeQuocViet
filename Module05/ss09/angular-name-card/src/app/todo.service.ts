import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Todo} from "./todo";

@Injectable({
  providedIn: 'root'
})
export class TodoService {


  API_URL  = 'http://localhost:3000/todo';
  constructor(private http: HttpClient ) { }

  getAll(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.API_URL );
  }

  deleteTodo(id: number): Observable<void> {
    return this.http.delete<void>(this.API_URL + '/' + id);
  }

  saveTodo( todo : Todo): Observable<void>{
    return this.http.post<void>(  this.API_URL, todo);
  }

  editTodo( todo : Todo): Observable<void>{
    return this.http.patch<void>(  this.API_URL + '/' + todo.id, todo);
  }

  findById( id : number): Observable<Todo>{
    return this.http.get( this.API_URL + '/' + id);
}
}
