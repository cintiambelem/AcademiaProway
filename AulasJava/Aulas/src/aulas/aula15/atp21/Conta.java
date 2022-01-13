package modulo1.aula15.atp21;

public class Conta {
    private double saldo;
    private int codigoCliente;

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferencia(double valor) {
        this.saldo -= valor;
    }

}
