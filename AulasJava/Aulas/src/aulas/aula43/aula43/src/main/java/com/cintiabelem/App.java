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

        model.setNome("teste da aula2511-2");
        dao.create(model);

        // jpa criando a fabrica de conexão
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula43");
        // criando a conexão com o banco
        EntityManager em = factory.createEntityManager();

       

        // comunicação com o banco de dados: no from colocar o nome da classe model

        

        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n", categoria.getId(), categoria.getNome());
        }
        //
        // em.createQuery("SELECT c.Id FROM Categoria c"); -> chamando o Id que está na
        // model e nao no banco

    }
}
