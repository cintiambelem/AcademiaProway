import { TipoClienteService } from './../services/tipo-cliente-service.service';

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tipo-cliente-lista',
  templateUrl: './tipo-cliente-lista.component.html',
  styleUrls: ['./tipo-cliente-lista.component.css']
})
export class TipoClienteListaComponent implements OnInit {
  lista:any[]

  constructor(private TipoClienteService: TipoClienteService) {
    this.lista = [];
    this.listar();
  }

  ngOnInit(): void {
  }

  private listar(){
    this.lista = this.TipoClienteService.listar();
  }
}
