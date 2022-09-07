import { Component, OnInit } from '@angular/core';
import {IWord} from "../../models/ IWord";
import {WordServiceService} from "../word-service.service";

@Component({
  selector: 'app-dictionay-page-component',
  templateUrl: './dictionay-page-component.component.html',
  styleUrls: ['./dictionay-page-component.component.css']
})
export class DictionayPageComponentComponent implements OnInit {



  words : IWord[] = [];
  constructor( private wordService : WordServiceService) { }

  ngOnInit(): void {
    this.words = this.wordService.getAllService();
  }



}
