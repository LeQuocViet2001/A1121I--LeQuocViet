import { Component, OnInit } from '@angular/core';
import {toNumbers} from "@angular/compiler-cli/src/diagnostics/typescript_version";

@Component({
  selector: 'app-may-tinh-editor',
  templateUrl: './may-tinh-editor.component.html',
  styleUrls: ['./may-tinh-editor.component.css']
})
export class MayTinhEditorComponent implements OnInit {


  ketQua :number = 0;
  so1: number = 0;
  so2: number = 0

  constructor() { }

  ngOnInit(): void {
  }


  tinhToan(value1:string , value2: string , phepToan: string) {

    this.ketQua = 0;
    this.so1 = parseInt(value1);
    this.so2 = parseInt(value2);

    switch (phepToan) {
      case '+':{
        this.ketQua = this.so1 + this.so2 ;
        break;
      }
      case '-':{
        this.ketQua = this.so1 - this.so2 ;
        break;
      }

      case '*':{
        this.ketQua = this.so1 * this.so2 ;
        break;
      }


      case '/':{
        this.ketQua = this.so1 / this.so2 ;
        break;
      }

    }


  }

}
