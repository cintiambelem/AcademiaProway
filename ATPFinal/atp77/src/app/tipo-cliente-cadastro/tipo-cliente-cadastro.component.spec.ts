import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TipoClienteCadastroComponent } from './tipo-cliente-cadastro.component';

describe('TipoClienteCadastroComponent', () => {
  let component: TipoClienteCadastroComponent;
  let fixture: ComponentFixture<TipoClienteCadastroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TipoClienteCadastroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TipoClienteCadastroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
