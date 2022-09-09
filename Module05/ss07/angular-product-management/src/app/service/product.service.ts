import { Injectable } from '@angular/core';
import {Product} from "../model/product";
import {HttpClient} from '@angular/common/http';
import {Router} from '@angular/router';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor( private  httpClient: HttpClient,
                private router: Router ) { }

    API_URL = "http://localhost:3000/product";


  getAll() : Observable<Product[]>   {
    return this.httpClient.get<Product[]>( this.API_URL);
  }

  saveProduct(product : Product) : Observable<void> {
    return this.httpClient.post<void>( this.API_URL, product);
  }

  updateProduct( product: Product) : Observable<void> {

    return this.httpClient.put<void>( this.API_URL + '/' + product.id, product);
  }


  findById( id: number) :Observable<Product>{
    return this.httpClient.get<Product>( this.API_URL +"/" + id);
  }

  delete( id: number) : Observable<void>{
    return this.httpClient.delete<void>( this.API_URL +"/" + id);
  }
}
