import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/product.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';


@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {

  constructor( private  productService  :ProductService,
               private router: Router) { }

  ngOnInit(): void {
  }

  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl('', [Validators.required, Validators.maxLength(3)]),
    price: new FormControl(),
    description: new FormControl(),
  });


  submit() {
    const product = this.productForm.value;
    this.productService.saveProduct(product);
    // this.productForm.reset();
    this.router.navigateByUrl("product/list");
  }

}
