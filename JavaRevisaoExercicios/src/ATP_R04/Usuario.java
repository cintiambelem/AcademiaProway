/*_  Crie uma classe Usuário com os atributos privados: código, nome completo, email e senha.
_  Crie os métodos getters e setters para todos os atributos privados, exceto o atributo senha que deve possuir apenas o método setter.
_  Crie uma classe Main com um método principal main.
_  Crie dois objetos da classe Usuário e execute os métodos settter para definir valores diferentes à cada objeto.
_  Imprima os dados dos dois objetos ao final da execução utilizando os métodos getters.*/

package src.ATP_R04;

public class Usuario {

    private int codigo, senha;
    private String nomeCompleto, email;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
