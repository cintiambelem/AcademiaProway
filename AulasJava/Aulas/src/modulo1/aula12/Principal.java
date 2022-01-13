package modulo1.aula12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Feito();
    }





    static int menu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("========= Calculadora de Taxas ========= \n");
        System.out.println("\t 1 - taxa transferencia \n\t2 - taxa saque");
        System.out.println("============================================");
        System.out.print("Escolha uma opção do menu: ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    static void Feito() {

        CalculadoraTaxas taxa = new CalculadoraTaxas();

        // taxa de transferencia
        double taxaT = taxa.taxaTransferencia(1000);
        System.out.println(taxaT);

       /* for (int i = 1; i < 11; i++) {
            double taxaS = taxa.taxaSaque();
            System.out.printf("Taxa de saque do saque %d: %.2f \n", i, taxaS);
        }*/
    }
}
