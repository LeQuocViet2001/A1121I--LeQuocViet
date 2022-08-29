import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DialogModalDeleteComponent } from './dialog-modal-delete.component';

describe('DialogModalDeleteComponent', () => {
  let component: DialogModalDeleteComponent;
  let fixture: ComponentFixture<DialogModalDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DialogModalDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DialogModalDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
