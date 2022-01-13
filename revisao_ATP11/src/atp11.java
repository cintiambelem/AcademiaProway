/* Crie um programa em linguagem Java que atenda aos seguintes requisitos: 
_ Exiba um cabeçalho com o título “Bradesco Financiamentos”. ok
_ Exiba um menu com as opções, 1 Crédito Pessoal, 2 Crédito Imobiliário, 3 Crédito Empresarial e 4 Empréstimo Consignado.
_ Solicite ao usuário que escolha uma das opções do menu -> SWITCH CASE e caso a opção digitada não seja válida, -> DO WHILE 
o sistema deve imprimir o menu novamente, solicitar que ele digite a opção e validar a resposta 
até que uma opção válida seja digitada.
_ Ao digitar uma opção válida o sistema deve exibir apenas uma mensagem com o nome do módulo,
 nenhuma implementação da funcionalidade do módulo será necessária.
 _ Após exibir a opção correta, o sistema deve perguntar ao usuário se ele deseja voltar ao menu principal (‘V’) 
 ou sair do sistema(‘S’). 
_ O sistema deve ler a opção digitada pelo usuário e validar se ele digitou uma das opções válidas, 
caso contrário deve solicitar que digite novamente até que uma opção válida seja digitada.
_ O sistema deve encaminhar o usuário para o menu principal caso a resposta seja ‘V’ e 
se a opção digitada for ‘S’ o sistema deve encerrar imprimindo uma mensagem de obrigado.

 
 */

package src;

import java.util.Scanner;

public class atp11 {

    public static void main(String[] args) {

        byte opcao;
        char continua = 'N';
        Scanner sc = new Scanner(System.in);

        System.out.println("\n================ Bradeesco Financiamentos ================\n");

        do {
            System.out.print(
                    "1. Crédito Pessoal \n2. Crédito Imobiliário \n3. Crédito Empresarial \n4. Empréstimo Consignado \nEscolha uma opção de crédito: ");
            opcao = Byte.parseByte(sc.nextLine()); 
            

            switch (opcao) {
                case 1:
                    System.out.println("Crédito Pessoal");
                    break;

                case 2:
                    System.out.println("Crédito Imobiliário");
                    break;

                case 3:
                    System.out.println("Crédito Empresarial");
                    break;

                case 4:
                    System.out.println("Empréstimo Consignado");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
                    break;
            }
            if (opcao > 0 && opcao < 5) {
                do {
                    System.out.print("Deseja inserir outra opção (V) ou sair (S)? ");
                    continua = sc.nextLine().toUpperCase().charAt(0);
                } while (continua != 'V' && continua != 'S');
            }
        } while (opcao < 1 || opcao > 4 || continua == 'V');
        System.out.print("Obrigada!");

        sc.close();
    }
}
