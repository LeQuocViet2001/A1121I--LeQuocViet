import {Component, OnInit} from '@angular/core';
import {Student} from '../student';


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  constructor() {
  }


  studentA: Student = {};

  studentList: Student[] = [
    {
      id: 1,
      name: 'dsd',
      age: 12,
      gender: true,
      mark: 2,
      address: 'sfsdfds',
      number: 24234
    },
    {
      id: 2,
      name: 'asd',
      age: 4,
      gender: true,
      mark: 2,
      address: 'asd',
      number: 2222
    },
    {
      id: 3,
      name: 'vc',
      age: 3233,
      gender: false,
      mark: 2,
      address: 'sad',
      number: 4444
    },
  ];
  idDelete  = 2 ;
  nameDelete = 'abc';

  ngOnInit(): void {
  }

  showDataModelDelete(id: number, name: string) {
    console.log(id+","+name);
    this.idDelete = id;
    this.nameDelete = name;


  }

  deleteStudent(value: string, value2: any) {
    
  }
}
