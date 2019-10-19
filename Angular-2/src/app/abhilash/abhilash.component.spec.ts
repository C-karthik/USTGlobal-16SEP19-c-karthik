import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AbhilashComponent } from './abhilash.component';

describe('AbhilashComponent', () => {
  let component: AbhilashComponent;
  let fixture: ComponentFixture<AbhilashComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AbhilashComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AbhilashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
