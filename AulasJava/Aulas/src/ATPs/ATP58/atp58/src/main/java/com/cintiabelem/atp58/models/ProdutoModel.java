package com.cintiabelem.atp58.models;

public class ProdutoModel {
    private String nome;
    private float valor;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
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
