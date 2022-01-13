package modulo1.aula3;

import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================== ProCap ======================================= \n");
        System.out.println("====================== Bem-Vinde ao ProCap : Cadastro de produtos ===================== \n");

        System.out.print("Insira o nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Insira o modelo do produto: ");
        String descricaoProd = sc.nextLine();

        System.out.print("Insira a categoria do produto: ");
        String categoria = sc.next();
        System.out.print("Insira o valor do produto: ");
        int valor = sc.nextInt();

        System.out.printf("\nProduto cadastrado com sucesso. :)\n \n");

        System.out.println("============= ProCap =============");
        System.out.printf("\n\tProduto   === %s", produto, "\n");
        System.out.printf("\n\tDescrição === %s", descricaoProd, "\n");
        System.out.printf("\n\tCategoria === %s",categoria,"\n");
        System.out.printf("\n\tValor     === %d reais", valor);


    }
}
