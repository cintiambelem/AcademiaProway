package models;

public class Produto extends Base {
    public String nome;
    public String descricaoProd;
    public Categoria categoria;

    public Produto(){
        this.categoria = new Categoria();
    }


    @Override
    public String toString() {

        String retorno = "nome: " + nome + "\ndescrição: " + descricaoProd;
        return  retorno;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Produto) {
            Produto prod1 = (Produto) obj;
            if (this.id == prod1.id) {
                return true;
            }
        }
        return false;
    }
}
