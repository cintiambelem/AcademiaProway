package com.cintiabelem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cintiabelem.model.Categoria;

public class CategoriaDao {

    private EntityManager entityManager;

    public CategoriaDao() {
        // jpa criando a fabrica de conexão
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula43");
        // criando a conexão com o banco
        this.entityManager = factory.createEntityManager();
    }

    public void create(Categoria model) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();

    }

    public List<Categoria> read() {
        // comunicação com o banco de dados: no from colocar o nome da classe model
        return this.entityManager.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();

    }

}
