package modulo1.aula12;

public class CalculadoraTaxas {

    private int qtdSaque;
    private double taxa = 0.00001;
    private double taxaTransferencia;

    public double taxaTransferencia(double valor) {
        taxaTransferencia = valor * taxa;
        return taxaTransferencia;
    }

    public double taxaSaque() {
        qtdSaque++;
        if (qtdSaque % 5 == 0) {
            return 1.30;
        }
        return 0.0;
    }

}
