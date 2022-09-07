import { Component, OnInit } from '@angular/core';
import {IContract} from "../../models/IContract";

@Component({
  selector: 'app-list-contract',
  templateUrl: './list-contract.component.html',
  styleUrls: ['./list-contract.component.css']
})
export class ListContractComponent implements OnInit {

  constructor() { }
  contracts: IContract[] = [];
  ngOnInit(): void {
      this.contracts= [
      {contractId: 11, startDate: '11/1/2001', endDate: '5/1/2022', deposit: 123, totalMoney: 56000, customer: 1, employee: 0, service: 2},
      {contractId: 4, startDate: '11/1/2001', endDate: '5/1/2022', deposit: 1123000, totalMoney: 76, customer: 1, employee: 1, service: 2},
      {contractId: 12, startDate: '11/1/2001', endDate: '5/1/2022', deposit: 1064, totalMoney: 505600, customer: 1, employee: 2, service: 2},
      {contractId: 7, startDate: '11/1/2001', endDate: '5/1/2022', deposit: 1032400, totalMoney: 5056700, customer: 1, employee: 2, service: 2},
      {contractId: 9, startDate: '11/1/2001', endDate: '5/1/2022', deposit: 10076, totalMoney: 76, customer: 1, employee: 4, service: 2},


    ];
  }

}
