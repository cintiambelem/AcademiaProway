package modulo1.aula15.atp21;

import java.util.Random;

public class Teste {

    public static void main(String[] args) {

        Random random = new Random();

        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();

        // setando conta
        c.setSaldo(5000);
        c.setCodigoCliente(954);

        // setando conta corrente
        cc.setSaldo(10000);
        cc.setCodigoCliente(5896);

        // realizando transferencia
        // c.transferencia(65);
        // cc.transferencia(99);

        System.out.printf("\n===== Classe Conta  =====\n");
        System.out.printf("Conta corrente | codigo cliente: %d\n", c.getCodigoCliente());
        System.out.printf("Conta corrente | saldo: %.2f\n", c.getSaldo());
        c.transferencia(65);
        System.out.printf("Conta corrente | saldo: %.2f\n", c.getSaldo());

        System.out.printf("\n===== Classe Conta Corrente =====\n");
        System.out.printf("Conta  | codigo cliente: %d\n", cc.getCodigoCliente());
        System.out.printf("Conta  | saldo: %.2f\n", cc.getSaldo());
        cc.transferencia(99);
        System.out.printf("Conta  | saldo: %.2f\n", cc.getSaldo());

        ///// novos testes /////

        System.out.printf("\n===== Realizando transferencias - CC - Cliente 9674 =====\n");
        cc.setSaldo(1000);
        cc.setCodigoCliente(9674);

        System.out.printf("Conta corrente | codigo cliente: %d\n", cc.getCodigoCliente());
        System.out.printf("Conta corrente | saldo: %.2f\n", cc.getSaldo());

        /*
         * cc.transferencia(10); cc.transferencia(10); cc.transferencia(10);
         * cc.transferencia(10); cc.transferencia(10);
         */
        double transferencias;
        for (int i = 1; i <= 10; i++) {
            cc.transferencia(transferencias = random.nextDouble() * 100);
            System.out.printf("\ntransferencia nº: %d \nvalor da transferencia: %.2f \nConta corrente | saldo: %.2f\n",
                    i, transferencias, cc.getSaldo());

        }

    }

}
