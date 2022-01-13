// Crie um programa em linguagem Java que atenda aos seguintes requisitos:
//_ Armazene o seu nome completo em duas variáveis, nome e sobrenome
//_ Imprima seu nome 10 vezes no terminal com a função PRINTF usando o laço de repetição FOR utilizando uma variável contadora.

package modulo1.aula7;

import java.util.Scanner;

public class a7_exercicio_for {
    public static void main(String[] args) {


        String nome = "";
        String sobrenome = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        nome = sc.nextLine();

        System.out.print("Insira seu sobrenome: ");
        sobrenome = sc.nextLine();

        for (int contador = 1; contador < 11 ; contador++) {
            System.out.printf("%s %s", nome, sobrenome);

        }

    }
}