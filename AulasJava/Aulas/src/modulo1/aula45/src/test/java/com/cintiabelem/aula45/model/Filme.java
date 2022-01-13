package com.cintiabelem.aula45.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String  genero;

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }   

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    
}
