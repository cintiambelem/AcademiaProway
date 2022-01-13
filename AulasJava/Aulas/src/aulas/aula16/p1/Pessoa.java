package modulo1.aula16.p1;

public class Pessoa {

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Classe Pessoa - " + getNome();
    }

}
