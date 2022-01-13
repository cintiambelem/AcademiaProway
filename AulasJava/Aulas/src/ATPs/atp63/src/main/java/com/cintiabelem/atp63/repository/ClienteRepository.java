package com.cintiabelem.atp63.repository;

import com.cintiabelem.atp63.model.Clientes;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Clientes, Integer> {
    
}
