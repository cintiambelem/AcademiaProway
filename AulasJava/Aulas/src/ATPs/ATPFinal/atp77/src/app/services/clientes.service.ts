import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ClientesService {
  private lista:any[];

  constructor() {
    this.lista = [];
   }

   salvar(ClientesService:any):void{
    this.lista.push(ClientesService);
  }

  listar():any[]{
    return this.lista;
  }
}
