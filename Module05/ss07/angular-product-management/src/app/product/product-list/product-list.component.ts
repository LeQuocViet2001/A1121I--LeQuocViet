import {Component, Input, OnInit, TemplateRef} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {Observable} from 'rxjs';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';



@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[] = [];

  @Input() productsDetele: Product;
  private modalService: NgbModal;



  constructor( private  productService: ProductService,

              ) {

  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll()  {
    this.productService.getAll().subscribe(
      (data)=>{ this.products = data});
  }



  deleteId : number ;

  openDelete(  targetModal , product: Product) {
    this.deleteId = product.id;
    this.modalService.open(targetModal, {
      backdrop: 'static',
      size: 'lg'
    });
  }
}
