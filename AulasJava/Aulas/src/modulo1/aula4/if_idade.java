package modulo1.aula4;

import java.util.Scanner;

public class if_idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do cliente: ");
        byte idade = sc.nextByte();

        if (idade < 18) {
            System.out.println("=== Cliente não pode ser cadastrado. ===");
        } else {
            System.out.print("Digite o nome do cliente: ");
            String nome = sc.next();

            System.out.print("Digite o sobrenome do cliente: ");
            String sobrenome = sc.next();

            System.out.println("\n===Cliente cadastrado com sucesso!===\n");
            System.out.printf("Nome = %s %s \n", nome, sobrenome);
            System.out.printf("Idade = %d", idade);
        }
    }
}
