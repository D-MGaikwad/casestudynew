import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuestServiceComponent } from './guest-service.component';

describe('GuestServiceComponent', () => {
  let component: GuestServiceComponent;
  let fixture: ComponentFixture<GuestServiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GuestServiceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GuestServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
