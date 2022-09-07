import { Component, OnInit } from '@angular/core';
import {IWord} from "../../models/ IWord";
import {WordServiceService} from "../word-service.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-dictionary-detail-component',
  templateUrl: './dictionary-detail-component.component.html',
  styleUrls: ['./dictionary-detail-component.component.css']
})
export class DictionaryDetailComponentComponent implements OnInit {


  word : IWord;

  constructor( private  wordService : WordServiceService,
               private  activeRouter : ActivatedRoute) { }

  ngOnInit(): void {

    this.activeRouter.paramMap.subscribe( (param)=>{
      const  w = param.get('word');
      this.word = this.wordService.translate(w);
    })
  }

}
