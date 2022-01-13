//_ Crie um programa em linguagem Java que solicita ao usuário que digite o salário, 
//armazene em uma variável do tipo double e imprima uma mensagem caso o salário seja maior que R$ 1997,58, 
//outra mensagem se o salário for maior que R$5399,99 
//e outra mensagem se o salário digitado for menor ou igual a zero. 
//Caso o salário seja menor igual a zero o sistema deve solicitar que o usuário digite o salário novamente 
//para então realizar as validações de faixas salariais mais uma vez até que o usuário digite um valor 
//acima de zero.

package src.exercicio2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        double salario = 0.0;
        Scanner sc = new Scanner(System.in);

        boolean valido = true;
        do {
            System.out.println("Digite seu salário: ");
            salario = sc.nextDouble();
            if (salario == 0 || salario < 0) {
                valido = false;
                System.out.print("Salario invalido. Insira um salario maior que 0. Digite novamente: ");
            } else {
                valido = true;
            }
        } while (!valido);

        if (salario > 1997.58 && salario < 5399.99) {
            System.out.println("Seu salario é superior a 1997,58.");
        } else if (salario < 1997.58) {
            System.out.println("Seu salario é inferior a 1997,58.");
        } else if (salario > 5399.99) {
            System.out.println("Seu salario é superior a 5399,99.");
        }

    }
}
