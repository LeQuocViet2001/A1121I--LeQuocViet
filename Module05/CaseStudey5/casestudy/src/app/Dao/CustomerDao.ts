import {ICustomer} from "../models/ICustomer";


export class CustomerDao {


  static customers: ICustomer[] = [
    {
      customerId : 0,
      customerType: 1,
      name: "Quảng Nam",
      birthday: '22/01/2021',
      gender: true,
      idCard: '2342423',
      phone: '23423523432',
      email: '2342324',
      address: '234234',
    },
    {
      customerId : 1,
      customerType: 1,
      name: "Quảng Nam",
      birthday: '22/01/2021',
      gender: true,
      idCard: '2342423',
      phone: '23423523432',
      email: '2342324',
      address: '234234'
    },
    {
      customerId : 2,
      customerType: 1,
      name: "Quảng Nam",
      birthday: '22/01/2021',
      gender: true,
      idCard: '2342423',
      phone: '23423523432' ,
      email: '2342324',
      address: '234234'
    },

  ]

  static getAllCustomers() {
    return this.customers;
  }



}
