import { TestBed } from '@angular/core/testing';

import { TipoClienteService } from './tipo-cliente-service.service';

describe('TipoClienteServiceService', () => {
  let service: TipoClienteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TipoClienteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
