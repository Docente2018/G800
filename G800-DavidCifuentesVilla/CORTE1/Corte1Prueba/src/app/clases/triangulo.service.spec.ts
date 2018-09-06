import { TestBed, inject } from '@angular/core/testing';

import { TrianguloService } from './triangulo.service';

describe('TrianguloService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TrianguloService]
    });
  });

  it('should be created', inject([TrianguloService], (service: TrianguloService) => {
    expect(service).toBeTruthy();
  }));
});
