//Crie uma classe Caminhão com uma herança da classe Veículo e que contenha os seguintes atributos privados: capacidade de carga, registro ANTT, tração e se possui semirreboque . 
package src.ATP_R05;

public class Caminhao extends Veiculo {
    private int capacidadeCarga;
    private String tracao, semirreboque, registroANTT;

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    public void setRegistroANTT(String registroANTT) {
        this.registroANTT = registroANTT;
    }
    public String getRegistroANTT() {
        return this.registroANTT;
    }

    public void setSemirreboque(String semirreboque) {
        this.semirreboque = semirreboque;
    }

    public String getSemirreboque() {
        return this.semirreboque;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public String getTracao() {
        return this.tracao;
    }

}
