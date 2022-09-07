import { Component, OnInit } from '@angular/core';
import {IFacility} from "../../models/IFacility";
import {toNumbers} from "@angular/compiler-cli/src/diagnostics/typescript_version";

@Component({
  selector: 'app-list-facility',
  templateUrl: './list-facility.component.html',
  styleUrls: ['./list-facility.component.css']
})
export class ListFacilityComponent implements OnInit {


  facilities: IFacility[] = [
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
  active: boolean;
  ngOnInit(): void {
    this.active = true;
  }

  dataScrVideo = "assets/image/vid-1.mp4";

  dataScrVideos = [ "assets/image/vid-1.mp4" , "assets/image/vid-2.mp4", "assets/image/vid-3.mp4",
    "assets/image/vid-4.mp4", "assets/image/vid-5.mp4"];


  changVideo( event : any) {
    let srcVideo  = event.target.value;
    this.dataScrVideo = this.dataScrVideos[parseInt(srcVideo)];
    console.log(this.dataScrVideos[parseInt(srcVideo)])

  }


  // changVideo1( event : any) {
  //   let srcVideo  = event.target.value;
  //   this.dataScrVideo = this.dataScrVideos[parseInt(srcVideo)];
  //   console.log(this.dataScrVideos[parseInt(srcVideo)])
  //   this.active = false;
  // }
}
