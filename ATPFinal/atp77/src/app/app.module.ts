import { NgModule, Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app-component/app.component';
import { TipoClienteListaComponent } from './tipo-cliente-lista/tipo-cliente-lista.component';
import { TipoClienteCadastroComponent } from './tipo-cliente-cadastro/tipo-cliente-cadastro.component';
import { ClienteListaComponent } from './cliente-lista/cliente-lista.component';
import { ClienteFormComponent } from './cliente-form/cliente-form.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    TipoClienteListaComponent,
    TipoClienteCadastroComponent,
    ClienteListaComponent,
    ClienteFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
