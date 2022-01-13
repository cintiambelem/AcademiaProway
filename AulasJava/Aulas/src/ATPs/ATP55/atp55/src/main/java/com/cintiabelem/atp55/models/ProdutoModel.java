package com.cintiabelem.atp55.models;

public class ProdutoModel {
    private String nome;
    private float valor;
    private int id_categoria;

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public int getId_categoria() {
        return this.id_categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getValor() {
        return this.valor;
    }
}
