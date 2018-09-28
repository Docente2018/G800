import { TestBed, inject } from '@angular/core/testing';

import { RectanguloService } from './rectangulo.service';

describe('RectanguloService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [RectanguloService]
    });
  });

  it('should be created', inject([RectanguloService], (service: RectanguloService) => {
    expect(service).toBeTruthy();
  }));
});
