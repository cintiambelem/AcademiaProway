package com.cintiabelem;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cintiabelem.model.Categoria;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Categoria model = new Categoria();
        model.setNome("atp59");

       EntityManagerFactory factory = Persistence.createEntityManagerFactory("atp59");
       EntityManager em = factory.createEntityManager();

       em.getTransaction().begin();
       em.persist(model);
       em.getTransaction().commit();

       List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();

        for (Categoria categoria : lista) {
            System.out.printf("%d - %s\n", categoria.getId(), categoria.getNome());
        }
    }
}
