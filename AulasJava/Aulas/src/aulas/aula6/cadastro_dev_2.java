package modulo1.aula6;

import java.util.Scanner;

public class cadastro_dev_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean invalido = true;

        System.out.println(" Bem-vindo a área de cadastros! \n");
        System.out.println("Selecione a opção desejada \n");

        System.out.println("\t 1 - Cadastrar Desenvolvedor(a)");
        System.out.println("\t 2 - Cadastrar Linguagem");
        System.out.println("\t 3 - Sair");

        int opcao = sc.nextInt();
        sc.nextLine();
        //int opcLing = sc.nextInt();
        // sc.nextLine();

        switch (opcao) {
            case 1:
                String nome = "";
                String sobrenome = "";
                int idade;

                System.out.println("Cadastro de Dev");
                do {
                    System.out.println("Digite seu nome: \n");
                    nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("O nome deve conter mais de 3 caracteres.");
                        System.out.println("Digite novamente seu nome: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                invalido = true;

                do {
                    System.out.println("Digite seu sobrenome: \n");
                    sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve conter mais de 3 caracteres.");
                        System.out.println("Digite novamente seu sobrenome: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                invalido = true;

                do {
                    System.out.println("Digite sua idade: \n");
                    idade = sc.nextInt();
                    sc.nextLine();
                    if (idade <= 0) {
                        System.out.println("A sua idade deve ser maior que zero.");
                        System.out.println("Digite novamente sua idade: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                System.out.println("Digite sua senioridade: ");
                String senioridade = sc.nextLine();
                break;

            case 2:
                String nomeLinguagem = "";
                String descLinguagem = "";
                int aplicLing;

                System.out.println("Cadastro de Linguagem");
                do {
                    System.out.println("Insira a linguagem: ");
                    nomeLinguagem = sc.nextLine();
                    if (nomeLinguagem.length() < 3) {
                        System.out.println("Linguagem inválida. Digite novamente: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                invalido = true;

                System.out.println("Insira a descrição da linguagem: \n");
                descLinguagem = sc.nextLine();

                System.out.println("Insira a aplicação da linguagem: \n");
                System.out.println("1 - Beckend \n");
                System.out.println("2 - Frontedn \n");
                System.out.println("3 - Mobile \n");
                aplicLing = sc.nextInt();



        }


    }

}

