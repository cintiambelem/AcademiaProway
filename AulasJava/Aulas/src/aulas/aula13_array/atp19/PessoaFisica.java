package modulo1.aula13_array.atp19;

public class PessoaFisica {

    private String nome;
    private String sobrenome;
    private String cpf;
    private int rg, idade, codigo;

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getRg() {
        return rg;
    }




    
}
