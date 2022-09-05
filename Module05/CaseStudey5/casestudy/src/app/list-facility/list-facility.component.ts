import { Component, OnInit } from '@angular/core';
import {Facility} from "../facility";

@Component({
  selector: 'app-list-facility',
  templateUrl: './list-facility.component.html',
  styleUrls: ['./list-facility.component.css']
})
export class ListFacilityComponent implements OnInit {


  facilities: Facility[] = [
    {facilityId : 1,
      facilityName: ' Room Executive Suite',
      area: 700,
      cost: 1000,
      maxPeople: 10,
      standardRoom: 'VIP',
      description: ' dolor sit amet consectet urdolor sit amet consecteturdolor sit amet consectetur ',
      poolArea: 300,
      numberOfFloors:0,
      rentType: 1,
      facilityType: 1},
    {facilityId : 2,
      facilityName: 'House BBB',
      area: 500,
      cost: 1000,
      maxPeople: 10,
      standardRoom: 'sdfsdfd',
      description: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Ducimus, tenetur.\n' +
        '            Lorem ipsum dolor sit amet consectetur adipisicing elit. Ducimus, tenetur.\n' +
        '            Lorem ipsum dolor sit amet consectetur adipisicing elit. Ducimus, tenetur.Lorem ipsum dolor sit amet consectetur adipisicing elit. Ducimus, tenetur.\n' +
        '            Lorem ipsum dolor sit amet consectetur adipisicing elit. Ducimus, tenetur.',
      poolArea: 200,
      numberOfFloors:0,
      rentType: 2,
      facilityType: 1},
    {facilityId : 2,
      facilityName: 'Villa Studio King',
      area: 300,
      cost: 1000000,
      maxPeople: 10,
      standardRoom: 'suite',
      description: 'font river city',
      numberOfFloors:0,
      rentType: 1,
      facilityType: 1}
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
