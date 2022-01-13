/*  Crie um método para imprimir um cabeçalho. O método deve receber um parâmetro do tipo string, concatenar o valor do parâmetro com cinco asteriscos de cada lado mais uma quebra de linha no início e outra no fim, ao fim o método deve imprimir a string concatenada em um println.
_  Crie um método para imprimir um menu. O método não deve receber nenhum parâmetro. Deve imprimir 4 opções para o usuário, cada uma em uma linha. Ao final da execução o método deve retornar o valor digitado pelo usuário. */

package src.ATP_R02;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        cabecalho("Cabeçalho");

        menu();
    }

    public static void cabecalho(String mensagem) {
        mensagem = "\n*****" + mensagem + "*****\n";
        System.out.println(mensagem);
    }

    public static void menu() {
        System.out.println("\n1 - Opção 1\n2 - Opção 2\n3 - Opção 3 \n4 - Opção4 \nEscolha uma opção: ");
        int opcao = Integer.parseInt(sc.nextLine());
        System.out.printf("Opcao escolhida: %d", opcao);
    }

}
