package controllers;

import java.util.ArrayList;

public class BaseIdController<T> {
    public ArrayList<T> lista;

    public BaseIdController() {
        lista = new ArrayList<T>();
    }

    public void create(T obj) {
        this.lista.add(obj);
    }

    public ArrayList<T> read() {
        return this.lista;
    }

    public void delete(T obj){
        this.lista.remove(obj);
    }

    public boolean contains(T obj) {
        return this.lista.contains(obj);
   }

   public void listar(ArrayList<T> lista){
       for (T t : lista) {
           System.out.println(t);
       }
   }

   public void update(T obj) {
       if(contains(obj)){
           delete(obj);
           create(obj);
       }
       
   }
}
