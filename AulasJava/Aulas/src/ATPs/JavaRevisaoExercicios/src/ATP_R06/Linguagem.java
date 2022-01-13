package src.ATP_R06;

import java.sql.Date;

public class Linguagem {

    private String dataCriacao;
    private String nome, tipagem, orientacaoObjeto;

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataCriacao() {
        return this.dataCriacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipagem(String tipagem) {
        this.tipagem = tipagem;
    }
    public String getTipagem() {
        return this.tipagem;
    }

    public void setOrientacaoObjeto(String orientacaoObjeto) {
        this.orientacaoObjeto = orientacaoObjeto;
    }

    public String getOrientacaoObjeto() {
        return this.orientacaoObjeto;
    }

    @Override
    public String toString() {
        String retorno =  this.nome + "\n" + this.dataCriacao + "\n" + this.orientacaoObjeto + "\n" + this.getTipagem();
        return retorno;
        


    }

    public void setDataCriacao(int i) {
    }

    

}
