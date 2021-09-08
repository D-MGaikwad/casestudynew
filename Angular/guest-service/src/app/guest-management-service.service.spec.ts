import { TestBed } from '@angular/core/testing';

import { GuestManagementServiceService } from './guest-management-service.service';

describe('GuestManagementServiceService', () => {
  let service: GuestManagementServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GuestManagementServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
