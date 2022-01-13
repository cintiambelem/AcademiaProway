package modulo1.aula11.ATP15;

public class Pessoa {

    String nome;
    String sobrenome;
    int idade;


    public void imprimirPessoa() {
        System.out.println("Cadastro realizado!");
        System.out.printf("Nome: %s %s \n", nome, sobrenome);
        System.out.printf("Idade: %d\n", idade);
    }
}
