import { TestBed, inject } from '@angular/core/testing';

import { CirculoService } from './circulo.service';

describe('CirculoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CirculoService]
    });
  });

  it('should be created', inject([CirculoService], (service: CirculoService) => {
    expect(service).toBeTruthy();
  }));
});
