package com.cintiabelem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "categoria")
public class Categoria {
    @Id //informando que o ID é a primary key no banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) //informando que o ID é gerado automaticamente no banco
    private int id;
    private String nome;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    
}
