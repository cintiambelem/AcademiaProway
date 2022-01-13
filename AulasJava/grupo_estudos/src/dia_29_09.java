import java.util.Scanner;

// A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e número de filhos. Faça um procedimento que leia esses dados para um número não determinado de pessoas, calcule e exiba a média de salário da população (a condição de parada pode ser um flag ou a quantidade N). Faça um programa que acione o procedimento.

public class dia_29_09 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int pop;
        int salarioPop = 0;
        int popMedia = 0;
        int somatorioPop = 0;
        int salario_total = 0;

        do {
            pop = populacao();
        } while (!validacao(pop));
        for (int i = 0; i < pop; i++) {
            salarioPop = salarioFamilia("Insira o salario da família %d: ", i + 1);

            int filhosPop = numFilhos("Insira o numero de filhos da família %d: ", i + 1);
            popMedia = popMedia + filhosPop;
        }
        popMedia = popMedia + pop;
        salario_total = salarioPop + salario_total;

        int mediaSalarial = mediaSalario(salario_total, popMedia);
        System.out.printf("População entrevistada: %d\n", popMedia);
        //System.out.printf("Salário total da população: %d", salario_total);

        System.out.printf("Média salarial da população: %d", mediaSalarial);

    }

    ////// métodos///////
    static int salarioFamilia(String mensagem, int salarioFam) {
        System.out.printf(mensagem, salarioFam);
        do {
            salarioFam = Integer.parseInt(sc.nextLine());
        } while (!validacao(salarioFam));
        return salarioFam;

    }

    static int numFilhos(String mensagem, int numFilhos) {
        System.out.printf(mensagem, numFilhos);
        numFilhos = Integer.parseInt(sc.nextLine());
        return numFilhos;
    }

    static int mediaSalario(int salario, int filhos) {
        int mediaSalarial = salario / filhos;
        return mediaSalarial;
    }

    static boolean validacao(double salario) {
        if (salario < 0) {
            System.out.printf("O número não pode ser negativo. Insira um valor válido. \n");
            return false;
        } else {
            return true;
        }
    }

    static int populacao() {
        System.out.printf("Insira o número de famílias consultadas: ");
        int populacao = Integer.parseInt(sc.nextLine());
        return populacao;
    }

}
