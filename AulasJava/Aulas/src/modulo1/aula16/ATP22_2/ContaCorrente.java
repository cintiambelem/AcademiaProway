package modulo1.aula16.ATP22_2;

public class ContaCorrente {

    private double saldo, taxaSaque = 1.50;
    private int codigoCliente;

    public ContaCorrente(double saldo, int codigoCliente) {
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

    public double saque(double valor) {
        this.saldo = (this.saldo - valor) - taxaSaque;
        return this.saldo;
    }

    public double deposito(double valor) {
        this.saldo = this.saldo + valor;
        return saldo;
    }

    @Override
    public String toString() {
        String resultado = "saldo: " + this.saldo + "| Taxa de saque: " + this.taxaSaque + "| Codigo cliente: "
                + this.codigoCliente;
        return resultado;
    }

}
