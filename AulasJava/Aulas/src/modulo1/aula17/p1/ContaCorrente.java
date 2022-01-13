package modulo1.aula17.p1;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, String cliente, double taxa){
        super(saldo, cliente);
        this.taxa_manutencao = taxa;

    }
    
}
