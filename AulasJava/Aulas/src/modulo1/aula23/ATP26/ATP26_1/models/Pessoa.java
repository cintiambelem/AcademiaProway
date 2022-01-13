package ATP26.models;

public class Pessoa {
    public String nome, sobrenome;
    public int idade;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa) {
            Pessoa pessoa1 = (Pessoa) obj;
            if (this.nome.equals(pessoa1.nome) && this.sobrenome.equals(pessoa1.sobrenome)
                    && this.idade == (pessoa1.idade)) {
                return true;
            }
        } 
        return false;
    }

    @Override
    public String toString() {

        String mensagem = "Nome: " + this.nome + "\n" + "Sobrenome: " + sobrenome + "\n" + "Idade: " + idade + "\n";
        return mensagem;

    }

}
