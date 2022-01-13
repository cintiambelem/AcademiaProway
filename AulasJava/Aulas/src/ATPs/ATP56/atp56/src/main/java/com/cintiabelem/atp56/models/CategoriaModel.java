package com.cintiabelem.atp56.models;

public class CategoriaModel {
  
    private String nome;
    private String descricao;
    private int id_categoria;

  

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public int getId_categoria() {
        return this.id_categoria;
    }
    
}
