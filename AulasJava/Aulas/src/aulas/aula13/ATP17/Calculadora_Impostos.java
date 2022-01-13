package modulo1.aula13.ATP17;

public class Calculadora_Impostos {

    // métodos de impostos

    private double taxaISS = 0.05;
    private double taxaIOF = 0.01;
    private double taxaIR = 0.15;

    // método ISS
    public double calculoISS(double valor) {
        double resultado = valor * taxaISS;
        return resultado;
    }

    // método IOF
    public double calculoIOF(double valor) {
        double resultado = valor * taxaIOF;
        return resultado;
    }

    // método IR
    public double calculoIR(double valor) {
        double resultado = valor * taxaIR;
        return resultado;
    }

}
