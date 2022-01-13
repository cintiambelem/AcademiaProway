package view;

import java.util.Scanner;

import controller.ProdutoController;
import models.Produto;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ProdutoController prodCont = new ProdutoController();
        int op = 0;

        System.out.println("======= Cadastro Produto =======");
        do {
            imprimeMenu();
            op = escolheMenu("Escolha uma opcao:");
            Switch(op, prodCont);
        } while (op != 5);

    }

    public static void imprimeMenu() {
        System.out.println("1 - Criar \n2 - Atualizar \n3 - Listar \n4 - Remover \n5 - Sair\nDigite a opção:");
    }

    public static void Switch(int opcao, ProdutoController prodCont) {
        switch (opcao) {
        case 1:
            System.out.println("=== Criar ====");
            prodCont.create(cadastro());

            break;
        case 2:
            System.out.println("=== Atualizar ====");
            prodCont.update(atualizar());

            break;

        case 3:
            System.out.print("=== Listar ====");

            prodCont.listar(prodCont.read());

            break;

        case 4:
            System.out.print("=== Remover ====");
            prodCont.delete(deletar());

            break;

        case 5:
            System.out.print("Saindo....");

        default:
            break;
        }

    }

    // funcoes crud

    public static void listar(ProdutoController prodCont) {
        for (Produto prod : prodCont.read()) {
            System.out.println(prod);
        }
    }

    public static Produto cadastro() {
        Produto prod1 = new Produto();

        System.out.print("Insira o ID do produto: ");
        prod1.id = Integer.parseInt(sc.nextLine());
        System.out.print("Insira a descricao do produto: ");
        prod1.descProd = sc.nextLine();
        System.out.print("Insira a descricao da categoria do produto: ");
        prod1.categoria.descCat = sc.nextLine();
        return prod1;
    }

    public static Produto atualizar() {
        Produto p = new Produto();
        System.out.print("Insira o ID do produto: ");
        p.id = Integer.parseInt(sc.nextLine());
        return p;

    }

    public static Produto deletar() {
        Produto prod = new Produto();
        System.out.print("Insira o ID: ");
        prod.id = Integer.parseInt(sc.nextLine());
        return prod;

    }

    public static int escolheMenu(String msg) {
        Scanner sc = new Scanner(System.in);
        boolean valido = true;
        int numero = 0;
        do {
            try {
                numero = Integer.parseInt(sc.nextLine());
                valido = true;

            } catch (NumberFormatException e) {
                System.out.print("Opção invalido.\nDigite novamente.\n ");
                valido = false;
            }
        } while (!valido);
        return numero;

    }

}
