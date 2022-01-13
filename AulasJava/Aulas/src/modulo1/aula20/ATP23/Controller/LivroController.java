package modulo1.aula20.ATP23.Controller;

import modulo1.aula20.ATP23.Model.Livro;

import java.util.ArrayList;

public class LivroController {

    private ArrayList<Livro> livros = new ArrayList<Livro>();

    // crud: create read update delete

    public void create(Livro l) {
        this.livros.add(l);
    }

    public ArrayList<Livro> read() {
        return this.livros;
    }

    public void delete(Livro l) {
        this.livros.remove(l);
    }

    public void update(Livro l) {
        for (int i = 0; i < this.livros.size(); i++) {
            livros livro_aux = this.livros.get(i);

            if (livro_aux.getId() == livros.getId()) {
                this.delete(livro_aux);
                this.create(livros);
            }
        }
    }

}
