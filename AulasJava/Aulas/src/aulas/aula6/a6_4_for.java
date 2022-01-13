package modulo1.aula6;

import java.util.Scanner;

// for(int cont = 0; cont < 10; cont++) -> o for está incrementando a variavel cont até que a condição cont<10 seja atendida

public class a6_4_for {

    public static void main(String[] args) {

//inclusão de 4 nomes e sobrenomes dentro de um for

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < 5; i++) {
            System.out.printf("insira o nome do usuário %d: ", i);
            String nome = sc.nextLine();
            System.out.printf("insira o sobrenome do usuário %d: ", i);
            String sobrenome = sc.nextLine();

            System.out.println("== Parabéns! Laço de nome e sobrenome concluído! == ");
        }
    }
}
