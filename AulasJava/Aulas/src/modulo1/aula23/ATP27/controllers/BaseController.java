package ATP27.controllers;

import java.util.ArrayList;

public class BaseController<T> {
    private ArrayList<T> dados;

    public BaseController() {
        this.dados = new ArrayList<T>();
    }


    public int size(){
        return dados.size();
    }

    public void create(T obj){
        dados.add(obj);
    }

    public ArrayList<T> read(){
        return this.dados;
    }

    public void update(T obj){
        if (contains(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }
    public void delete(T obj){
        this.dados.remove(obj);
    }


    public boolean contains(T obj){
        return this.dados.contains(obj);
    }
}
