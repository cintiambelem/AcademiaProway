import { TipoClienteService } from './../services/tipo-cliente-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tipo-cliente-cadastro',
  templateUrl: './tipo-cliente-cadastro.component.html',
  styleUrls: ['./tipo-cliente-cadastro.component.css']
})
export class TipoClienteCadastroComponent implements OnInit {
  tipoCliente:string = "";
  id:number = 0;
  constructor(private TipoClienteService:TipoClienteService) {

   }

  ngOnInit(): void {
  }

  salvar(){
    let tipoCliente={
      "id": this.id,
      "tipoCliente": this.tipoCliente
    };
    this.TipoClienteService.salvar(tipoCliente);
    this.limpar();
  }

  limpar(){
    this.id = 0;
    this.tipoCliente = "";
  }

}
