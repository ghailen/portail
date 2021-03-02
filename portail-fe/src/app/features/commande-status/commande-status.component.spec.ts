import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CommandeStatusComponent } from './commande-status.component';

describe('CommandeStatusComponent', () => {
  let component: CommandeStatusComponent;
  let fixture: ComponentFixture<CommandeStatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CommandeStatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CommandeStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
