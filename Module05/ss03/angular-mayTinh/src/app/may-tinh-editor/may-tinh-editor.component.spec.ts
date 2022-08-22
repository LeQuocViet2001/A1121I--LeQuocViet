import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MayTinhEditorComponent } from './may-tinh-editor.component';

describe('MayTinhEditorComponent', () => {
  let component: MayTinhEditorComponent;
  let fixture: ComponentFixture<MayTinhEditorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MayTinhEditorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MayTinhEditorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
