import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CommandActivityComponent } from './command-activity.component';

describe('CommandActivityComponent', () => {
  let component: CommandActivityComponent;
  let fixture: ComponentFixture<CommandActivityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CommandActivityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CommandActivityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
