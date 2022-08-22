import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color-picker-editor',
  templateUrl: './color-picker-editor.component.html',
  styleUrls: ['./color-picker-editor.component.css']
})
export class ColorPickerEditorComponent implements OnInit {


  constructor() { }
  favorColor: string = '#ff0000';
  ngOnInit(): void {
  }

  changColor(valueColor: string) {
      this.favorColor = valueColor;
  }
}
