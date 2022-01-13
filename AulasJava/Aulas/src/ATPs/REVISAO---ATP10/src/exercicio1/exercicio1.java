package src.exercicio1;

import java.util.Scanner;

//Crie um programa em linguagem Java que solicita ao usuário que digite a idade,
// armazene em uma variável do tipo byte e imprima uma mensagem para idade maior que 25 anos,
// outra mensagem para idade menor que 25 e uma outra mensagem se idade igual a 25 anos.

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte idade = 0;
        System.out.println("Insira sua idade: ");
        idade = sc.nextByte();

        if (idade > 25) {
            System.out.println("Voce tem mais de 25 anos.");
        } else if (idade < 25) {
            System.out.println("Voce tem menos de 25 anos.");
        } else {
            System.out.println("voce tem 25 anos");
        }

    }

}
