import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {ActivatedRoute, Route, Router} from '@angular/router';
import {Product} from '../../model/product';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {



  product : Product;
  productUpdateForm: FormGroup;

  constructor( private  productService  :ProductService,
               private router: Router,
               private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {

    this.activatedRoute.paramMap.subscribe((param)=>{
          const id = parseInt( param.get('id') );

          this.productService.findById(id).subscribe(
            (data)=>{  this.product = data},
            ()=>{},
            ()=>{ },
            );
          console.log( this.product)

    });

    this.productUpdateForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl(),
      price: new FormControl(),
      description: new FormControl(),
    });
  }



  submit() {
    const product = this.productUpdateForm.value;

    this.productService.updateProduct(product).subscribe(
      ()=>{},
      ()=>{},
      ()=>{
        this.router.navigateByUrl("/product/list");
      },
    );
    // this.productUpdateForm.reset();

  }



}
