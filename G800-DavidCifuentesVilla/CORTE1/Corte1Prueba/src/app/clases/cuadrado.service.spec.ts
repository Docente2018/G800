import { TestBed, inject } from '@angular/core/testing';

import { CuadradoService } from './cuadrado.service';

describe('CuadradoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CuadradoService]
    });
  });

  it('should be created', inject([CuadradoService], (service: CuadradoService) => {
    expect(service).toBeTruthy();
  }));
});
