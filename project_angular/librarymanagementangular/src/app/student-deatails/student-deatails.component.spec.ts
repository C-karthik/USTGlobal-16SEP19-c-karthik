import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentDeatailsComponent } from './student-deatails.component';

describe('StudentDeatailsComponent', () => {
  let component: StudentDeatailsComponent;
  let fixture: ComponentFixture<StudentDeatailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentDeatailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentDeatailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
