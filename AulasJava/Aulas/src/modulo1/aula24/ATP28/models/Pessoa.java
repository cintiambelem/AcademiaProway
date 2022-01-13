package models;

public class Pessoa extends Base {
    public String nome;

    public Endereco enderecoRes;
    public Endereco enderecoCom;
    

    public Pessoa() {
        enderecoRes = new Endereco();
        enderecoCom = new Endereco();
    }

    @Override
    public String toString() {

        return "nome: " + this.nome + "\nendereço residencial " + "\n " + this.enderecoRes.tipoRua + " "
                + this.enderecoRes.rua + "\n endereço comercial: " + this.enderecoCom.rua;
    }

    

}