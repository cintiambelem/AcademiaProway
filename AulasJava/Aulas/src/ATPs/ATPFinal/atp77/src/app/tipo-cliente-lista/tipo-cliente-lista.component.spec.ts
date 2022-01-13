import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TipoClienteListaComponent } from './tipo-cliente-lista.component';

describe('TipoClienteListaComponent', () => {
  let component: TipoClienteListaComponent;
  let fixture: ComponentFixture<TipoClienteListaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TipoClienteListaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TipoClienteListaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
