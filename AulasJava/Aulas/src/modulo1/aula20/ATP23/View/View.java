package modulo1.aula20.ATP23.View;

import java.util.ArrayList;
import java.util.Scanner;

import modulo1.aula20.ATP23.Controller.LivroController;
import modulo1.aula20.ATP23.Model.Livro;

public class View {
    public static void main(String[] args) {
        LivroController controller = new LivroController();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            opcao = menu(sc);

            switch (opcao) {
                case 1:
                    cadastrar(controller, sc);

                    break;

                case 2:
                    listar(controller);
                    break;

                case 3:
                    update(sc);
                    

                    break;

                case 4:
                    break;

                default:
                    break;
            }
        } while (opcao != 0);

    }

    private static void update(Scanner sc) {
        LivroController lc = new LivroController();
        Livro livro1 = new Livro();
        System.out.println("Isira o ID o livro a ser atualizado: ");
        livro1.setId(Integer.parseInt(sc.nextLine()));
    }

    private static void cadastrar(LivroController controller, Scanner sc) {
        Livro livro1 = new Livro();
        System.out.println("Digite o título do livro: ");
        livro1.setTitulo(sc.nextLine());
        System.out.println("Digite o nome do autor: ");
        livro1.setNomeAutoria(sc.nextLine());
        System.out.println("Digite o sobrenome do autor: ");
        livro1.setSobrenomeAutoria(sc.nextLine());
        System.out.println("Digite o ID do livro: ");
        livro1.setId(Integer.parseInt(sc.nextLine()));
        controller.create(livro1);
    }

    private static int menu(Scanner sc) {
        System.out.printf(
                "1 - Cadastrar livro \n2 - Listar livros \n3 - Atualizar livro \n4 - Remover livro \nEscolha uma opção: ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    private static void listar(LivroController controller) {
        ArrayList<Livro> lista = controller.read();
        for (Livro lvr : lista) {
            System.out.println(lvr.getSobrenomeAutoria().toUpperCase() + ", " + lvr.getNomeAutoria() + ". "
                    + lvr.getTitulo() + ".");

        }

    }

    
}
