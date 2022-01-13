package ATP26.controllers;

import java.util.ArrayList;

import ATP26.models.Pessoa;

public class PessoaController {
    private ArrayList<Pessoa> dados;

    
    public PessoaController() {
        this.dados = new ArrayList<Pessoa>();
    }

    public void create(Pessoa obj) {
        this.dados.add(obj);
    }

    public int size() {
        return this.dados.size();
    }

    public void delete(Pessoa obj) {
        this.dados.remove(obj);
    }

    public ArrayList<Pessoa> read(Pessoa obj) {
        return this.dados;
    }

    public void update(Pessoa obj){
        if (contains(obj)){
            this.delete(obj);
            this.create(obj);
        }
        
    }

    public boolean contains(Pessoa obj){
        return this.dados.contains(obj);
    }

   

}
