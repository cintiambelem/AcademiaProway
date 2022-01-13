package modulo1.aula12;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        cabecalho();
        double valor_transferido = valor_transferencia();

        CalculadoraTaxas ct = new CalculadoraTaxas();
        double taxa = ct.taxaTransferencia(valor_transferido);
        System.out.printf("A taxa sobre a transferencia de %.2f é: %.4f", valor_transferido, taxa);

    }

    // cabeçalho

    static void cabecalho() {
        System.out.println("========= Calculadora de Taxas ========= \n");
    }

    static double valor_transferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor a ser transferido: ");
        double valor = Double.parseDouble(sc.nextLine());
        return valor;

    }

}
