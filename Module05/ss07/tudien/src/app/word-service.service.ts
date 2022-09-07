import { Injectable } from '@angular/core';
import {WordDao} from "../data/WordDao";
import {IWord} from "../models/ IWord";

@Injectable({
  providedIn: 'root'
})
export class WordServiceService {

  constructor() { }



  getAllService(){
    return WordDao.words;
  }
  translate ( w : string)
  {
    return  WordDao.words.find(  ( word: IWord) =>word.word == w);
  }
}
