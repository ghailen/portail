import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreServiceComponent } from './offre-service.component';

describe('OffreServiceComponent', () => {
  let component: OffreServiceComponent;
  let fixture: ComponentFixture<OffreServiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OffreServiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
