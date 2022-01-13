package com.cintiabelem.atp63.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
public class Agencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numAgencia;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumAgencia() {
        return this.numAgencia;
    }

    
}
