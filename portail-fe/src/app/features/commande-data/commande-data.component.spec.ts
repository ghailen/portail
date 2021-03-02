import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CommandeDataComponent } from './commande-data.component';

describe('CommandeDataComponent', () => {
  let component: CommandeDataComponent;
  let fixture: ComponentFixture<CommandeDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CommandeDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CommandeDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
