import { ClienteListaComponent } from './cliente-lista/cliente-lista.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClienteFormComponent } from './cliente-form/cliente-form.component';

const routes: Routes = [
  { path: 'clientes', component: ClienteListaComponent },
  { path: 'clientes/cadastrar', component: ClienteFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
