package modulo1.aula15.atp21;

public class ContaCorrente extends Conta {
    private double taxaTransfererencia = 10.50;
    private double taxaManutencao = 2.50;
    private double numeroTransferencias = 0;

    @Override
    public void transferencia(double valor) {
        super.transferencia(valor);
        double saldoAtual = this.getSaldo() - taxaTransfererencia;
        this.setSaldo(saldoAtual);

        numeroTransferencias++;

        if (numeroTransferencias % 5 == 0) {
            saldoAtual = this.getSaldo() - taxaManutencao;
            this.setSaldo(saldoAtual);
        }
    }

}
