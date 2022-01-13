package modulo1.aula12.atp18;

public class Conta_Corrente {
    private int agencia;
    private int numeroCC;
    private int codCliente;
    private double saldo;

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumeroCC(int numeroCC) {
        this.numeroCC = numeroCC;
    }

    public int getNumeroCC() {
        return this.numeroCC;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodCliente() {
        return this.codCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

}
