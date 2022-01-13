package modulo1.aula12;

public class Pessoa {

    // técnica de encapsulamento = tornar a variável privada para que nao seja
    // manipulada diretamente, somente dentro de um método. utiliza o set para
    // incluir um valor e o get para chamar.

    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;

    public void setNome(String nome) { // o SET informa qual variável privada será manipulada
        this.nome = nome; // o THIS está se referindo a a variavel criada na classe Pessoa
    }

    public String getNome() {
        return this.nome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
}
