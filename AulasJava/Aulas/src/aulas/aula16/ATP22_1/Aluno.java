package modulo1.aula16.ATP22_1;

public class Aluno {

    private String nome_completo;
    private int idade, matricula;

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getNome_completo() {
        return this.nome_completo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome_completo + " | Idade: " + this.idade + " | Matrícula: " + this.matricula;
    }

}
