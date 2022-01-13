import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TipoClienteService {
  private lista:any[];

  constructor() {
    this.lista = [];
  }

  salvar(TipoClienteService:any):void{
    this.lista.push(TipoClienteService);
  }

  listar():any[]{
    return this.lista;
  }
}
