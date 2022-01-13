// Crie uma classe Carro com uma herança da classe Veículo e que contenha os seguintes atributos privados: Numero de portas, capacidade de porta-malas e número de passageiros. 
package src.ATP_R05;

public class Carro extends Veiculo {

    private int numPortas, numPass, capacidadePM;

    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    public int getNumPass() {
        return this.numPass;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return this.numPortas;
    }

    public void setCapacidadePM(int capacidadePM) {
        this.capacidadePM = capacidadePM;
    }

    public int getCapacidadePM() {
        return this.capacidadePM;
    }

}
