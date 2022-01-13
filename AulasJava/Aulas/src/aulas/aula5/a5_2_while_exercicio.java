package modulo1.aula5;

import java.util.Scanner;

public class a5_2_while_exercicio {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("======================================== CapClient =========================================== \n");
        System.out.println("====================== Bem-Vinde ao CapClient : Cadastro de clientes Cap =====================");

        System.out.print("1 - Cadastrar cliente \t\t2 - Listar clientes  \t\t3 - Sair \nEscolha a opção desejada: ");

        int op = sc.nextInt();
        sc.nextLine();
        String nome = "";
        String sobrenome = "";

        switch (op) {
            case 1:
                boolean invalido = true;
                do {
                    System.out.print("Insira o nome do cliente: ");
                    nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("O nome deve ter pelo menos 3 caracteres.");
                    } else {
                        invalido = false;
                    }
                }    while (invalido);
                invalido = true;
                do {
                    System.out.print("Insira o sobrenome do cliente: ");
                    sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve ter pelo menos 3 caracteres.");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                invalido = true;
                do {
                    System.out.print("Insira o RG do cliente: ");
                    String numRG = sc.nextLine();
                    if (numRG.length() < 9) {
                        System.out.println("O número de RG deve ter pelo menos 9 números.");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                invalido = true;
                do {
                    System.out.print("Insira o CPF do cliente: ");
                    String numCPF = sc.nextLine();
                    if (numCPF.length() < 12) {
                        System.out.println("O número de CPF deve ter pelo menos 12 números.");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                System.out.print("Cliente cadastrado com sucesso.");
                break;

            case 2:
                System.out.printf("Cliente === %s %s", nome, sobrenome);
                break;

            case 3:
                System.out.print("Bye bye (:");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}


