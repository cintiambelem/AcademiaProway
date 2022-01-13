package aula23.ATP26.ATP26_1;

import java.util.ArrayList;

public class AlunoController {
    private ArrayList<Object> dados;

    
    public AlunoController() {
        this.dados = new ArrayList<Object>();
    }

    public void add(Object obj) {
        this.dados.add(obj);
    }

    public int size() {
        return this.dados.size();
    }

    public void remove(Object obj) {
        this.dados.remove(obj);
    }

    public boolean contains(Object obj) {
        return this.dados.contains(obj);
    }

}
