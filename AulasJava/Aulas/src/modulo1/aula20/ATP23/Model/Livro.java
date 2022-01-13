package modulo1.aula20.ATP23.Model;

public class Livro {
    private int id;
    private String nomeAutoria;
    private String sobrenomeAutoria;
    private String titulo;

    public void setNomeAutoria(String nomeAutoria) {
        this.nomeAutoria = nomeAutoria;
    }

    public String getNomeAutoria() {
        return this.nomeAutoria;
    }

    public void setSobrenomeAutoria(String sobrenomeAutoria) {
        this.sobrenomeAutoria = sobrenomeAutoria;
    }

    public String getSobrenomeAutoria() {
        return this.sobrenomeAutoria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override // método para comparar e remover se for igual
    public boolean equals(Object obj) {
        Livro livro_auxiliar = (Livro) obj; // criando um objeto novo para poder comparar
        if (this.id == livro_auxiliar.id) {
            return true;
        } 
        else {
            return false;
        }
    }

}
