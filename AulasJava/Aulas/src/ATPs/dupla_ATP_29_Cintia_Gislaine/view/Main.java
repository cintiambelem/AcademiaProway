package view;

import java.util.Scanner;

import controllers.CategoriaController;
import controllers.ProdutoController;
import models.Produto;

public class Main {

    static ProdutoController pcontroller = new ProdutoController();
    static CategoriaController ccontroller = new CategoriaController();

    public static void main(String[] args) {

        Produto p1 = new Produto();
        int opcao = 0;

        Scanner sc = new Scanner(System.in);

        do {
            menu();
            opcao = escolhaOpcao();

            switch (opcao) {

            case 1:

                cadastrar();
                break;

            case 2:

                op2_listar(pcontroller);
                break;

            case 3:

                System.out.println("Digite o ID do produto: ");
                p1.id = Integer.parseInt(sc.nextLine());
                pcontroller.update(p1);
                sc.close();

                break;
            }

        } while (opcao >= 1 && opcao < 5);
    }

    public static void menu() {
        System.out.println("----------MENU-------\n");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Mostrar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Deletar");
    }

    public static int escolhaOpcao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a opção: ");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }



    public static void op2_listar(Object obj) {
        if (obj instanceof ProdutoController) {
            ProdutoController p1 = (ProdutoController) obj;
            for (Produto prod1 : p1.read()) {
                System.out.println(prod1);
            }
        }
    }




    public static void op3_update(Object obj) {
        System.out.println("Digite o ID do produto: ");
        Produto p1 = new Produto();
        Scanner sc = new Scanner(System.in);
        p1.id = Integer.parseInt(sc.nextLine());
        ProdutoController pcontroller = (ProdutoController) obj;
        pcontroller.update(p1);
        sc.close();

    }



    public static void cadastrar() {
        Produto prod = new Produto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastro de produto: ");
        System.out.println("Digite id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Digite nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite descrição: ");
        String descricao = sc.nextLine();
        System.out.println("Digite categoria: ");
        String descategoria = sc.nextLine();

        prod.id = id;
        prod.nome = nome;
        prod.descricaoProd = descricao;
        prod.categoria.descricaoCat = descategoria;

        pcontroller.add(prod);

        System.out.println("Produto cadastrado com sucesso.");
    }

    try {
        
    } catch (Exception e) {
        //TODO: handle exception
    }
}
