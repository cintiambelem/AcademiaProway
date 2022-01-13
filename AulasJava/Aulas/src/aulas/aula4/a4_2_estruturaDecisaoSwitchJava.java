package modulo1.aula4;

import java.util.Scanner;

public class a4_2_estruturaDecisaoSwitchJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("======================================== CapMovie ========================================== \n");
        System.out.println("====================== Bem-Vinde ao MovieCap : Sistema Audiovisual Cap =====================");

        System.out.print("1 - Filme \t\t\t2 - Série  \n3 - Documentário \t4 - Sair\nEscolha o item a ser cadastrado: ");
        int produto = sc.nextInt();

        switch (produto){
            case 1:
                System.out.print("Insira o nome do filme: ");
                String filme = sc.nextLine();
                sc.nextLine();
                System.out.print("Insira o ano de lançamento do filme: ");
                int ano = sc.nextInt();
                System.out.print("Insira a sinopse do filme: ");
                String sinopse = sc.nextLine();
                sc.nextLine();
                System.out.print("Insira o gênero do filme: ");
                String genero = sc.nextLine();
                sc.nextLine();
                break;
            case 2:
                System.out.print("Insira o nome da série: ");
                String serie = sc.nextLine();
                sc.nextLine();
                System.out.print("Insira o ano de lançamento da série: ");
                int anoSerie = sc.nextInt();
                System.out.print("Insira o nome da produtora: ");
                String produtora = sc.nextLine();
                sc.nextLine();
                break;
            case 3:
                System.out.print("Insira o nome do documentário: ");
                String doc = sc.nextLine();
                sc.nextLine();
                System.out.print("Insira o ano de lançamento do documentário: ");
                int anoDoc = sc.nextInt();
                System.out.print("Insira o tema do documentário: ");
                String tema = sc.nextLine();
                sc.nextLine();
                break;
            case 4:
                System.out.print("Bye bye (:");
            default:
                System.out.println("Opção inválida.");
        }
    }
}
