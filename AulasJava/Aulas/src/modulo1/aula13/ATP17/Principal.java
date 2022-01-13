package modulo1.aula13.ATP17;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static Calculadora_Impostos CalcImp = new Calculadora_Impostos();

    public static void main(String[] args) {

        // int opcao;
        // int op = menu();

        // escolha_menu(op);

        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        // do {
        //     opcao = retorna_menu();
        //     if (opcao < 1 || opcao > 2) {
        //         System.out.println("Opção inválida. Escolha uma opção válida.");
        //     }
        // } while (opcao < 1 || opcao > 2);
    }

////////////////////////////////////////////// METODOS ///////////////////////////////////////////////////////
    static int menu() {
        int opcao;
        System.out.println("=========== Caculadora de Impostos ===========\n");
        do {
            System.out.print("1 - Cáculo ISS \n2 - Cálculo IOF \n3 - Cálculo IR \nEscolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Escolha uma opção válida. \n");
            }
        } while (opcao < 1 || opcao > 3);
        return opcao;
    }

    static void escolha_menu(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("===== Cálculo de ISS =====");
                double taxaISS = opcaoISS();
                System.out.printf("taxa de ISS calculada: %.2f\n", taxaISS);
                break;

            case 2:
                System.out.println("===== Cálculo de IOF =====");
                double taxaIOF = opcaoIOF();
                System.out.printf("taxa de IOF calculada: %.2f\n", taxaIOF);
                break;

            case 3:
                System.out.println("===== Cálculo de IR =====");
                double taxaIR = opcaoIR();
                System.out.printf("taxa de IR calculada foi: %.2f\n", taxaIR);
                break;
            default:
        }

    }

    static double opcaoISS() {
        System.out.print("Insira o valor a ser calculado: ");
        double valor = Double.parseDouble(sc.nextLine());
        double resultado = CalcImp.calculoISS(valor);
        return resultado;
    }

    static double opcaoIOF() {
        System.out.print("Insira o valor a ser calculado: ");
        double valor = Double.parseDouble(sc.nextLine());
        double resultado = CalcImp.calculoIOF(valor);
        return resultado;
    }

    static double opcaoIR() {
        System.out.print("Insira o valor a ser calculado: ");
        double valor = Double.parseDouble(sc.nextLine());
        double resultado = CalcImp.calculoIR(valor);
        return resultado;
    }

    static int retorna_menu() {
        System.out.println("Deseja realizar outra operação? \n1 - Sim\n2 - Não");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

}
