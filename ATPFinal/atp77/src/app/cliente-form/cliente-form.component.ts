import { ClientesService } from './../services/clientes.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cliente-form',
  templateUrl: './cliente-form.component.html',
  styleUrls: ['./cliente-form.component.css']
})
export class ClienteFormComponent implements OnInit {
  id:number = 0;
  nome:string = "";
  tipoCliente = "";

  constructor(private ClientesService: ClientesService) {
  }

  ngOnInit(): void {
  }

  salvar(){
    let cliente ={
      "id": this.id,
      "nome": this.nome,
      "tipoCliente": this.tipoCliente
    };
    this.ClientesService.salvar(cliente);
    this.limpar();
  }

  private limpar(){
    this.id = 0;
    this.nome = "";
    this.tipoCliente = "";
  }


}
