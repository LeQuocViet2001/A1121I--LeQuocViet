import { Component, OnInit } from '@angular/core';
import {ICustomer} from "../../models/ICustomer";
import {CustomerDao} from "../../Dao/CustomerDao";

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {

  constructor() { }


  customers : ICustomer[] = [];
  ngOnInit(): void {

    this.customers = CustomerDao.getAllCustomers();

  }

}
