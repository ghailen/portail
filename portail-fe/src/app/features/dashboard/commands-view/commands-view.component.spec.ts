import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CommandsViewComponent } from './commands-view.component';

describe('CommandsViewComponent', () => {
  let component: CommandsViewComponent;
  let fixture: ComponentFixture<CommandsViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CommandsViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CommandsViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
