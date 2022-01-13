package com.cintiabelem;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cintiabelem.dao.CategoriaDao;
import com.cintiabelem.model.Categoria;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();

        // testando update
        model.setId(16);
        model.setNome("teste 26-11");
        dao.update(model);

        // testando create
        model.setNome("teste da atp60");
        dao.create(model);

        // testando delete
        dao.delete(16);


        //testando read
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n", categoria.getId(), categoria.getNome());
        }
    }
}
