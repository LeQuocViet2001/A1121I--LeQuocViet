import {Component, Input, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';


@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[] = [];

  @Input() productsDetele: Product;

  constructor( private  productService: ProductService
              ) {

  }

  ngOnInit(): void {
    this.getAll();



  }


  getAll() {
    this.products = this.productService.getAll();
  }

  showDataModelDelete(id: number, name: string) {
    console.log(id+","+name);
    this.productsDetele.id = id;
    this.productsDetele.name = name;
  }




}
