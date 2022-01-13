package modulo1.aula3;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================Cadastro de clientes=====================\n");
        System.out.println("Bem-vindo, Digite as informações do cliente: ");
        System.out.printf("Digite o nome do cliente: ");
        String nome = sc.next();
        System.out.print("Digite a idade do cliente: ");
        short idade = sc.nextShort();
        System.out.print("Digite a altura do cliente: ");
        short altura = sc.nextShort();

        System.out.printf("O cliente %s de idade %d anos, de altura %d, foi cadastrado com sucesso", nome, idade, altura);
    }
}
